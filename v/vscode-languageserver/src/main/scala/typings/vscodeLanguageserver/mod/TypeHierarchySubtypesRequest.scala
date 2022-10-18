package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.typeHierarchySlashsubtypes
import typings.vscodeLanguageserverProtocol.libCommonProtocolDottypeHierarchyMod.TypeHierarchySubtypesParams
import typings.vscodeLanguageserverTypes.mod.TypeHierarchyItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TypeHierarchySubtypesRequest {
  
  @JSImport("vscode-languageserver", "TypeHierarchySubtypesRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "TypeHierarchySubtypesRequest.method")
  @js.native
  val method: typeHierarchySlashsubtypes = js.native
  
  @JSImport("vscode-languageserver", "TypeHierarchySubtypesRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    TypeHierarchySubtypesParams, 
    js.Array[TypeHierarchyItem] | Null, 
    js.Array[TypeHierarchyItem], 
    Unit, 
    Unit
  ] = js.native
}
