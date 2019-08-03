package typings.wxDashServerDashSdk

import typings.wxDashServerDashSdk.wxDashServerDashSdkStrings.BACKSLASHu5176BACKSLASHu4ED6
import typings.wxDashServerDashSdk.wxDashServerDashSdkStrings.wx_client
import typings.wxDashServerDashSdk.wxDashServerDashSdkStrings.wx_devtools
import typings.wxDashServerDashSdk.wxDashServerDashSdkStrings.wx_http
import typings.wxDashServerDashSdk.wxDashServerDashSdkStrings.wx_unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_APPID extends js.Object {
  var APPID: String
  var ENV: String
  var OPENID: String
  var SOURCE: wx_devtools | wx_client | wx_http | wx_unknown | BACKSLASHu5176BACKSLASHu4ED6
  var UNIONID: String
}

object Anon_APPID {
  @scala.inline
  def apply(
    APPID: String,
    ENV: String,
    OPENID: String,
    SOURCE: wx_devtools | wx_client | wx_http | wx_unknown | BACKSLASHu5176BACKSLASHu4ED6,
    UNIONID: String
  ): Anon_APPID = {
    val __obj = js.Dynamic.literal(APPID = APPID, ENV = ENV, OPENID = OPENID, SOURCE = SOURCE.asInstanceOf[js.Any], UNIONID = UNIONID)
  
    __obj.asInstanceOf[Anon_APPID]
  }
}

