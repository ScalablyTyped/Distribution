package typings
package webrtcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtciceserver
trait RTCIceServer extends js.Object {
  //urls: string | string[];
  var credentialType: js.UndefOr[stdLib.RTCIceCredentialType] = js.undefined
}

object RTCIceServer {
  @scala.inline
  def apply(credentialType: stdLib.RTCIceCredentialType = null): RTCIceServer = {
    val __obj = js.Dynamic.literal()
    if (credentialType != null) __obj.updateDynamic("credentialType")(credentialType)
    __obj.asInstanceOf[RTCIceServer]
  }
}

