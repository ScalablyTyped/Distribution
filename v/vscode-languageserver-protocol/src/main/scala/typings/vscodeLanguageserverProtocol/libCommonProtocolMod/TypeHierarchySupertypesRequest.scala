package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.libCommonProtocolDottypeHierarchyMod.TypeHierarchySupertypesParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.typeHierarchySlashsupertypes
import typings.vscodeLanguageserverTypes.mod.TypeHierarchyItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TypeHierarchySupertypesRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "TypeHierarchySupertypesRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "TypeHierarchySupertypesRequest.method")
  @js.native
  val method: typeHierarchySlashsupertypes = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "TypeHierarchySupertypesRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    TypeHierarchySupertypesParams, 
    js.Array[TypeHierarchyItem] | Null, 
    js.Array[TypeHierarchyItem], 
    Unit, 
    Unit
  ] = js.native
}
