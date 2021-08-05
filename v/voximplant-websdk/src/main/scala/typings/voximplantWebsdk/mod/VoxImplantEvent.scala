package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.voximplantWebsdk.mod.EventTypes.AuthResult
  - typings.voximplantWebsdk.mod.EventTypes.ConnectionClosed
  - typings.voximplantWebsdk.mod.EventTypes.ConnectionEstablished
  - typings.voximplantWebsdk.mod.EventTypes.ConnectionFailed
  - typings.voximplantWebsdk.mod.EventTypes.IncomingCall
  - typings.voximplantWebsdk.mod.EventTypes.MicAccessResult
  - typings.voximplantWebsdk.mod.EventTypes.NetStatsReceived
  - typings.voximplantWebsdk.mod.EventTypes.PlaybackFinished
  - typings.voximplantWebsdk.mod.EventTypes.SDKReady
  - typings.voximplantWebsdk.mod.EventTypes.SourcesInfoUpdated
*/
trait VoxImplantEvent extends StObject
object VoxImplantEvent {
  
  inline def AuthResult(result: Boolean): typings.voximplantWebsdk.mod.EventTypes.AuthResult = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.voximplantWebsdk.mod.EventTypes.AuthResult]
  }
  
  inline def ConnectionFailed(message: String): typings.voximplantWebsdk.mod.EventTypes.ConnectionFailed = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.voximplantWebsdk.mod.EventTypes.ConnectionFailed]
  }
  
  inline def IncomingCall(call: Call): typings.voximplantWebsdk.mod.EventTypes.IncomingCall = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.voximplantWebsdk.mod.EventTypes.IncomingCall]
  }
  
  inline def MicAccessResult(result: Boolean): typings.voximplantWebsdk.mod.EventTypes.MicAccessResult = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.voximplantWebsdk.mod.EventTypes.MicAccessResult]
  }
  
  inline def NetStatsReceived(stats: NetworkInfo): typings.voximplantWebsdk.mod.EventTypes.NetStatsReceived = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.voximplantWebsdk.mod.EventTypes.NetStatsReceived]
  }
  
  inline def SDKReady(version: String): typings.voximplantWebsdk.mod.EventTypes.SDKReady = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.voximplantWebsdk.mod.EventTypes.SDKReady]
  }
}
