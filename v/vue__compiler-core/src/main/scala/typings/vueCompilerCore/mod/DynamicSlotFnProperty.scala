package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicSlotFnProperty
  extends StObject
     with Property {
  
  @JSName("value")
  var value_DynamicSlotFnProperty: SlotFunctionExpression
}
object DynamicSlotFnProperty {
  
  @scala.inline
  def apply(key: ExpressionNode, loc: SourceLocation, value: SlotFunctionExpression): DynamicSlotFnProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(16)
    __obj.asInstanceOf[DynamicSlotFnProperty]
  }
  
  @scala.inline
  implicit class DynamicSlotFnPropertyMutableBuilder[Self <: DynamicSlotFnProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: SlotFunctionExpression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
