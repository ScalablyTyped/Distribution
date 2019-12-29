package typings.voximplantDashWebsdk.voximplantDashWebsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.CallEventTypes.Connected
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.CallEventTypes.Disconnected
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.CallEventTypes.Failed
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.CallEventTypes.InfoReceived
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.CallEventTypes.MessageReceived
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.CallEventTypes.ProgressToneStart
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.CallEventTypes.ProgressToneStop
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.CallEventTypes.TransferComplete
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.CallEventTypes.TransferFailed
*/
trait VoxImplantCallEvent extends js.Object

object VoxImplantCallEvent {
  @scala.inline
  def MessageReceived(call: Call, text: String): VoxImplantCallEvent = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantCallEvent]
  }
  @scala.inline
  def Connected(call: Call, headers: js.Object = null): VoxImplantCallEvent = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantCallEvent]
  }
  @scala.inline
  def InfoReceived(body: String, call: Call, mimeType: String, headers: js.Object = null): VoxImplantCallEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], call = call.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantCallEvent]
  }
  @scala.inline
  def Failed(call: Call, code: Double, reason: String, headers: js.Object = null): VoxImplantCallEvent = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantCallEvent]
  }
  @scala.inline
  def TransferFailed(call: Call): VoxImplantCallEvent = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantCallEvent]
  }
  @scala.inline
  def TransferComplete(call: Call): VoxImplantCallEvent = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantCallEvent]
  }
  @scala.inline
  def ProgressToneStop(call: Call): VoxImplantCallEvent = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantCallEvent]
  }
  @scala.inline
  def Disconnected(call: Call, headers: js.Object = null): VoxImplantCallEvent = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantCallEvent]
  }
  @scala.inline
  def ProgressToneStart(call: Call): VoxImplantCallEvent = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantCallEvent]
  }
}

