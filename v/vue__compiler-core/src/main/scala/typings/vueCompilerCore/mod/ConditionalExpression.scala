package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`19`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionalExpression
  extends JSChildNode
     with Node2 {
  
  var alternate: JSChildNode = js.native
  
  var consequent: JSChildNode = js.native
  
  var newline: Boolean = js.native
  
  var test: JSChildNode = js.native
  
  @JSName("type")
  var type_ConditionalExpression: `19` = js.native
}
object ConditionalExpression {
  
  @scala.inline
  def apply(
    alternate: JSChildNode,
    consequent: JSChildNode,
    loc: SourceLocation,
    newline: Boolean,
    test: JSChildNode,
    `type`: `19`
  ): ConditionalExpression = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], newline = newline.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalExpression]
  }
  
  @scala.inline
  implicit class ConditionalExpressionMutableBuilder[Self <: ConditionalExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternate(value: JSChildNode): Self = StObject.set(x, "alternate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsequent(value: JSChildNode): Self = StObject.set(x, "consequent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewline(value: Boolean): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest(value: JSChildNode): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `19`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
