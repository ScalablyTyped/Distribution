package typings.urijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Password extends js.Object {
  var password: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object Anon_Password {
  @scala.inline
  def apply(password: String = null, username: String = null): Anon_Password = {
    val __obj = js.Dynamic.literal()
    if (password != null) __obj.updateDynamic("password")(password)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Anon_Password]
  }
}

