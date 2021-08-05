package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotsObjectProperty
  extends StObject
     with Property {
  
  @JSName("value")
  var value_SlotsObjectProperty: SlotFunctionExpression
}
object SlotsObjectProperty {
  
  inline def apply(key: ExpressionNode, loc: SourceLocation, value: SlotFunctionExpression): SlotsObjectProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(16)
    __obj.asInstanceOf[SlotsObjectProperty]
  }
  
  extension [Self <: SlotsObjectProperty](x: Self) {
    
    inline def setValue(value: SlotFunctionExpression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
