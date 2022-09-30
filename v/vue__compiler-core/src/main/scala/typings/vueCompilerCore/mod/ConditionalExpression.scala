package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreInts.`19`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalExpression
  extends StObject
     with Node2
     with JSChildNode {
  
  var alternate: JSChildNode
  
  var consequent: JSChildNode
  
  var newline: Boolean
  
  var test: JSChildNode
  
  @JSName("type")
  var type_ConditionalExpression: `19`
}
object ConditionalExpression {
  
  inline def apply(
    alternate: JSChildNode,
    consequent: JSChildNode,
    loc: SourceLocation,
    newline: Boolean,
    test: JSChildNode
  ): ConditionalExpression = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], newline = newline.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(19)
    __obj.asInstanceOf[ConditionalExpression]
  }
  
  extension [Self <: ConditionalExpression](x: Self) {
    
    inline def setAlternate(value: JSChildNode): Self = StObject.set(x, "alternate", value.asInstanceOf[js.Any])
    
    inline def setConsequent(value: JSChildNode): Self = StObject.set(x, "consequent", value.asInstanceOf[js.Any])
    
    inline def setNewline(value: Boolean): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
    
    inline def setTest(value: JSChildNode): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setType(value: `19`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
