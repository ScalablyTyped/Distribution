package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swcWasm.mod.ExportNamespaceSpecifier
  - typings.swcWasm.mod.ExportDefaultSpecifier
  - typings.swcWasm.mod.NamedExportSpecifier
*/
trait ExportSpecifier extends StObject
object ExportSpecifier {
  
  inline def ExportDefaultSpecifier(exported: Identifier, span: Span): typings.swcWasm.mod.ExportDefaultSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportDefaultSpecifier")
    __obj.asInstanceOf[typings.swcWasm.mod.ExportDefaultSpecifier]
  }
  
  inline def ExportNamespaceSpecifier(name: ModuleExportName, span: Span): typings.swcWasm.mod.ExportNamespaceSpecifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportNamespaceSpecifier")
    __obj.asInstanceOf[typings.swcWasm.mod.ExportNamespaceSpecifier]
  }
  
  inline def NamedExportSpecifier(isTypeOnly: Boolean, orig: ModuleExportName, span: Span): typings.swcWasm.mod.NamedExportSpecifier = {
    val __obj = js.Dynamic.literal(isTypeOnly = isTypeOnly.asInstanceOf[js.Any], orig = orig.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportSpecifier")
    __obj.asInstanceOf[typings.swcWasm.mod.NamedExportSpecifier]
  }
}
