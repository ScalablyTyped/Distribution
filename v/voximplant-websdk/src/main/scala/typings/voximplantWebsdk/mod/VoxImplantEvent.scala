package typings.voximplantWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait VoxImplantEvent extends js.Object

object VoxImplantEvent {
  @scala.inline
  def IncomingCall(call: Call): VoxImplantEvent = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantEvent]
  }
  @scala.inline
  def NetStatsReceived(stats: NetworkInfo): VoxImplantEvent = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantEvent]
  }
  @scala.inline
  def MicAccessResult(result: Boolean): VoxImplantEvent = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantEvent]
  }
  @scala.inline
  def AuthResult(result: Boolean): VoxImplantEvent = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantEvent]
  }
  @scala.inline
  def SDKReady(version: String): VoxImplantEvent = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantEvent]
  }
  @scala.inline
  def ConnectionFailed(message: String): VoxImplantEvent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantEvent]
  }
}

