package typings.webrtc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcdatachannelinit
trait RTCDataChannelInit extends js.Object {
   // default = false
  var id: js.UndefOr[Double] = js.undefined
   // default = true
  var maxPacketLifeTime: js.UndefOr[Double] = js.undefined
  var maxRetransmits: js.UndefOr[Double] = js.undefined
   // default = ''
  var negotiated: js.UndefOr[Boolean] = js.undefined
  var ordered: js.UndefOr[Boolean] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
}

object RTCDataChannelInit {
  @scala.inline
  def apply(
    id: js.UndefOr[Double] = js.undefined,
    maxPacketLifeTime: js.UndefOr[Double] = js.undefined,
    maxRetransmits: js.UndefOr[Double] = js.undefined,
    negotiated: js.UndefOr[Boolean] = js.undefined,
    ordered: js.UndefOr[Boolean] = js.undefined,
    protocol: String = null
  ): RTCDataChannelInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPacketLifeTime)) __obj.updateDynamic("maxPacketLifeTime")(maxPacketLifeTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetransmits)) __obj.updateDynamic("maxRetransmits")(maxRetransmits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(negotiated)) __obj.updateDynamic("negotiated")(negotiated.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ordered)) __obj.updateDynamic("ordered")(ordered.get.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDataChannelInit]
  }
}

