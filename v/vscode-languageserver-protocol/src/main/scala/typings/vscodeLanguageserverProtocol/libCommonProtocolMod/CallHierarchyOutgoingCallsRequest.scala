package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotcallHierarchyMod.CallHierarchyOutgoingCallsParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.callHierarchySlashoutgoingCalls
import typings.vscodeLanguageserverTypes.mod.CallHierarchyOutgoingCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CallHierarchyOutgoingCallsRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "CallHierarchyOutgoingCallsRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "CallHierarchyOutgoingCallsRequest.method")
  @js.native
  val method: callHierarchySlashoutgoingCalls = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "CallHierarchyOutgoingCallsRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    CallHierarchyOutgoingCallsParams, 
    js.Array[CallHierarchyOutgoingCall] | Null, 
    js.Array[CallHierarchyOutgoingCall], 
    Unit, 
    Unit
  ] = js.native
}
