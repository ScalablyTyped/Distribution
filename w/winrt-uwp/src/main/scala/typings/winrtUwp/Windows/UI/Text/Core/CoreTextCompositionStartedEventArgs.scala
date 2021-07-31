package typings.winrtUwp.Windows.UI.Text.Core

import typings.winrtUwp.Windows.Foundation.Deferral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the CompositionStarted event. */
trait CoreTextCompositionStartedEventArgs extends StObject {
  
  /**
    * Requests that the operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
    * @return A Deferral object.
    */
  def getDeferral(): Deferral
  
  /** Gets a value that indicates whether the operation is canceled. */
  var isCanceled: Boolean
}
object CoreTextCompositionStartedEventArgs {
  
  @scala.inline
  def apply(getDeferral: () => Deferral, isCanceled: Boolean): CoreTextCompositionStartedEventArgs = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), isCanceled = isCanceled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextCompositionStartedEventArgs]
  }
  
  @scala.inline
  implicit class CoreTextCompositionStartedEventArgsMutableBuilder[Self <: CoreTextCompositionStartedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDeferral(value: () => Deferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsCanceled(value: Boolean): Self = StObject.set(x, "isCanceled", value.asInstanceOf[js.Any])
  }
}
