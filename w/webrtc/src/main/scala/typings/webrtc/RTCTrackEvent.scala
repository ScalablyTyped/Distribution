package typings.webrtc

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#h-rtctrackevent
@js.native
trait RTCTrackEvent
  extends StObject
     with Event {
  
  val receiver: RTCRtpReceiver = js.native
  
  val streams: js.Array[MediaStream] = js.native
  
  val track: MediaStreamTrack = js.native
  
  val transceiver: RTCRtpTransceiver = js.native
}
