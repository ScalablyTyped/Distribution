package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAvatarUrl extends js.Object {
  /**
    * 用户的微信头像 url
    */
  var avatarUrl: String
  /**
    * 用户的微信昵称
    */
  var nickname: String
  /**
    * 用户 openid
    */
  var openid: String
}

object AnonAvatarUrl {
  @scala.inline
  def apply(avatarUrl: String, nickname: String, openid: String): AnonAvatarUrl = {
    val __obj = js.Dynamic.literal(avatarUrl = avatarUrl.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], openid = openid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAvatarUrl]
  }
}

