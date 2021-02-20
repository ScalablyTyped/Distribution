package typings.winrtUwp.Windows.ApplicationModel.Calls

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Controls the removal of an app from the lock screen. */
@js.native
trait LockScreenCallEndRequestedEventArgs extends StObject {
  
  /** Gets the deadline by which the app must complete the deferral. */
  var deadline: Date = js.native
  
  /**
    * Requests to defer the default behavior of removing the app from the lock screen.
    * @return When this method completes, it returns a LockScreenCallEndCallDeferral object that signals when the app no longer needs to defer the removal of itself from the lock screen.
    */
  def getDeferral(): LockScreenCallEndCallDeferral = js.native
}
object LockScreenCallEndRequestedEventArgs {
  
  @scala.inline
  def apply(deadline: Date, getDeferral: () => LockScreenCallEndCallDeferral): LockScreenCallEndRequestedEventArgs = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[LockScreenCallEndRequestedEventArgs]
  }
  
  @scala.inline
  implicit class LockScreenCallEndRequestedEventArgsMutableBuilder[Self <: LockScreenCallEndRequestedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeadline(value: Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDeferral(value: () => LockScreenCallEndCallDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
  }
}
