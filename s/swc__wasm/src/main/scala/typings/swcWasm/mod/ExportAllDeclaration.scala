package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportAllDeclaration
  extends StObject
     with Node
     with HasSpan
     with ModuleDeclaration {
  
  var asserts: js.UndefOr[ObjectExpression] = js.undefined
  
  var source: StringLiteral
  
  @JSName("type")
  var type_ExportAllDeclaration: typings.swcWasm.swcWasmStrings.ExportAllDeclaration
}
object ExportAllDeclaration {
  
  inline def apply(source: StringLiteral, span: Span): ExportAllDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportAllDeclaration")
    __obj.asInstanceOf[ExportAllDeclaration]
  }
  
  extension [Self <: ExportAllDeclaration](x: Self) {
    
    inline def setAsserts(value: ObjectExpression): Self = StObject.set(x, "asserts", value.asInstanceOf[js.Any])
    
    inline def setAssertsUndefined: Self = StObject.set(x, "asserts", js.undefined)
    
    inline def setSource(value: StringLiteral): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.ExportAllDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
