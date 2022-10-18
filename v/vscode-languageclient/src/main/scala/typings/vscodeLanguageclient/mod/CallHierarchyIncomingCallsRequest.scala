package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.callHierarchySlashincomingCalls
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotcallHierarchyMod.CallHierarchyIncomingCallsParams
import typings.vscodeLanguageserverTypes.mod.CallHierarchyIncomingCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CallHierarchyIncomingCallsRequest {
  
  @JSImport("vscode-languageclient", "CallHierarchyIncomingCallsRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "CallHierarchyIncomingCallsRequest.method")
  @js.native
  val method: callHierarchySlashincomingCalls = js.native
  
  @JSImport("vscode-languageclient", "CallHierarchyIncomingCallsRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    CallHierarchyIncomingCallsParams, 
    js.Array[CallHierarchyIncomingCall] | Null, 
    js.Array[CallHierarchyIncomingCall], 
    Unit, 
    Unit
  ] = js.native
}
