package typings.voximplantWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait VoxImplantCallEvent extends js.Object

object VoxImplantCallEvent {
  @scala.inline
  def Connected(call: Call): VoxImplantCallEvent = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantCallEvent]
  }
  @scala.inline
  def Failed(call: Call, code: Double, reason: String): VoxImplantCallEvent = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantCallEvent]
  }
  @scala.inline
  def MessageReceived(call: Call, text: String): VoxImplantCallEvent = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantCallEvent]
  }
  @scala.inline
  def TransferComplete(call: Call): VoxImplantCallEvent = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantCallEvent]
  }
  @scala.inline
  def ProgressToneStart(call: Call): VoxImplantCallEvent = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantCallEvent]
  }
  @scala.inline
  def ProgressToneStop(call: Call): VoxImplantCallEvent = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantCallEvent]
  }
  @scala.inline
  def Disconnected(call: Call): VoxImplantCallEvent = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantCallEvent]
  }
  @scala.inline
  def TransferFailed(call: Call): VoxImplantCallEvent = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantCallEvent]
  }
  @scala.inline
  def InfoReceived(body: String, call: Call, mimeType: String): VoxImplantCallEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], call = call.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantCallEvent]
  }
}

