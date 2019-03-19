package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserInfo extends js.Object {
  /**
    * 用户头像
    */
  var avatarUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 用户昵称
    */
  var nickname: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 该服务商唯一用户标识
    */
  var openid: js.UndefOr[java.lang.String] = js.undefined
}

object UserInfo {
  @scala.inline
  def apply(
    avatarUrl: java.lang.String = null,
    nickname: java.lang.String = null,
    openid: java.lang.String = null
  ): UserInfo = {
    val __obj = js.Dynamic.literal()
    if (avatarUrl != null) __obj.updateDynamic("avatarUrl")(avatarUrl)
    if (nickname != null) __obj.updateDynamic("nickname")(nickname)
    if (openid != null) __obj.updateDynamic("openid")(openid)
    __obj.asInstanceOf[UserInfo]
  }
}

