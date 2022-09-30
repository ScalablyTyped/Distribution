package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportDeclaration
  extends StObject
     with Node
     with HasSpan
     with ModuleDeclaration {
  
  var asserts: js.UndefOr[ObjectExpression] = js.undefined
  
  var source: StringLiteral
  
  var specifiers: js.Array[ImportSpecifier]
  
  var typeOnly: Boolean
  
  @JSName("type")
  var type_ImportDeclaration: typings.swcWasm.swcWasmStrings.ImportDeclaration
}
object ImportDeclaration {
  
  inline def apply(source: StringLiteral, span: Span, specifiers: js.Array[ImportSpecifier], typeOnly: Boolean): ImportDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any], typeOnly = typeOnly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportDeclaration")
    __obj.asInstanceOf[ImportDeclaration]
  }
  
  extension [Self <: ImportDeclaration](x: Self) {
    
    inline def setAsserts(value: ObjectExpression): Self = StObject.set(x, "asserts", value.asInstanceOf[js.Any])
    
    inline def setAssertsUndefined: Self = StObject.set(x, "asserts", js.undefined)
    
    inline def setSource(value: StringLiteral): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSpecifiers(value: js.Array[ImportSpecifier]): Self = StObject.set(x, "specifiers", value.asInstanceOf[js.Any])
    
    inline def setSpecifiersVarargs(value: ImportSpecifier*): Self = StObject.set(x, "specifiers", js.Array(value*))
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.ImportDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeOnly(value: Boolean): Self = StObject.set(x, "typeOnly", value.asInstanceOf[js.Any])
  }
}
