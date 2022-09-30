package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariableDeclaration
  extends StObject
     with Node
     with HasSpan
     with Declaration {
  
  var declarations: js.Array[VariableDeclarator]
  
  var declare: Boolean
  
  var kind: VariableDeclarationKind
  
  @JSName("type")
  var type_VariableDeclaration: typings.swcWasm.swcWasmStrings.VariableDeclaration
}
object VariableDeclaration {
  
  inline def apply(
    declarations: js.Array[VariableDeclarator],
    declare: Boolean,
    kind: VariableDeclarationKind,
    span: Span
  ): VariableDeclaration = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], declare = declare.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VariableDeclaration")
    __obj.asInstanceOf[VariableDeclaration]
  }
  
  extension [Self <: VariableDeclaration](x: Self) {
    
    inline def setDeclarations(value: js.Array[VariableDeclarator]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
    
    inline def setDeclarationsVarargs(value: VariableDeclarator*): Self = StObject.set(x, "declarations", js.Array(value*))
    
    inline def setDeclare(value: Boolean): Self = StObject.set(x, "declare", value.asInstanceOf[js.Any])
    
    inline def setKind(value: VariableDeclarationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.VariableDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
