package typings
package webrtcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCPeerConnectionStatic
  extends ScalablyTyped.runtime.Instantiable0[RTCPeerConnection]
     with ScalablyTyped.runtime.Instantiable1[/* configuration */ RTCConfiguration, RTCPeerConnection] {
  val defaultIceServers: js.Array[RTCIceServer] = js.native
  // Extension: https://www.w3.org/TR/webrtc/#sec.cert-mgmt
  def generateCertificate(keygenAlgorithm: java.lang.String): js.Promise[RTCCertificate] = js.native
}

