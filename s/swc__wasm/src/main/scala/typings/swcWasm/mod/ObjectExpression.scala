package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectExpression
  extends StObject
     with ExpressionBase
     with Expression {
  
  var properties: js.Array[SpreadElement | Property]
  
  @JSName("type")
  var type_ObjectExpression: typings.swcWasm.swcWasmStrings.ObjectExpression
}
object ObjectExpression {
  
  inline def apply(properties: js.Array[SpreadElement | Property], span: Span): ObjectExpression = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectExpression")
    __obj.asInstanceOf[ObjectExpression]
  }
  
  extension [Self <: ObjectExpression](x: Self) {
    
    inline def setProperties(value: js.Array[SpreadElement | Property]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesVarargs(value: (SpreadElement | Property)*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.ObjectExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
