package typings
package webrtcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtpheaderextensionparameters
trait RTCRtpHeaderExtensionParameters extends js.Object {
  //uri: string;
  //id: number;
  var encrypted: js.UndefOr[scala.Boolean] = js.undefined
}

object RTCRtpHeaderExtensionParameters {
  @scala.inline
  def apply(encrypted: js.UndefOr[scala.Boolean] = js.undefined): RTCRtpHeaderExtensionParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(encrypted)) __obj.updateDynamic("encrypted")(encrypted)
    __obj.asInstanceOf[RTCRtpHeaderExtensionParameters]
  }
}

