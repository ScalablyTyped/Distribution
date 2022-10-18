package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotcallHierarchyMod.CallHierarchyIncomingCallsParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.callHierarchySlashincomingCalls
import typings.vscodeLanguageserverTypes.mod.CallHierarchyIncomingCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CallHierarchyIncomingCallsRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "CallHierarchyIncomingCallsRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "CallHierarchyIncomingCallsRequest.method")
  @js.native
  val method: callHierarchySlashincomingCalls = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "CallHierarchyIncomingCallsRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    CallHierarchyIncomingCallsParams, 
    js.Array[CallHierarchyIncomingCall] | Null, 
    js.Array[CallHierarchyIncomingCall], 
    Unit, 
    Unit
  ] = js.native
}
