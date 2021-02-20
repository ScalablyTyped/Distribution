package typings.winrtUwp.Windows.UI.Text.Core

import typings.winrtUwp.Windows.Foundation.Deferral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents information about a TextRequested event. */
@js.native
trait CoreTextTextRequest extends StObject {
  
  /**
    * Requests that the text request operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
    * @return A Deferral object.
    */
  def getDeferral(): Deferral = js.native
  
  /** Gets a value that indicates whether the text request operation is canceled. */
  var isCanceled: Boolean = js.native
  
  /** Gets a value that indicates the range of text being requested by the text input server. The server populates this property before raising the event. */
  var range: CoreTextRange = js.native
  
  /** Gets or sets the text that the text input server is requesting. The application should set the text being requested before returning from the event handler. */
  var text: String = js.native
}
object CoreTextTextRequest {
  
  @scala.inline
  def apply(getDeferral: () => Deferral, isCanceled: Boolean, range: CoreTextRange, text: String): CoreTextTextRequest = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), isCanceled = isCanceled.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextTextRequest]
  }
  
  @scala.inline
  implicit class CoreTextTextRequestMutableBuilder[Self <: CoreTextTextRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDeferral(value: () => Deferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsCanceled(value: Boolean): Self = StObject.set(x, "isCanceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: CoreTextRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
