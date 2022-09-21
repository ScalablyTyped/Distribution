package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.protocolTypeHierarchyMod.TypeHierarchySubtypesParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.typeHierarchySlashsubtypes
import typings.vscodeLanguageserverTypes.mod.TypeHierarchyItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TypeHierarchySubtypesRequest {
  
  @JSImport("vscode-languageserver-protocol", "TypeHierarchySubtypesRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "TypeHierarchySubtypesRequest.method")
  @js.native
  val method: typeHierarchySlashsubtypes = js.native
  
  @JSImport("vscode-languageserver-protocol", "TypeHierarchySubtypesRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType[
    TypeHierarchySubtypesParams, 
    js.Array[TypeHierarchyItem] | Null, 
    js.Array[TypeHierarchyItem], 
    Unit, 
    Unit
  ] = js.native
}
