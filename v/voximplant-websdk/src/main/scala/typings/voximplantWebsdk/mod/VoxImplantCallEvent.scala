package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.voximplantWebsdk.mod.CallEventTypes.Connected
  - typings.voximplantWebsdk.mod.CallEventTypes.Disconnected
  - typings.voximplantWebsdk.mod.CallEventTypes.Failed
  - typings.voximplantWebsdk.mod.CallEventTypes.InfoReceived
  - typings.voximplantWebsdk.mod.CallEventTypes.MessageReceived
  - typings.voximplantWebsdk.mod.CallEventTypes.ProgressToneStart
  - typings.voximplantWebsdk.mod.CallEventTypes.ProgressToneStop
  - typings.voximplantWebsdk.mod.CallEventTypes.TransferComplete
  - typings.voximplantWebsdk.mod.CallEventTypes.TransferFailed
*/
trait VoxImplantCallEvent extends StObject
object VoxImplantCallEvent {
  
  @scala.inline
  def Connected(call: Call): typings.voximplantWebsdk.mod.CallEventTypes.Connected = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.voximplantWebsdk.mod.CallEventTypes.Connected]
  }
  
  @scala.inline
  def Disconnected(call: Call): typings.voximplantWebsdk.mod.CallEventTypes.Disconnected = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.voximplantWebsdk.mod.CallEventTypes.Disconnected]
  }
  
  @scala.inline
  def Failed(call: Call, code: Double, reason: String): typings.voximplantWebsdk.mod.CallEventTypes.Failed = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.voximplantWebsdk.mod.CallEventTypes.Failed]
  }
  
  @scala.inline
  def InfoReceived(body: String, call: Call, mimeType: String): typings.voximplantWebsdk.mod.CallEventTypes.InfoReceived = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], call = call.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.voximplantWebsdk.mod.CallEventTypes.InfoReceived]
  }
  
  @scala.inline
  def MessageReceived(call: Call, text: String): typings.voximplantWebsdk.mod.CallEventTypes.MessageReceived = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.voximplantWebsdk.mod.CallEventTypes.MessageReceived]
  }
  
  @scala.inline
  def ProgressToneStart(call: Call): typings.voximplantWebsdk.mod.CallEventTypes.ProgressToneStart = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.voximplantWebsdk.mod.CallEventTypes.ProgressToneStart]
  }
  
  @scala.inline
  def ProgressToneStop(call: Call): typings.voximplantWebsdk.mod.CallEventTypes.ProgressToneStop = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.voximplantWebsdk.mod.CallEventTypes.ProgressToneStop]
  }
  
  @scala.inline
  def TransferComplete(call: Call): typings.voximplantWebsdk.mod.CallEventTypes.TransferComplete = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.voximplantWebsdk.mod.CallEventTypes.TransferComplete]
  }
  
  @scala.inline
  def TransferFailed(call: Call): typings.voximplantWebsdk.mod.CallEventTypes.TransferFailed = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.voximplantWebsdk.mod.CallEventTypes.TransferFailed]
  }
}
