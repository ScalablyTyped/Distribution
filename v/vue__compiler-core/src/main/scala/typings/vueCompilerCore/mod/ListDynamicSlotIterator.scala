package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`18`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDynamicSlotIterator extends FunctionExpression {
  
  @JSName("returns")
  var returns_ListDynamicSlotIterator: DynamicSlotNode = js.native
}
object ListDynamicSlotIterator {
  
  @scala.inline
  def apply(isSlot: Boolean, loc: SourceLocation, newline: Boolean, returns: DynamicSlotNode, `type`: `18`): ListDynamicSlotIterator = {
    val __obj = js.Dynamic.literal(isSlot = isSlot.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], newline = newline.asInstanceOf[js.Any], returns = returns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDynamicSlotIterator]
  }
  
  @scala.inline
  implicit class ListDynamicSlotIteratorMutableBuilder[Self <: ListDynamicSlotIterator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReturns(value: DynamicSlotNode): Self = StObject.set(x, "returns", value.asInstanceOf[js.Any])
  }
}
