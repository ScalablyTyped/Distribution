package typings.webrtc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtpheaderextensionparameters
trait RTCRtpHeaderExtensionParameters extends js.Object {
  //uri: string;
  //id: number;
  var encrypted: js.UndefOr[Boolean] = js.undefined
}

object RTCRtpHeaderExtensionParameters {
  @scala.inline
  def apply(encrypted: js.UndefOr[Boolean] = js.undefined): RTCRtpHeaderExtensionParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(encrypted)) __obj.updateDynamic("encrypted")(encrypted.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpHeaderExtensionParameters]
  }
}

