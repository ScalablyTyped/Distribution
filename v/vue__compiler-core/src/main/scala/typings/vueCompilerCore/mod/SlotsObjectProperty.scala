package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`16`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlotsObjectProperty extends Property {
  
  @JSName("value")
  var value_SlotsObjectProperty: SlotFunctionExpression = js.native
}
object SlotsObjectProperty {
  
  @scala.inline
  def apply(key: ExpressionNode, loc: SourceLocation, `type`: `16`, value: SlotFunctionExpression): SlotsObjectProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotsObjectProperty]
  }
  
  @scala.inline
  implicit class SlotsObjectPropertyMutableBuilder[Self <: SlotsObjectProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: SlotFunctionExpression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
