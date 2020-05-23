package typings.trtcJsSdk.mod

import typings.std.RTCIceCredentialType
import typings.std.RTCOAuthCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent trtc-js-sdk.trtc-js-sdk.Omit<std.RTCIceServer, 'urls'> */
trait TurnServerConfig extends js.Object {
  var credential: js.UndefOr[String | RTCOAuthCredential] = js.undefined
  var credentialType: js.UndefOr[RTCIceCredentialType] = js.undefined
  /** TURN 服务器 url */
  var url: String
  var username: js.UndefOr[String] = js.undefined
}

object TurnServerConfig {
  @scala.inline
  def apply(
    url: String,
    credential: String | RTCOAuthCredential = null,
    credentialType: RTCIceCredentialType = null,
    username: String = null
  ): TurnServerConfig = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (credential != null) __obj.updateDynamic("credential")(credential.asInstanceOf[js.Any])
    if (credentialType != null) __obj.updateDynamic("credentialType")(credentialType.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[TurnServerConfig]
  }
}

