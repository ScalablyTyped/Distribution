package typings.winrtUwp.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for a user changed event. */
trait UserChangedEventArgs extends StObject {
  
  /** Gets the user. */
  var user: User
}
object UserChangedEventArgs {
  
  @scala.inline
  def apply(user: User): UserChangedEventArgs = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserChangedEventArgs]
  }
  
  @scala.inline
  implicit class UserChangedEventArgsMutableBuilder[Self <: UserChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
