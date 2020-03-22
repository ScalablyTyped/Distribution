package typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod

import typings.vscodeJsonrpc.mod.RequestHandler
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.callHierarchySlashincomingCalls
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol.callHierarchy.proposed", "CallHierarchyIncomingCallsRequest")
@js.native
object CallHierarchyIncomingCallsRequest extends js.Object {
  val method: callHierarchySlashincomingCalls = js.native
  val `type`: ProtocolRequestType[
    CallHierarchyIncomingCallsParams, 
    js.Array[CallHierarchyIncomingCall] | Null, 
    js.Array[CallHierarchyIncomingCall], 
    Unit, 
    Unit
  ] = js.native
  type HandlerSignature = RequestHandler[CallHierarchyIncomingCallsParams, js.Array[CallHierarchyIncomingCall] | Null, Unit]
}

