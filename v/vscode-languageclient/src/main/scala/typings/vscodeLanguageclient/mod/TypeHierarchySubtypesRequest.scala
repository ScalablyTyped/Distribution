package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.typeHierarchySlashsubtypes
import typings.vscodeLanguageserverProtocol.libCommonProtocolDottypeHierarchyMod.TypeHierarchySubtypesParams
import typings.vscodeLanguageserverTypes.mod.TypeHierarchyItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TypeHierarchySubtypesRequest {
  
  @JSImport("vscode-languageclient", "TypeHierarchySubtypesRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "TypeHierarchySubtypesRequest.method")
  @js.native
  val method: typeHierarchySlashsubtypes = js.native
  
  @JSImport("vscode-languageclient", "TypeHierarchySubtypesRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    TypeHierarchySubtypesParams, 
    js.Array[TypeHierarchyItem] | Null, 
    js.Array[TypeHierarchyItem], 
    Unit, 
    Unit
  ] = js.native
}
