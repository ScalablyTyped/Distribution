package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashprepareTypeHierarchy
import typings.vscodeLanguageserverProtocol.protocolTypeHierarchyMod.TypeHierarchyPrepareParams
import typings.vscodeLanguageserverProtocol.protocolTypeHierarchyMod.TypeHierarchyRegistrationOptions
import typings.vscodeLanguageserverTypes.mod.TypeHierarchyItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TypeHierarchyPrepareRequest {
  
  @JSImport("vscode-languageclient", "TypeHierarchyPrepareRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "TypeHierarchyPrepareRequest.method")
  @js.native
  val method: textDocumentSlashprepareTypeHierarchy = js.native
  
  @JSImport("vscode-languageclient", "TypeHierarchyPrepareRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType[
    TypeHierarchyPrepareParams, 
    js.Array[TypeHierarchyItem] | Null, 
    scala.Nothing, 
    Unit, 
    TypeHierarchyRegistrationOptions
  ] = js.native
}
