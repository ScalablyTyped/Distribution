package typings.weixinDashApp.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 开放接口-----用户信息
trait UserInfo extends js.Object {
  var avatarUrl: String
  var city: String
  var country: String
  var gender: Double
  var nickName: String
  var province: String
}

object UserInfo {
  @scala.inline
  def apply(
    avatarUrl: String,
    city: String,
    country: String,
    gender: Double,
    nickName: String,
    province: String
  ): UserInfo = {
    val __obj = js.Dynamic.literal(avatarUrl = avatarUrl, city = city, country = country, gender = gender, nickName = nickName, province = province)
  
    __obj.asInstanceOf[UserInfo]
  }
}

