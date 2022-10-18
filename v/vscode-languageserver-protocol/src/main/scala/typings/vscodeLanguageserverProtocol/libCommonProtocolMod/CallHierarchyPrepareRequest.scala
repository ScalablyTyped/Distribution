package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotcallHierarchyMod.CallHierarchyPrepareParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotcallHierarchyMod.CallHierarchyRegistrationOptions
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
