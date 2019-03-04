package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 开放接口-----用户信息
trait UserInfo extends js.Object {
  var avatarUrl: java.lang.String
  var city: java.lang.String
  var country: java.lang.String
  var gender: scala.Double
  var nickName: java.lang.String
  var province: java.lang.String
}

object UserInfo {
  @scala.inline
  def apply(
    avatarUrl: java.lang.String,
    city: java.lang.String,
    country: java.lang.String,
    gender: scala.Double,
    nickName: java.lang.String,
    province: java.lang.String
  ): UserInfo = {
    val __obj = js.Dynamic.literal(avatarUrl = avatarUrl, city = city, country = country, gender = gender, nickName = nickName, province = province)
  
    __obj.asInstanceOf[UserInfo]
  }
}

