package typings.winrtUwp.Windows.UI.WebUI

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages an app suspension operation. */
trait SuspendingOperation extends StObject {
  
  /** Gets the time remaining before a delayed app suspension operation continues. */
  var deadline: Date
  
  /**
    * Requests that the app suspension operation be delayed.
    * @return The suspension deferral.
    */
  def getDeferral(): typings.winrtUwp.Windows.ApplicationModel.SuspendingDeferral
}
object SuspendingOperation {
  
  @scala.inline
  def apply(deadline: Date, getDeferral: () => typings.winrtUwp.Windows.ApplicationModel.SuspendingDeferral): SuspendingOperation = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[SuspendingOperation]
  }
  
  @scala.inline
  implicit class SuspendingOperationMutableBuilder[Self <: SuspendingOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeadline(value: Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDeferral(value: () => typings.winrtUwp.Windows.ApplicationModel.SuspendingDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
  }
}
