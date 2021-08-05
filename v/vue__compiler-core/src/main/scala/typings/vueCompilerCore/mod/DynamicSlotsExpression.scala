package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicSlotsExpression
  extends StObject
     with CallExpression
     with SlotsExpression {
  
  @JSName("arguments")
  var arguments_DynamicSlotsExpression: js.Tuple2[SlotsObjectExpression, DynamicSlotEntries]
  
  @JSName("callee")
  var callee_DynamicSlotsExpression: js.Symbol
}
object DynamicSlotsExpression {
  
  inline def apply(
    arguments: js.Tuple2[SlotsObjectExpression, DynamicSlotEntries],
    callee: js.Symbol,
    loc: SourceLocation
  ): DynamicSlotsExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(14)
    __obj.asInstanceOf[DynamicSlotsExpression]
  }
  
  extension [Self <: DynamicSlotsExpression](x: Self) {
    
    inline def setArguments(value: js.Tuple2[SlotsObjectExpression, DynamicSlotEntries]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCallee(value: js.Symbol): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
  }
}
