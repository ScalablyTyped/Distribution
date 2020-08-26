package typings.wxServerSdk.anon

import typings.wxServerSdk.wxServerSdkStrings.wx_client
import typings.wxServerSdk.wxServerSdkStrings.wx_devtools
import typings.wxServerSdk.wxServerSdkStrings.wx_http
import typings.wxServerSdk.wxServerSdkStrings.wx_unknown
import typings.wxServerSdk.wxServerSdkStrings.其他
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait APPID extends js.Object {
  var APPID: String = js.native
  var ENV: String = js.native
  var OPENID: String = js.native
  var SOURCE: wx_devtools | wx_client | wx_http | wx_unknown | 其他 = js.native
  var UNIONID: String = js.native
}

object APPID {
  @scala.inline
  def apply(
    APPID: String,
    ENV: String,
    OPENID: String,
    SOURCE: wx_devtools | wx_client | wx_http | wx_unknown | 其他,
    UNIONID: String
  ): APPID = {
    val __obj = js.Dynamic.literal(APPID = APPID.asInstanceOf[js.Any], ENV = ENV.asInstanceOf[js.Any], OPENID = OPENID.asInstanceOf[js.Any], SOURCE = SOURCE.asInstanceOf[js.Any], UNIONID = UNIONID.asInstanceOf[js.Any])
    __obj.asInstanceOf[APPID]
  }
  @scala.inline
  implicit class APPIDOps[Self <: APPID] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAPPID(value: String): Self = this.set("APPID", value.asInstanceOf[js.Any])
    @scala.inline
    def setENV(value: String): Self = this.set("ENV", value.asInstanceOf[js.Any])
    @scala.inline
    def setOPENID(value: String): Self = this.set("OPENID", value.asInstanceOf[js.Any])
    @scala.inline
    def setSOURCE(value: wx_devtools | wx_client | wx_http | wx_unknown | 其他): Self = this.set("SOURCE", value.asInstanceOf[js.Any])
    @scala.inline
    def setUNIONID(value: String): Self = this.set("UNIONID", value.asInstanceOf[js.Any])
  }
  
}

