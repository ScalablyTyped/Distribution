package typings.webrtc

import typings.std.RTCBundlePolicy
import typings.std.RTCIceTransportPolicy
import typings.std.RTCRtcpMuxPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#idl-def-rtcconfiguration
trait RTCConfiguration extends StObject {
  
  // default = 'all'
  var bundlePolicy: js.UndefOr[RTCBundlePolicy] = js.undefined
  
  // default = null
  var certificates: js.UndefOr[js.Array[RTCCertificate]] = js.undefined
  
  var iceCandidatePoolSize: js.UndefOr[Double] = js.undefined
  
  var iceServers: js.UndefOr[js.Array[RTCIceServer]] = js.undefined
  
  var iceTransportPolicy: js.UndefOr[RTCIceTransportPolicy] = js.undefined
  
  // default = 'require'
  var peerIdentity: js.UndefOr[String] = js.undefined
  
  // default = 'balanced'
  var rtcpMuxPolicy: js.UndefOr[RTCRtcpMuxPolicy] = js.undefined
}
object RTCConfiguration {
  
  @scala.inline
  def apply(): RTCConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCConfiguration]
  }
  
  @scala.inline
  implicit class RTCConfigurationMutableBuilder[Self <: RTCConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBundlePolicy(value: RTCBundlePolicy): Self = StObject.set(x, "bundlePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundlePolicyUndefined: Self = StObject.set(x, "bundlePolicy", js.undefined)
    
    @scala.inline
    def setCertificates(value: js.Array[RTCCertificate]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificatesUndefined: Self = StObject.set(x, "certificates", js.undefined)
    
    @scala.inline
    def setCertificatesVarargs(value: RTCCertificate*): Self = StObject.set(x, "certificates", js.Array(value :_*))
    
    @scala.inline
    def setIceCandidatePoolSize(value: Double): Self = StObject.set(x, "iceCandidatePoolSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIceCandidatePoolSizeUndefined: Self = StObject.set(x, "iceCandidatePoolSize", js.undefined)
    
    @scala.inline
    def setIceServers(value: js.Array[RTCIceServer]): Self = StObject.set(x, "iceServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIceServersUndefined: Self = StObject.set(x, "iceServers", js.undefined)
    
    @scala.inline
    def setIceServersVarargs(value: RTCIceServer*): Self = StObject.set(x, "iceServers", js.Array(value :_*))
    
    @scala.inline
    def setIceTransportPolicy(value: RTCIceTransportPolicy): Self = StObject.set(x, "iceTransportPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIceTransportPolicyUndefined: Self = StObject.set(x, "iceTransportPolicy", js.undefined)
    
    @scala.inline
    def setPeerIdentity(value: String): Self = StObject.set(x, "peerIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerIdentityUndefined: Self = StObject.set(x, "peerIdentity", js.undefined)
    
    @scala.inline
    def setRtcpMuxPolicy(value: RTCRtcpMuxPolicy): Self = StObject.set(x, "rtcpMuxPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtcpMuxPolicyUndefined: Self = StObject.set(x, "rtcpMuxPolicy", js.undefined)
  }
}
