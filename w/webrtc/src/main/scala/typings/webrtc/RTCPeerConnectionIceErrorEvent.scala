package typings.webrtc

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#h-rtcpeerconnectioniceerrorevent
@js.native
trait RTCPeerConnectionIceErrorEvent
  extends StObject
     with Event {
  
  val errorCode: Double = js.native
  
  val errorText: String = js.native
  
  val hostCandidate: String = js.native
  
  val url: String = js.native
}
