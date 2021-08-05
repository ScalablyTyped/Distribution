package typings.winrtUwp.Windows.UI.Text.Core

import typings.winrtUwp.Windows.Foundation.Deferral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents information about a LayoutRequested event. */
trait CoreTextLayoutRequest extends StObject {
  
  /**
    * Requests that the layout request operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
    * @return A Deferral object.
    */
  def getDeferral(): Deferral
  
  /** Gets a value that indicates whether the layout request operation is canceled. */
  var isCanceled: Boolean
  
  /** Gets an object that represents the layout bounds information requested by the text input server. The application should populate the properties of this object to the layout bounds being requested before returning from the event handler. */
  var layoutBounds: CoreTextLayoutBounds
  
  /** Gets a value that indicates the range of text whose bounding box is being requested by the text input server. The server populates this property before raising the event. */
  var range: CoreTextRange
}
object CoreTextLayoutRequest {
  
  inline def apply(
    getDeferral: () => Deferral,
    isCanceled: Boolean,
    layoutBounds: CoreTextLayoutBounds,
    range: CoreTextRange
  ): CoreTextLayoutRequest = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), isCanceled = isCanceled.asInstanceOf[js.Any], layoutBounds = layoutBounds.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextLayoutRequest]
  }
  
  extension [Self <: CoreTextLayoutRequest](x: Self) {
    
    inline def setGetDeferral(value: () => Deferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    inline def setIsCanceled(value: Boolean): Self = StObject.set(x, "isCanceled", value.asInstanceOf[js.Any])
    
    inline def setLayoutBounds(value: CoreTextLayoutBounds): Self = StObject.set(x, "layoutBounds", value.asInstanceOf[js.Any])
    
    inline def setRange(value: CoreTextRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
