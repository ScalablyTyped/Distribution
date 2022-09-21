package typings.twilioVideo.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video/tsdef/types", "NetworkQualitySendOrRecvStats")
@js.native
open class NetworkQualitySendOrRecvStats () extends StObject {
  
  var bandwidth: NetworkQualityBandwidthStats | Null = js.native
  
  var fractionLost: NetworkQualityFractionLostStats | Null = js.native
  
  var latency: NetworkQualityLatencyStats | Null = js.native
}
