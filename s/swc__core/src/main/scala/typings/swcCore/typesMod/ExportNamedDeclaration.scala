package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportNamedDeclaration
  extends StObject
     with Node
     with HasSpan
     with ModuleDeclaration {
  
  var asserts: js.UndefOr[ObjectExpression] = js.undefined
  
  var source: js.UndefOr[StringLiteral] = js.undefined
  
  var specifiers: js.Array[ExportSpecifier]
  
  var typeOnly: Boolean
  
  @JSName("type")
  var type_ExportNamedDeclaration: typings.swcCore.swcCoreStrings.ExportNamedDeclaration
}
object ExportNamedDeclaration {
  
  inline def apply(span: Span, specifiers: js.Array[ExportSpecifier], typeOnly: Boolean): ExportNamedDeclaration = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any], typeOnly = typeOnly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportNamedDeclaration")
    __obj.asInstanceOf[ExportNamedDeclaration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportNamedDeclaration] (val x: Self) extends AnyVal {
    
    inline def setAsserts(value: ObjectExpression): Self = StObject.set(x, "asserts", value.asInstanceOf[js.Any])
    
    inline def setAssertsUndefined: Self = StObject.set(x, "asserts", js.undefined)
    
    inline def setSource(value: StringLiteral): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSpecifiers(value: js.Array[ExportSpecifier]): Self = StObject.set(x, "specifiers", value.asInstanceOf[js.Any])
    
    inline def setSpecifiersVarargs(value: ExportSpecifier*): Self = StObject.set(x, "specifiers", js.Array(value*))
    
    inline def setType(value: typings.swcCore.swcCoreStrings.ExportNamedDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeOnly(value: Boolean): Self = StObject.set(x, "typeOnly", value.asInstanceOf[js.Any])
  }
}
