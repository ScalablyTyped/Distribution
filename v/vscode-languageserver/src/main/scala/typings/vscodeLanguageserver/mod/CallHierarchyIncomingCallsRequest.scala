package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.callHierarchySlashincomingCalls
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotcallHierarchyMod.CallHierarchyIncomingCallsParams
import typings.vscodeLanguageserverTypes.mod.CallHierarchyIncomingCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CallHierarchyIncomingCallsRequest {
  
  @JSImport("vscode-languageserver", "CallHierarchyIncomingCallsRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "CallHierarchyIncomingCallsRequest.method")
  @js.native
  val method: callHierarchySlashincomingCalls = js.native
  
  @JSImport("vscode-languageserver", "CallHierarchyIncomingCallsRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    CallHierarchyIncomingCallsParams, 
    js.Array[CallHierarchyIncomingCall] | Null, 
    js.Array[CallHierarchyIncomingCall], 
    Unit, 
    Unit
  ] = js.native
}
