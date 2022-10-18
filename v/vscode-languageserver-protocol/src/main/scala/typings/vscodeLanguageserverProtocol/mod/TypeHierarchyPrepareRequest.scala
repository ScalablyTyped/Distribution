package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.libCommonProtocolDottypeHierarchyMod.TypeHierarchyPrepareParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDottypeHierarchyMod.TypeHierarchyRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashprepareTypeHierarchy
import typings.vscodeLanguageserverTypes.mod.TypeHierarchyItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TypeHierarchyPrepareRequest {
  
  @JSImport("vscode-languageserver-protocol", "TypeHierarchyPrepareRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "TypeHierarchyPrepareRequest.method")
  @js.native
  val method: textDocumentSlashprepareTypeHierarchy = js.native
  
  @JSImport("vscode-languageserver-protocol", "TypeHierarchyPrepareRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    TypeHierarchyPrepareParams, 
    js.Array[TypeHierarchyItem] | Null, 
    scala.Nothing, 
    Unit, 
    TypeHierarchyRegistrationOptions
  ] = js.native
}
