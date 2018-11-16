package typings
package webrtcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#h-rtcpeerconnectioniceerrorevent
@js.native
trait RTCPeerConnectionIceErrorEvent
  extends stdLib.Event {
  val errorCode: scala.Double = js.native
  val errorText: java.lang.String = js.native
  val hostCandidate: java.lang.String = js.native
  val url: java.lang.String = js.native
}

