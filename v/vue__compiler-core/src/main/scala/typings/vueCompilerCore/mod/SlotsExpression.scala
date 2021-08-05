package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vueCompilerCore.mod.SlotsObjectExpression
  - typings.vueCompilerCore.mod.DynamicSlotsExpression
*/
trait SlotsExpression extends StObject
object SlotsExpression {
  
  inline def DynamicSlotsExpression(
    arguments: js.Tuple2[SlotsObjectExpression, DynamicSlotEntries],
    callee: js.Symbol,
    loc: SourceLocation
  ): typings.vueCompilerCore.mod.DynamicSlotsExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(14)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.DynamicSlotsExpression]
  }
  
  inline def SlotsObjectExpression(loc: SourceLocation, properties: js.Array[SlotsObjectProperty]): typings.vueCompilerCore.mod.SlotsObjectExpression = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(15)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.SlotsObjectExpression]
  }
}
