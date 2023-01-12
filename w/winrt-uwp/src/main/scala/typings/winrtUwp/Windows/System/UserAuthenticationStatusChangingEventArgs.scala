package typings.winrtUwp.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for a user authentication status changing event. */
trait UserAuthenticationStatusChangingEventArgs extends StObject {
  
  /** Gets the user's current authentication status. */
  var currentStatus: UserAuthenticationStatus
  
  /**
    * Requests a delay before the user's authentication status changes.
    * @return The user authentication status change deferral.
    */
  def getDeferral(): UserAuthenticationStatusChangeDeferral
  
  /** Gets the user's new authentication status. */
  var newStatus: UserAuthenticationStatus
  
  /** Gets the user. */
  var user: User
}
object UserAuthenticationStatusChangingEventArgs {
  
  inline def apply(
    currentStatus: UserAuthenticationStatus,
    getDeferral: () => UserAuthenticationStatusChangeDeferral,
    newStatus: UserAuthenticationStatus,
    user: User
  ): UserAuthenticationStatusChangingEventArgs = {
    val __obj = js.Dynamic.literal(currentStatus = currentStatus.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), newStatus = newStatus.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAuthenticationStatusChangingEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserAuthenticationStatusChangingEventArgs] (val x: Self) extends AnyVal {
    
    inline def setCurrentStatus(value: UserAuthenticationStatus): Self = StObject.set(x, "currentStatus", value.asInstanceOf[js.Any])
    
    inline def setGetDeferral(value: () => UserAuthenticationStatusChangeDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    inline def setNewStatus(value: UserAuthenticationStatus): Self = StObject.set(x, "newStatus", value.asInstanceOf[js.Any])
    
    inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
