package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashprepareCallHierarchy
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotcallHierarchyMod.CallHierarchyPrepareParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotcallHierarchyMod.CallHierarchyRegistrationOptions
import typings.vscodeLanguageserverTypes.mod.CallHierarchyItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CallHierarchyPrepareRequest {
  
  @JSImport("vscode-languageserver", "CallHierarchyPrepareRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "CallHierarchyPrepareRequest.method")
  @js.native
  val method: textDocumentSlashprepareCallHierarchy = js.native
  
  @JSImport("vscode-languageserver", "CallHierarchyPrepareRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    CallHierarchyPrepareParams, 
    js.Array[CallHierarchyItem] | Null, 
    scala.Nothing, 
    Unit, 
    CallHierarchyRegistrationOptions
  ] = js.native
}
