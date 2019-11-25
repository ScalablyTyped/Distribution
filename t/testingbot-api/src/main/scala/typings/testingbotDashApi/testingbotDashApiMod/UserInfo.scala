package typings.testingbotDashApi.testingbotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserInfo extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var first_name: js.UndefOr[String] = js.undefined
  var last_name: js.UndefOr[String] = js.undefined
}

object UserInfo {
  @scala.inline
  def apply(email: String = null, first_name: String = null, last_name: String = null): UserInfo = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (first_name != null) __obj.updateDynamic("first_name")(first_name.asInstanceOf[js.Any])
    if (last_name != null) __obj.updateDynamic("last_name")(last_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserInfo]
  }
}

