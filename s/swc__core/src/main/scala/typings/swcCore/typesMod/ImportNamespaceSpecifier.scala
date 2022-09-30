package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportNamespaceSpecifier
  extends StObject
     with Node
     with HasSpan
     with ImportSpecifier {
  
  var local: Identifier
  
  @JSName("type")
  var type_ImportNamespaceSpecifier: typings.swcCore.swcCoreStrings.ImportNamespaceSpecifier
}
object ImportNamespaceSpecifier {
  
  inline def apply(local: Identifier, span: Span): ImportNamespaceSpecifier = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportNamespaceSpecifier")
    __obj.asInstanceOf[ImportNamespaceSpecifier]
  }
  
  extension [Self <: ImportNamespaceSpecifier](x: Self) {
    
    inline def setLocal(value: Identifier): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.ImportNamespaceSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
