package typings.webrtc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtpreceiver
@js.native
trait RTCRtpReceiver extends StObject {
  
  def getContributingSources(): js.Array[RTCRtpContributingSource] = js.native
  
  //readonly track?: MediaStreamTrack;
  //readonly transport?: RTCDtlsTransport;
  //readonly rtcpTransport?: RTCDtlsTransport;
  def getParameters(): RTCRtpParameters = js.native
}
object RTCRtpReceiver {
  
  @scala.inline
  def apply(
    getContributingSources: () => js.Array[RTCRtpContributingSource],
    getParameters: () => RTCRtpParameters
  ): RTCRtpReceiver = {
    val __obj = js.Dynamic.literal(getContributingSources = js.Any.fromFunction0(getContributingSources), getParameters = js.Any.fromFunction0(getParameters))
    __obj.asInstanceOf[RTCRtpReceiver]
  }
  
  @scala.inline
  implicit class RTCRtpReceiverMutableBuilder[Self <: RTCRtpReceiver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetContributingSources(value: () => js.Array[RTCRtpContributingSource]): Self = StObject.set(x, "getContributingSources", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParameters(value: () => RTCRtpParameters): Self = StObject.set(x, "getParameters", js.Any.fromFunction0(value))
  }
}
