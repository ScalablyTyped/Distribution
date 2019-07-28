package typings.wepy.wxUnderscoreEnhancedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserInfo extends js.Object {
  var avatarUrl: String
  var city: String
  var country: String
  var gender: String
  var language: String
  var nickName: String
  var province: String
}

object UserInfo {
  @scala.inline
  def apply(
    avatarUrl: String,
    city: String,
    country: String,
    gender: String,
    language: String,
    nickName: String,
    province: String
  ): UserInfo = {
    val __obj = js.Dynamic.literal(avatarUrl = avatarUrl, city = city, country = country, gender = gender, language = language, nickName = nickName, province = province)
  
    __obj.asInstanceOf[UserInfo]
  }
}

