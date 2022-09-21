package typings.twig.mod

import typings.twig.twigStrings.TwigDotexpressionDottypeDotoperatorDotbinary
import typings.twig.twigStrings.leftToRight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompiledBinaryOperatorToken[TOperator /* <: BinaryOperator */]
  extends StObject
     with CompiledGenericTokenWithMatch[TwigDotexpressionDottypeDotoperatorDotbinary, TOperator] {
  
  var associativity: leftToRight | String
  
  var operator: TOperator
  
  var precidence: Double
}
object CompiledBinaryOperatorToken {
  
  inline def apply[TOperator /* <: BinaryOperator */](
    associativity: leftToRight | String,
    `match`: js.Array[js.UndefOr[String | Any]],
    operator: TOperator,
    precidence: Double,
    value: TOperator
  ): CompiledBinaryOperatorToken[TOperator] = {
    val __obj = js.Dynamic.literal(associativity = associativity.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], precidence = precidence.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Twig.expression.type.operator.binary")
    __obj.asInstanceOf[CompiledBinaryOperatorToken[TOperator]]
  }
  
  extension [Self <: CompiledBinaryOperatorToken[?], TOperator /* <: BinaryOperator */](x: Self & CompiledBinaryOperatorToken[TOperator]) {
    
    inline def setAssociativity(value: leftToRight | String): Self = StObject.set(x, "associativity", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: TOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setPrecidence(value: Double): Self = StObject.set(x, "precidence", value.asInstanceOf[js.Any])
  }
}
