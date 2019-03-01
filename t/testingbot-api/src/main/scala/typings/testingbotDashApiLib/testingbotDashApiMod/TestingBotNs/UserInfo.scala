package typings
package testingbotDashApiLib.testingbotDashApiMod.TestingBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserInfo extends js.Object {
  var email: js.UndefOr[java.lang.String] = js.undefined
  var first_name: js.UndefOr[java.lang.String] = js.undefined
  var last_name: js.UndefOr[java.lang.String] = js.undefined
}

object UserInfo {
  @scala.inline
  def apply(
    email: java.lang.String = null,
    first_name: java.lang.String = null,
    last_name: java.lang.String = null
  ): UserInfo = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (first_name != null) __obj.updateDynamic("first_name")(first_name)
    if (last_name != null) __obj.updateDynamic("last_name")(last_name)
    __obj.asInstanceOf[UserInfo]
  }
}

