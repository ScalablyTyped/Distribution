package typings
package webrtcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#dom-rtcrtpsender
@js.native
trait RTCRtpSender extends js.Object {
  def getParameters(): RTCRtpParameters = js.native
  def replaceTrack(withTrack: MediaStreamTrack): stdLib.Promise[scala.Unit] = js.native
  //readonly track?: MediaStreamTrack;
  //readonly transport?: RTCDtlsTransport;
  //readonly rtcpTransport?: RTCDtlsTransport;
  def setParameters(): stdLib.Promise[scala.Unit] = js.native
  //readonly track?: MediaStreamTrack;
  //readonly transport?: RTCDtlsTransport;
  //readonly rtcpTransport?: RTCDtlsTransport;
  def setParameters(parameters: RTCRtpParameters): stdLib.Promise[scala.Unit] = js.native
}

