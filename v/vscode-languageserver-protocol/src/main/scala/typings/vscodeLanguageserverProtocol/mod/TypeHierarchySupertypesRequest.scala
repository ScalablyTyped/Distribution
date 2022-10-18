package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.libCommonProtocolDottypeHierarchyMod.TypeHierarchySupertypesParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.typeHierarchySlashsupertypes
import typings.vscodeLanguageserverTypes.mod.TypeHierarchyItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TypeHierarchySupertypesRequest {
  
  @JSImport("vscode-languageserver-protocol", "TypeHierarchySupertypesRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "TypeHierarchySupertypesRequest.method")
  @js.native
  val method: typeHierarchySlashsupertypes = js.native
  
  @JSImport("vscode-languageserver-protocol", "TypeHierarchySupertypesRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    TypeHierarchySupertypesParams, 
    js.Array[TypeHierarchyItem] | Null, 
    js.Array[TypeHierarchyItem], 
    Unit, 
    Unit
  ] = js.native
}
