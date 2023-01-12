package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IfConditionalExpression
  extends StObject
     with ConditionalExpression {
  
  @JSName("alternate")
  var alternate_IfConditionalExpression: BlockCodegenNode | IfConditionalExpression | MemoExpression
  
  @JSName("consequent")
  var consequent_IfConditionalExpression: BlockCodegenNode | MemoExpression
}
object IfConditionalExpression {
  
  inline def apply(
    alternate: BlockCodegenNode | IfConditionalExpression | MemoExpression,
    consequent: BlockCodegenNode | MemoExpression,
    loc: SourceLocation,
    newline: Boolean,
    test: JSChildNode
  ): IfConditionalExpression = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], newline = newline.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(19)
    __obj.asInstanceOf[IfConditionalExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IfConditionalExpression] (val x: Self) extends AnyVal {
    
    inline def setAlternate(value: BlockCodegenNode | IfConditionalExpression | MemoExpression): Self = StObject.set(x, "alternate", value.asInstanceOf[js.Any])
    
    inline def setConsequent(value: BlockCodegenNode | MemoExpression): Self = StObject.set(x, "consequent", value.asInstanceOf[js.Any])
  }
}
