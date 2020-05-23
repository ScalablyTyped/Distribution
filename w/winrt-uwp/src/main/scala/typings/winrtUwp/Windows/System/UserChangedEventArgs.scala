package typings.winrtUwp.Windows.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a user changed event. */
trait UserChangedEventArgs extends js.Object {
  /** Gets the user. */
  var user: User
}

object UserChangedEventArgs {
  @scala.inline
  def apply(user: User): UserChangedEventArgs = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserChangedEventArgs]
  }
}

