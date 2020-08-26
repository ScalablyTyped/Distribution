package typings.trtcJsSdk.mod

import typings.std.RTCIceCredentialType
import typings.std.RTCOAuthCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent trtc-js-sdk.trtc-js-sdk.Omit<std.RTCIceServer, 'urls'> */
@js.native
trait TurnServerConfig extends js.Object {
  var credential: js.UndefOr[String | RTCOAuthCredential] = js.native
  var credentialType: js.UndefOr[RTCIceCredentialType] = js.native
  /** TURN 服务器 url */
  var url: String = js.native
  var username: js.UndefOr[String] = js.native
}

object TurnServerConfig {
  @scala.inline
  def apply(url: String): TurnServerConfig = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TurnServerConfig]
  }
  @scala.inline
  implicit class TurnServerConfigOps[Self <: TurnServerConfig] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setCredential(value: String | RTCOAuthCredential): Self = this.set("credential", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredential: Self = this.set("credential", js.undefined)
    @scala.inline
    def setCredentialType(value: RTCIceCredentialType): Self = this.set("credentialType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredentialType: Self = this.set("credentialType", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

