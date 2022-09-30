package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swcCore.typesMod.NamedImportSpecifier
  - typings.swcCore.typesMod.ImportDefaultSpecifier
  - typings.swcCore.typesMod.ImportNamespaceSpecifier
*/
trait ImportSpecifier extends StObject
object ImportSpecifier {
  
  inline def ImportDefaultSpecifier(local: Identifier, span: Span): typings.swcCore.typesMod.ImportDefaultSpecifier = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportDefaultSpecifier")
    __obj.asInstanceOf[typings.swcCore.typesMod.ImportDefaultSpecifier]
  }
  
  inline def ImportNamespaceSpecifier(local: Identifier, span: Span): typings.swcCore.typesMod.ImportNamespaceSpecifier = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportNamespaceSpecifier")
    __obj.asInstanceOf[typings.swcCore.typesMod.ImportNamespaceSpecifier]
  }
  
  inline def NamedImportSpecifier(isTypeOnly: Boolean, local: Identifier, span: Span): typings.swcCore.typesMod.NamedImportSpecifier = {
    val __obj = js.Dynamic.literal(isTypeOnly = isTypeOnly.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportSpecifier")
    __obj.asInstanceOf[typings.swcCore.typesMod.NamedImportSpecifier]
  }
}
