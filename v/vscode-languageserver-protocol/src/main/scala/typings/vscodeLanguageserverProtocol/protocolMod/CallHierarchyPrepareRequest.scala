package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolCallHierarchyMod.CallHierarchyPrepareParams
import typings.vscodeLanguageserverProtocol.protocolCallHierarchyMod.CallHierarchyRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashprepareCallHierarchy
import typings.vscodeLanguageserverTypes.mod.CallHierarchyItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CallHierarchyPrepareRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "CallHierarchyPrepareRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "CallHierarchyPrepareRequest.method")
  @js.native
  val method: textDocumentSlashprepareCallHierarchy = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "CallHierarchyPrepareRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    CallHierarchyPrepareParams, 
    js.Array[CallHierarchyItem] | Null, 
    scala.Nothing, 
    Unit, 
    CallHierarchyRegistrationOptions
  ] = js.native
}
