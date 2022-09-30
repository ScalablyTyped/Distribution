package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuperPropExpression
  extends StObject
     with ExpressionBase
     with Expression {
  
  var obj: Super
  
  var property: Identifier | ComputedPropName
  
  @JSName("type")
  var type_SuperPropExpression: typings.swcWasm.swcWasmStrings.SuperPropExpression
}
object SuperPropExpression {
  
  inline def apply(obj: Super, property: Identifier | ComputedPropName, span: Span): SuperPropExpression = {
    val __obj = js.Dynamic.literal(obj = obj.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SuperPropExpression")
    __obj.asInstanceOf[SuperPropExpression]
  }
  
  extension [Self <: SuperPropExpression](x: Self) {
    
    inline def setObj(value: Super): Self = StObject.set(x, "obj", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: Identifier | ComputedPropName): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.SuperPropExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
