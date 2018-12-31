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

