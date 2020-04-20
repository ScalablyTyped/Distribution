package typings.weixinApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthSetting extends js.Object {
  var authSetting: keyinScopeboolean
}

object AnonAuthSetting {
  @scala.inline
  def apply(authSetting: keyinScopeboolean): AnonAuthSetting = {
    val __obj = js.Dynamic.literal(authSetting = authSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthSetting]
  }
}

