package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AvatarUrl extends js.Object {
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

object Anon_AvatarUrl {
  @scala.inline
  def apply(avatarUrl: String, nickname: String, openid: String): Anon_AvatarUrl = {
    val __obj = js.Dynamic.literal(avatarUrl = avatarUrl, nickname = nickname, openid = openid)
  
    __obj.asInstanceOf[Anon_AvatarUrl]
  }
}

