package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swcCore.typesMod.TsModuleBlock
  - typings.swcCore.typesMod.TsNamespaceDeclaration
*/
trait TsNamespaceBody extends StObject
object TsNamespaceBody {
  
  inline def TsModuleBlock(body: js.Array[ModuleItem], span: Span): typings.swcCore.typesMod.TsModuleBlock = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsModuleBlock")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsModuleBlock]
  }
  
  inline def TsNamespaceDeclaration(body: TsNamespaceBody, declare: Boolean, global: Boolean, id: Identifier, span: Span): typings.swcCore.typesMod.TsNamespaceDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], declare = declare.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsNamespaceDeclaration")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsNamespaceDeclaration]
  }
}
