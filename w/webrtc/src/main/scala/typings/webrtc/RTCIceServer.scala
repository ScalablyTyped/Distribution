package typings.webrtc

import typings.std.RTCIceCredentialType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtciceserver
trait RTCIceServer extends js.Object {
  //urls: string | string[];
  var credentialType: js.UndefOr[RTCIceCredentialType] = js.undefined
}

object RTCIceServer {
  @scala.inline
  def apply(credentialType: RTCIceCredentialType = null): RTCIceServer = {
    val __obj = js.Dynamic.literal()
    if (credentialType != null) __obj.updateDynamic("credentialType")(credentialType)
    __obj.asInstanceOf[RTCIceServer]
  }
}

