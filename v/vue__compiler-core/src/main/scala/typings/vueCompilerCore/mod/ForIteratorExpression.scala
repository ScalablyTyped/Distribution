package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`18`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForIteratorExpression extends FunctionExpression {
  
  @JSName("returns")
  var returns_ForIteratorExpression: BlockCodegenNode = js.native
}
object ForIteratorExpression {
  
  @scala.inline
  def apply(isSlot: Boolean, loc: SourceLocation, newline: Boolean, returns: BlockCodegenNode, `type`: `18`): ForIteratorExpression = {
    val __obj = js.Dynamic.literal(isSlot = isSlot.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], newline = newline.asInstanceOf[js.Any], returns = returns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForIteratorExpression]
  }
  
  @scala.inline
  implicit class ForIteratorExpressionMutableBuilder[Self <: ForIteratorExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReturns(value: BlockCodegenNode): Self = StObject.set(x, "returns", value.asInstanceOf[js.Any])
  }
}
