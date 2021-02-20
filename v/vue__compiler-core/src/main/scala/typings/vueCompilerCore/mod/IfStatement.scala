package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`23`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IfStatement
  extends SSRCodegenNode
     with Node2 {
  
  var alternate: js.UndefOr[IfStatement | BlockStatement | ReturnStatement] = js.native
  
  var consequent: BlockStatement = js.native
  
  var test: ExpressionNode = js.native
  
  @JSName("type")
  var type_IfStatement: `23` = js.native
}
object IfStatement {
  
  @scala.inline
  def apply(consequent: BlockStatement, loc: SourceLocation, test: ExpressionNode, `type`: `23`): IfStatement = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfStatement]
  }
  
  @scala.inline
  implicit class IfStatementMutableBuilder[Self <: IfStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternate(value: IfStatement | BlockStatement | ReturnStatement): Self = StObject.set(x, "alternate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternateUndefined: Self = StObject.set(x, "alternate", js.undefined)
    
    @scala.inline
    def setConsequent(value: BlockStatement): Self = StObject.set(x, "consequent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest(value: ExpressionNode): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `23`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
