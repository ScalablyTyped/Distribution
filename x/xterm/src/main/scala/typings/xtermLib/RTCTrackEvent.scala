package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCTrackEvent extends Event {
  val receiver: RTCRtpReceiver = js.native
  val streams: js.Array[MediaStream] = js.native
  val track: MediaStreamTrack = js.native
  val transceiver: RTCRtpTransceiver = js.native
}

@JSGlobal("RTCTrackEvent")
@js.native
object RTCTrackEvent
  extends ScalablyTyped.runtime.Instantiable2[/* type */ java.lang.String, /* eventInitDict */ RTCTrackEventInit, RTCTrackEvent]

