package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsNamespaceExportDeclaration
  extends StObject
     with Node
     with HasSpan
     with ModuleDeclaration {
  
  var id: Identifier
  
  @JSName("type")
  var type_TsNamespaceExportDeclaration: typings.swcCore.swcCoreStrings.TsNamespaceExportDeclaration
}
object TsNamespaceExportDeclaration {
  
  inline def apply(id: Identifier, span: Span): TsNamespaceExportDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsNamespaceExportDeclaration")
    __obj.asInstanceOf[TsNamespaceExportDeclaration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TsNamespaceExportDeclaration] (val x: Self) extends AnyVal {
    
    inline def setId(value: Identifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.TsNamespaceExportDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
