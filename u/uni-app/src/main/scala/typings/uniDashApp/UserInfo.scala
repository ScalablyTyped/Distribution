package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserInfo extends js.Object {
  /**
    * 用户头像
    */
  var avatarUrl: js.UndefOr[String] = js.undefined
  /**
    * 用户昵称
    */
  var nickname: js.UndefOr[String] = js.undefined
  /**
    * 该服务商唯一用户标识
    */
  var openid: js.UndefOr[String] = js.undefined
}

object UserInfo {
  @scala.inline
  def apply(avatarUrl: String = null, nickname: String = null, openid: String = null): UserInfo = {
    val __obj = js.Dynamic.literal()
    if (avatarUrl != null) __obj.updateDynamic("avatarUrl")(avatarUrl.asInstanceOf[js.Any])
    if (nickname != null) __obj.updateDynamic("nickname")(nickname.asInstanceOf[js.Any])
    if (openid != null) __obj.updateDynamic("openid")(openid.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserInfo]
  }
}

