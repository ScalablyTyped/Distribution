package typings
package webrtcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcdatachannelinit
trait RTCDataChannelInit extends js.Object {
   // default = false
  var id: js.UndefOr[scala.Double] = js.undefined
   // default = true
  var maxPacketLifeTime: js.UndefOr[scala.Double] = js.undefined
  var maxRetransmits: js.UndefOr[scala.Double] = js.undefined
   // default = ''
  var negotiated: js.UndefOr[scala.Boolean] = js.undefined
  var ordered: js.UndefOr[scala.Boolean] = js.undefined
  var protocol: js.UndefOr[java.lang.String] = js.undefined
}

object RTCDataChannelInit {
  @scala.inline
  def apply(
    id: scala.Int | scala.Double = null,
    maxPacketLifeTime: scala.Int | scala.Double = null,
    maxRetransmits: scala.Int | scala.Double = null,
    negotiated: js.UndefOr[scala.Boolean] = js.undefined,
    ordered: js.UndefOr[scala.Boolean] = js.undefined,
    protocol: java.lang.String = null
  ): RTCDataChannelInit = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (maxPacketLifeTime != null) __obj.updateDynamic("maxPacketLifeTime")(maxPacketLifeTime.asInstanceOf[js.Any])
    if (maxRetransmits != null) __obj.updateDynamic("maxRetransmits")(maxRetransmits.asInstanceOf[js.Any])
    if (!js.isUndefined(negotiated)) __obj.updateDynamic("negotiated")(negotiated)
    if (!js.isUndefined(ordered)) __obj.updateDynamic("ordered")(ordered)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    __obj.asInstanceOf[RTCDataChannelInit]
  }
}

