package typings.twilioVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video", "NetworkQualitySendOrRecvStats")
@js.native
class NetworkQualitySendOrRecvStats () extends js.Object {
  
  var bandwidth: NetworkQualityBandwidthStats | Null = js.native
  
  var fractionLost: NetworkQualityFractionLostStats | Null = js.native
  
  var latency: NetworkQualityLatencyStats | Null = js.native
}
