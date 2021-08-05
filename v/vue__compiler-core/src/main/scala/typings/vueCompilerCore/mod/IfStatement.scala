package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`23`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IfStatement
  extends StObject
     with Node2
     with SSRCodegenNode {
  
  var alternate: js.UndefOr[IfStatement | BlockStatement | ReturnStatement] = js.undefined
  
  var consequent: BlockStatement
  
  var test: ExpressionNode
  
  @JSName("type")
  var type_IfStatement: `23`
}
object IfStatement {
  
  inline def apply(consequent: BlockStatement, loc: SourceLocation, test: ExpressionNode): IfStatement = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(23)
    __obj.asInstanceOf[IfStatement]
  }
  
  extension [Self <: IfStatement](x: Self) {
    
    inline def setAlternate(value: IfStatement | BlockStatement | ReturnStatement): Self = StObject.set(x, "alternate", value.asInstanceOf[js.Any])
    
    inline def setAlternateUndefined: Self = StObject.set(x, "alternate", js.undefined)
    
    inline def setConsequent(value: BlockStatement): Self = StObject.set(x, "consequent", value.asInstanceOf[js.Any])
    
    inline def setTest(value: ExpressionNode): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setType(value: `23`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
