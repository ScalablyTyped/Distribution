package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.callHierarchySlashoutgoingCalls
import typings.vscodeLanguageserverProtocol.protocolCallHierarchyMod.CallHierarchyOutgoingCallsParams
import typings.vscodeLanguageserverTypes.mod.CallHierarchyOutgoingCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CallHierarchyOutgoingCallsRequest {
  
  @JSImport("vscode-languageclient", "CallHierarchyOutgoingCallsRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "CallHierarchyOutgoingCallsRequest.method")
  @js.native
  val method: callHierarchySlashoutgoingCalls = js.native
  
  @JSImport("vscode-languageclient", "CallHierarchyOutgoingCallsRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType[
    CallHierarchyOutgoingCallsParams, 
    js.Array[CallHierarchyOutgoingCall] | Null, 
    js.Array[CallHierarchyOutgoingCall], 
    Unit, 
    Unit
  ] = js.native
}
