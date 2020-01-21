package typings.wxServerSdk

import typings.wxServerSdk.wxServerSdkStrings.wx_client
import typings.wxServerSdk.wxServerSdkStrings.wx_devtools
import typings.wxServerSdk.wxServerSdkStrings.wx_http
import typings.wxServerSdk.wxServerSdkStrings.wx_unknown
import typings.wxServerSdk.wxServerSdkStrings.其他
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAPPID extends js.Object {
  var APPID: String
  var ENV: String
  var OPENID: String
  var SOURCE: wx_devtools | wx_client | wx_http | wx_unknown | 其他
  var UNIONID: String
}

object AnonAPPID {
  @scala.inline
  def apply(
    APPID: String,
    ENV: String,
    OPENID: String,
    SOURCE: wx_devtools | wx_client | wx_http | wx_unknown | 其他,
    UNIONID: String
  ): AnonAPPID = {
    val __obj = js.Dynamic.literal(APPID = APPID.asInstanceOf[js.Any], ENV = ENV.asInstanceOf[js.Any], OPENID = OPENID.asInstanceOf[js.Any], SOURCE = SOURCE.asInstanceOf[js.Any], UNIONID = UNIONID.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAPPID]
  }
}

