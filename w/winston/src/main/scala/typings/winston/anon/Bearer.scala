package typings.winston.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bearer extends js.Object {
  var bearer: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object Bearer {
  @scala.inline
  def apply(bearer: String = null, password: String = null, username: String = null): Bearer = {
    val __obj = js.Dynamic.literal()
    if (bearer != null) __obj.updateDynamic("bearer")(bearer.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bearer]
  }
}

