package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`14`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamicSlotsExpression
  extends CallExpression
     with SlotsExpression {
  
  @JSName("arguments")
  var arguments_DynamicSlotsExpression: js.Tuple2[SlotsObjectExpression, DynamicSlotEntries] = js.native
  
  @JSName("callee")
  var callee_DynamicSlotsExpression: js.Symbol = js.native
}
object DynamicSlotsExpression {
  
  @scala.inline
  def apply(
    arguments: js.Tuple2[SlotsObjectExpression, DynamicSlotEntries],
    callee: js.Symbol,
    loc: SourceLocation,
    `type`: `14`
  ): DynamicSlotsExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicSlotsExpression]
  }
  
  @scala.inline
  implicit class DynamicSlotsExpressionMutableBuilder[Self <: DynamicSlotsExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: js.Tuple2[SlotsObjectExpression, DynamicSlotEntries]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallee(value: js.Symbol): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
  }
}
