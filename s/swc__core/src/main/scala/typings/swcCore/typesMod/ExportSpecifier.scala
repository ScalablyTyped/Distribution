package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swcCore.typesMod.ExportNamespaceSpecifier
  - typings.swcCore.typesMod.ExportDefaultSpecifier
  - typings.swcCore.typesMod.NamedExportSpecifier
*/
trait ExportSpecifier extends StObject
object ExportSpecifier {
  
  inline def ExportDefaultSpecifier(exported: Identifier, span: Span): typings.swcCore.typesMod.ExportDefaultSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportDefaultSpecifier")
    __obj.asInstanceOf[typings.swcCore.typesMod.ExportDefaultSpecifier]
  }
  
  inline def ExportNamespaceSpecifier(name: ModuleExportName, span: Span): typings.swcCore.typesMod.ExportNamespaceSpecifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportNamespaceSpecifier")
    __obj.asInstanceOf[typings.swcCore.typesMod.ExportNamespaceSpecifier]
  }
  
  inline def NamedExportSpecifier(isTypeOnly: Boolean, orig: ModuleExportName, span: Span): typings.swcCore.typesMod.NamedExportSpecifier = {
    val __obj = js.Dynamic.literal(isTypeOnly = isTypeOnly.asInstanceOf[js.Any], orig = orig.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportSpecifier")
    __obj.asInstanceOf[typings.swcCore.typesMod.NamedExportSpecifier]
  }
}
