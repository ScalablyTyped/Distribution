package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RTCRtpTransceiver extends js.Object {
  val currentDirection: RTCRtpTransceiverDirection | scala.Null
  var direction: RTCRtpTransceiverDirection
  val mid: java.lang.String | scala.Null
  val receiver: RTCRtpReceiver
  val sender: RTCRtpSender
  val stopped: scala.Boolean
  def setCodecPreferences(codecs: js.Array[RTCRtpCodecCapability]): scala.Unit
  def stop(): scala.Unit
}

@JSGlobal("RTCRtpTransceiver")
@js.native
object RTCRtpTransceiver
  extends org.scalablytyped.runtime.Instantiable0[RTCRtpTransceiver]

