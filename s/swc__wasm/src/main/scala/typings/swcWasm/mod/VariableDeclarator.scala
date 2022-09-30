package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariableDeclarator
  extends StObject
     with Node
     with HasSpan {
  
  /// Typescript only
  var definite: Boolean
  
  var id: Pattern
  
  /// Initialization expression.
  var init: js.UndefOr[Expression] = js.undefined
  
  @JSName("type")
  var type_VariableDeclarator: typings.swcWasm.swcWasmStrings.VariableDeclarator
}
object VariableDeclarator {
  
  inline def apply(definite: Boolean, id: Pattern, span: Span): VariableDeclarator = {
    val __obj = js.Dynamic.literal(definite = definite.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VariableDeclarator")
    __obj.asInstanceOf[VariableDeclarator]
  }
  
  extension [Self <: VariableDeclarator](x: Self) {
    
    inline def setDefinite(value: Boolean): Self = StObject.set(x, "definite", value.asInstanceOf[js.Any])
    
    inline def setId(value: Pattern): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInit(value: Expression): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.VariableDeclarator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
