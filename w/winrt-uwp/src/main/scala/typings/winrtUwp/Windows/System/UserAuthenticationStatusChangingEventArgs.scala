package typings.winrtUwp.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for a user authentication status changing event. */
@js.native
trait UserAuthenticationStatusChangingEventArgs extends StObject {
  
  /** Gets the user's current authentication status. */
  var currentStatus: UserAuthenticationStatus = js.native
  
  /**
    * Requests a delay before the user's authentication status changes.
    * @return The user authentication status change deferral.
    */
  def getDeferral(): UserAuthenticationStatusChangeDeferral = js.native
  
  /** Gets the user's new authentication status. */
  var newStatus: UserAuthenticationStatus = js.native
  
  /** Gets the user. */
  var user: User = js.native
}
object UserAuthenticationStatusChangingEventArgs {
  
  @scala.inline
  def apply(
    currentStatus: UserAuthenticationStatus,
    getDeferral: () => UserAuthenticationStatusChangeDeferral,
    newStatus: UserAuthenticationStatus,
    user: User
  ): UserAuthenticationStatusChangingEventArgs = {
    val __obj = js.Dynamic.literal(currentStatus = currentStatus.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), newStatus = newStatus.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAuthenticationStatusChangingEventArgs]
  }
  
  @scala.inline
  implicit class UserAuthenticationStatusChangingEventArgsMutableBuilder[Self <: UserAuthenticationStatusChangingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentStatus(value: UserAuthenticationStatus): Self = StObject.set(x, "currentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDeferral(value: () => UserAuthenticationStatusChangeDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewStatus(value: UserAuthenticationStatus): Self = StObject.set(x, "newStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
