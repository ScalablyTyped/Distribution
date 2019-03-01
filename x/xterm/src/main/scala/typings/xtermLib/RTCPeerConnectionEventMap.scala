package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCPeerConnectionEventMap extends js.Object {
  var connectionstatechange: Event
  var datachannel: RTCDataChannelEvent
  var icecandidate: RTCPeerConnectionIceEvent
  var icecandidateerror: RTCPeerConnectionIceErrorEvent
  var iceconnectionstatechange: Event
  var icegatheringstatechange: Event
  var negotiationneeded: Event
  var signalingstatechange: Event
  var statsended: RTCStatsEvent
  var track: RTCTrackEvent
}

object RTCPeerConnectionEventMap {
  @scala.inline
  def apply(
    connectionstatechange: Event,
    datachannel: RTCDataChannelEvent,
    icecandidate: RTCPeerConnectionIceEvent,
    icecandidateerror: RTCPeerConnectionIceErrorEvent,
    iceconnectionstatechange: Event,
    icegatheringstatechange: Event,
    negotiationneeded: Event,
    signalingstatechange: Event,
    statsended: RTCStatsEvent,
    track: RTCTrackEvent
  ): RTCPeerConnectionEventMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("connectionstatechange")(connectionstatechange)
    __obj.updateDynamic("datachannel")(datachannel)
    __obj.updateDynamic("icecandidate")(icecandidate)
    __obj.updateDynamic("icecandidateerror")(icecandidateerror)
    __obj.updateDynamic("iceconnectionstatechange")(iceconnectionstatechange)
    __obj.updateDynamic("icegatheringstatechange")(icegatheringstatechange)
    __obj.updateDynamic("negotiationneeded")(negotiationneeded)
    __obj.updateDynamic("signalingstatechange")(signalingstatechange)
    __obj.updateDynamic("statsended")(statsended)
    __obj.updateDynamic("track")(track)
    __obj.asInstanceOf[RTCPeerConnectionEventMap]
  }
}

