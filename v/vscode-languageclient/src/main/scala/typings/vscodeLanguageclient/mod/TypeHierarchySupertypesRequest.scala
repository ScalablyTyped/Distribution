package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.typeHierarchySlashsupertypes
import typings.vscodeLanguageserverProtocol.protocolTypeHierarchyMod.TypeHierarchySupertypesParams
import typings.vscodeLanguageserverTypes.mod.TypeHierarchyItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TypeHierarchySupertypesRequest {
  
  @JSImport("vscode-languageclient", "TypeHierarchySupertypesRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "TypeHierarchySupertypesRequest.method")
  @js.native
  val method: typeHierarchySlashsupertypes = js.native
  
  @JSImport("vscode-languageclient", "TypeHierarchySupertypesRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType[
    TypeHierarchySupertypesParams, 
    js.Array[TypeHierarchyItem] | Null, 
    js.Array[TypeHierarchyItem], 
    Unit, 
    Unit
  ] = js.native
}
