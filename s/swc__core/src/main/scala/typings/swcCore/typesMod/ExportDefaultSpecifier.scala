package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportDefaultSpecifier
  extends StObject
     with Node
     with HasSpan
     with ExportSpecifier {
  
  var exported: Identifier
  
  @JSName("type")
  var type_ExportDefaultSpecifier: typings.swcCore.swcCoreStrings.ExportDefaultSpecifier
}
object ExportDefaultSpecifier {
  
  inline def apply(exported: Identifier, span: Span): ExportDefaultSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportDefaultSpecifier")
    __obj.asInstanceOf[ExportDefaultSpecifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportDefaultSpecifier] (val x: Self) extends AnyVal {
    
    inline def setExported(value: Identifier): Self = StObject.set(x, "exported", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.ExportDefaultSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
