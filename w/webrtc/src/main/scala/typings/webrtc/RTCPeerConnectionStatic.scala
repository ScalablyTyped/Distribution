package typings.webrtc

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCPeerConnectionStatic
  extends Instantiable0[RTCPeerConnection]
     with Instantiable1[/* configuration */ RTCConfiguration, RTCPeerConnection]
     with Instantiable2[/* configuration */ RTCConfiguration, /* options */ js.Any, RTCPeerConnection] {
  val defaultIceServers: js.Array[RTCIceServer] = js.native
  // Extension: https://www.w3.org/TR/webrtc/#sec.cert-mgmt
  def generateCertificate(keygenAlgorithm: String): js.Promise[RTCCertificate] = js.native
}

