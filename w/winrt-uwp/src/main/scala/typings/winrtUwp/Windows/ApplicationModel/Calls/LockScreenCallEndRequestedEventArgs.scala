package typings.winrtUwp.Windows.ApplicationModel.Calls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Controls the removal of an app from the lock screen. */
trait LockScreenCallEndRequestedEventArgs extends StObject {
  
  /** Gets the deadline by which the app must complete the deferral. */
  var deadline: js.Date
  
  /**
    * Requests to defer the default behavior of removing the app from the lock screen.
    * @return When this method completes, it returns a LockScreenCallEndCallDeferral object that signals when the app no longer needs to defer the removal of itself from the lock screen.
    */
  def getDeferral(): LockScreenCallEndCallDeferral
}
object LockScreenCallEndRequestedEventArgs {
  
  inline def apply(deadline: js.Date, getDeferral: () => LockScreenCallEndCallDeferral): LockScreenCallEndRequestedEventArgs = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[LockScreenCallEndRequestedEventArgs]
  }
  
  extension [Self <: LockScreenCallEndRequestedEventArgs](x: Self) {
    
    inline def setDeadline(value: js.Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    inline def setGetDeferral(value: () => LockScreenCallEndCallDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
  }
}
