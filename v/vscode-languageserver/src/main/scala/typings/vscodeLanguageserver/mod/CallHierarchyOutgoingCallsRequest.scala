package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.callHierarchySlashoutgoingCalls
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotcallHierarchyMod.CallHierarchyOutgoingCallsParams
import typings.vscodeLanguageserverTypes.mod.CallHierarchyOutgoingCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CallHierarchyOutgoingCallsRequest {
  
  @JSImport("vscode-languageserver", "CallHierarchyOutgoingCallsRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "CallHierarchyOutgoingCallsRequest.method")
  @js.native
  val method: callHierarchySlashoutgoingCalls = js.native
  
  @JSImport("vscode-languageserver", "CallHierarchyOutgoingCallsRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    CallHierarchyOutgoingCallsParams, 
    js.Array[CallHierarchyOutgoingCall] | Null, 
    js.Array[CallHierarchyOutgoingCall], 
    Unit, 
    Unit
  ] = js.native
}
