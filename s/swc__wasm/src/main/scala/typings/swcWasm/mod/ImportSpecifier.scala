package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swcWasm.mod.NamedImportSpecifier
  - typings.swcWasm.mod.ImportDefaultSpecifier
  - typings.swcWasm.mod.ImportNamespaceSpecifier
*/
trait ImportSpecifier extends StObject
object ImportSpecifier {
  
  inline def ImportDefaultSpecifier(local: Identifier, span: Span): typings.swcWasm.mod.ImportDefaultSpecifier = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportDefaultSpecifier")
    __obj.asInstanceOf[typings.swcWasm.mod.ImportDefaultSpecifier]
  }
  
  inline def ImportNamespaceSpecifier(local: Identifier, span: Span): typings.swcWasm.mod.ImportNamespaceSpecifier = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportNamespaceSpecifier")
    __obj.asInstanceOf[typings.swcWasm.mod.ImportNamespaceSpecifier]
  }
  
  inline def NamedImportSpecifier(isTypeOnly: Boolean, local: Identifier, span: Span): typings.swcWasm.mod.NamedImportSpecifier = {
    val __obj = js.Dynamic.literal(isTypeOnly = isTypeOnly.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportSpecifier")
    __obj.asInstanceOf[typings.swcWasm.mod.NamedImportSpecifier]
  }
}
