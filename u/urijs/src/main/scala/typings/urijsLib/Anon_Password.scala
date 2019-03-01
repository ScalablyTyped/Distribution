package typings
package urijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Password extends js.Object {
  var password: js.UndefOr[java.lang.String] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Password {
  @scala.inline
  def apply(password: java.lang.String = null, username: java.lang.String = null): Anon_Password = {
    val __obj = js.Dynamic.literal()
    if (password != null) __obj.updateDynamic("password")(password)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Anon_Password]
  }
}

