package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportDefaultSpecifier
  extends StObject
     with Node
     with HasSpan
     with ImportSpecifier {
  
  var local: Identifier
  
  @JSName("type")
  var type_ImportDefaultSpecifier: typings.swcCore.swcCoreStrings.ImportDefaultSpecifier
}
object ImportDefaultSpecifier {
  
  inline def apply(local: Identifier, span: Span): ImportDefaultSpecifier = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportDefaultSpecifier")
    __obj.asInstanceOf[ImportDefaultSpecifier]
  }
  
  extension [Self <: ImportDefaultSpecifier](x: Self) {
    
    inline def setLocal(value: Identifier): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.ImportDefaultSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
