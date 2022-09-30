package typings.twig.mod

import typings.twig.twigStrings.TwigDotexpressionDottypeDotsubexpressionDotend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompiledSubexpressionToken
  extends StObject
     with CompiledGenericTokenWithMatch[TwigDotexpressionDottypeDotsubexpressionDotend, String] {
  
  var expression: Boolean
  
  var params: js.Array[CompiledToken]
}
object CompiledSubexpressionToken {
  
  inline def apply(expression: Boolean, `match`: js.Array[js.UndefOr[String | Any]], params: js.Array[CompiledToken]): CompiledSubexpressionToken = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], value = ")")
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Twig.expression.type.subexpression.end")
    __obj.asInstanceOf[CompiledSubexpressionToken]
  }
  
  extension [Self <: CompiledSubexpressionToken](x: Self) {
    
    inline def setExpression(value: Boolean): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setParams(value: js.Array[CompiledToken]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: CompiledToken*): Self = StObject.set(x, "params", js.Array(value*))
  }
}
