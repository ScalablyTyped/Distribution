package typings
package wepyLib.wxUnderscoreEnhancedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserInfo extends js.Object {
  var avatarUrl: java.lang.String
  var city: java.lang.String
  var country: java.lang.String
  var gender: java.lang.String
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
    gender: java.lang.String,
    language: java.lang.String,
    nickName: java.lang.String,
    province: java.lang.String
  ): UserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("avatarUrl")(avatarUrl)
    __obj.updateDynamic("city")(city)
    __obj.updateDynamic("country")(country)
    __obj.updateDynamic("gender")(gender)
    __obj.updateDynamic("language")(language)
    __obj.updateDynamic("nickName")(nickName)
    __obj.updateDynamic("province")(province)
    __obj.asInstanceOf[UserInfo]
  }
}

