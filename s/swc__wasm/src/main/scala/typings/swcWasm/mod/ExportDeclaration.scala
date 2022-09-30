package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportDeclaration
  extends StObject
     with Node
     with HasSpan
     with ModuleDeclaration {
  
  var declaration: Declaration
  
  @JSName("type")
  var type_ExportDeclaration: typings.swcWasm.swcWasmStrings.ExportDeclaration
}
object ExportDeclaration {
  
  inline def apply(declaration: Declaration, span: Span): ExportDeclaration = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportDeclaration")
    __obj.asInstanceOf[ExportDeclaration]
  }
  
  extension [Self <: ExportDeclaration](x: Self) {
    
    inline def setDeclaration(value: Declaration): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.ExportDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
