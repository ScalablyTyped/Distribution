package typings.twilioVideo.tsdefTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video/tsdef/types", "NetworkQualityMediaStats")
@js.native
open class NetworkQualityMediaStats () extends StObject {
  
  var recv: NetworkQualityLevel = js.native
  
  var recvStats: NetworkQualitySendOrRecvStats | Null = js.native
  
  var send: NetworkQualityLevel = js.native
  
  var sendStats: NetworkQualitySendOrRecvStats | Null = js.native
}
