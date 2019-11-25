package typings.wegameDashApi.wx.types

import typings.wegameDashApi.wegameDashApiNumbers.`0`
import typings.wegameDashApi.wegameDashApiNumbers.`1`
import typings.wegameDashApi.wegameDashApiNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserInfo extends js.Object {
  var avatarUrl: String
  var city: String
  var country: String
  /**
    * 0：未知、1：男、2：女
    */
  var gender: `0` | `1` | `2`
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
    gender: `0` | `1` | `2`,
    language: String,
    nickName: String,
    province: String
  ): UserInfo = {
    val __obj = js.Dynamic.literal(avatarUrl = avatarUrl.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], nickName = nickName.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserInfo]
  }
}

