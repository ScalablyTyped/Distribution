package typings
package wegameDashApiLib.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserInfo extends js.Object {
  var avatarUrl: java.lang.String
  var city: java.lang.String
  var country: java.lang.String
  /**
    * 0：未知、1：男、2：女
    */
  var gender: wegameDashApiLib.wegameDashApiLibNumbers.`0` | wegameDashApiLib.wegameDashApiLibNumbers.`1` | wegameDashApiLib.wegameDashApiLibNumbers.`2`
  var language: java.lang.String
  var nickName: java.lang.String
  var province: java.lang.String
}

object UserInfo {
  @scala.inline
  def apply(
    avatarUrl: java.lang.String,
    city: java.lang.String,
    country: java.lang.String,
    gender: wegameDashApiLib.wegameDashApiLibNumbers.`0` | wegameDashApiLib.wegameDashApiLibNumbers.`1` | wegameDashApiLib.wegameDashApiLibNumbers.`2`,
    language: java.lang.String,
    nickName: java.lang.String,
    province: java.lang.String
  ): UserInfo = {
    val __obj = js.Dynamic.literal(avatarUrl = avatarUrl, city = city, country = country, gender = gender.asInstanceOf[js.Any], language = language, nickName = nickName, province = province)
  
    __obj.asInstanceOf[UserInfo]
  }
}

