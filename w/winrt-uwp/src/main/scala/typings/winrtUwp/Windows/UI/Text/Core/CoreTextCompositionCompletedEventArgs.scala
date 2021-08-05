package typings.winrtUwp.Windows.UI.Text.Core

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.Deferral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the CompositionCompleted event. */
trait CoreTextCompositionCompletedEventArgs extends StObject {
  
  /** Gets a collection of CoreTextCompositionSegment objects representing the segments in the composition string. Applications can use this property, for example, to get the pre-conversion string for each composition segment. */
  var compositionSegments: IVectorView[CoreTextCompositionSegment]
  
  /**
    * Requests that the operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
    * @return A Deferral object.
    */
  def getDeferral(): Deferral
  
  /** Gets a value that indicates whether the operation is canceled. */
  var isCanceled: Boolean
}
object CoreTextCompositionCompletedEventArgs {
  
  inline def apply(
    compositionSegments: IVectorView[CoreTextCompositionSegment],
    getDeferral: () => Deferral,
    isCanceled: Boolean
  ): CoreTextCompositionCompletedEventArgs = {
    val __obj = js.Dynamic.literal(compositionSegments = compositionSegments.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), isCanceled = isCanceled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextCompositionCompletedEventArgs]
  }
  
  extension [Self <: CoreTextCompositionCompletedEventArgs](x: Self) {
    
    inline def setCompositionSegments(value: IVectorView[CoreTextCompositionSegment]): Self = StObject.set(x, "compositionSegments", value.asInstanceOf[js.Any])
    
    inline def setGetDeferral(value: () => Deferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    inline def setIsCanceled(value: Boolean): Self = StObject.set(x, "isCanceled", value.asInstanceOf[js.Any])
  }
}
