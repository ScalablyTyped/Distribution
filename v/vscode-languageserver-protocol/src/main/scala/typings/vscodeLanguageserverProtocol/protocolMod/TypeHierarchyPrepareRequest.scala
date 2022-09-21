package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolTypeHierarchyMod.TypeHierarchyPrepareParams
import typings.vscodeLanguageserverProtocol.protocolTypeHierarchyMod.TypeHierarchyRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashprepareTypeHierarchy
import typings.vscodeLanguageserverTypes.mod.TypeHierarchyItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TypeHierarchyPrepareRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "TypeHierarchyPrepareRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "TypeHierarchyPrepareRequest.method")
  @js.native
  val method: textDocumentSlashprepareTypeHierarchy = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "TypeHierarchyPrepareRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    TypeHierarchyPrepareParams, 
    js.Array[TypeHierarchyItem] | Null, 
    scala.Nothing, 
    Unit, 
    TypeHierarchyRegistrationOptions
  ] = js.native
}
