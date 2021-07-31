package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IfConditionalExpression
  extends StObject
     with ConditionalExpression {
  
  @JSName("alternate")
  var alternate_IfConditionalExpression: BlockCodegenNode | IfConditionalExpression
  
  @JSName("consequent")
  var consequent_IfConditionalExpression: BlockCodegenNode
}
object IfConditionalExpression {
  
  @scala.inline
  def apply(
    alternate: BlockCodegenNode | IfConditionalExpression,
    consequent: BlockCodegenNode,
    loc: SourceLocation,
    newline: Boolean,
    test: JSChildNode
  ): IfConditionalExpression = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], newline = newline.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(19)
    __obj.asInstanceOf[IfConditionalExpression]
  }
  
  @scala.inline
  implicit class IfConditionalExpressionMutableBuilder[Self <: IfConditionalExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternate(value: BlockCodegenNode | IfConditionalExpression): Self = StObject.set(x, "alternate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsequent(value: BlockCodegenNode): Self = StObject.set(x, "consequent", value.asInstanceOf[js.Any])
  }
}
