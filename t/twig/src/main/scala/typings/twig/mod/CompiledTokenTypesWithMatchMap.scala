package typings.twig.mod

import typings.twig.twigStrings.Leftcurlybracket
import typings.twig.twigStrings.Rightcurlybracket
import typings.twig.twigStrings.`[`
import typings.twig.twigStrings.`]`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompiledTokenTypesWithMatchMap extends StObject {
  
  @JSName("Twig.expression.type.array.end")
  var TwigDotexpressionDottypeDotarrayDotend: `]`
  
  @JSName("Twig.expression.type.array.start")
  var TwigDotexpressionDottypeDotarrayDotstart: `[`
  
  @JSName("Twig.expression.type.number")
  var TwigDotexpressionDottypeDotnumber: Double
  
  @JSName("Twig.expression.type.object.end")
  var TwigDotexpressionDottypeDotobjectDotend: Rightcurlybracket
  
  @JSName("Twig.expression.type.object.start")
  var TwigDotexpressionDottypeDotobjectDotstart: Leftcurlybracket
  
  @JSName("Twig.expression.type.variable")
  var TwigDotexpressionDottypeDotvariable: String
}
object CompiledTokenTypesWithMatchMap {
  
  inline def apply(TwigDotexpressionDottypeDotnumber: Double, TwigDotexpressionDottypeDotvariable: String): CompiledTokenTypesWithMatchMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Twig.expression.type.array.end")("]")
    __obj.updateDynamic("Twig.expression.type.array.start")("[")
    __obj.updateDynamic("Twig.expression.type.number")(TwigDotexpressionDottypeDotnumber.asInstanceOf[js.Any])
    __obj.updateDynamic("Twig.expression.type.object.end")("}")
    __obj.updateDynamic("Twig.expression.type.object.start")("{")
    __obj.updateDynamic("Twig.expression.type.variable")(TwigDotexpressionDottypeDotvariable.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompiledTokenTypesWithMatchMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompiledTokenTypesWithMatchMap] (val x: Self) extends AnyVal {
    
    inline def setTwigDotexpressionDottypeDotarrayDotend(value: `]`): Self = StObject.set(x, "Twig.expression.type.array.end", value.asInstanceOf[js.Any])
    
    inline def setTwigDotexpressionDottypeDotarrayDotstart(value: `[`): Self = StObject.set(x, "Twig.expression.type.array.start", value.asInstanceOf[js.Any])
    
    inline def setTwigDotexpressionDottypeDotnumber(value: Double): Self = StObject.set(x, "Twig.expression.type.number", value.asInstanceOf[js.Any])
    
    inline def setTwigDotexpressionDottypeDotobjectDotend(value: Rightcurlybracket): Self = StObject.set(x, "Twig.expression.type.object.end", value.asInstanceOf[js.Any])
    
    inline def setTwigDotexpressionDottypeDotobjectDotstart(value: Leftcurlybracket): Self = StObject.set(x, "Twig.expression.type.object.start", value.asInstanceOf[js.Any])
    
    inline def setTwigDotexpressionDottypeDotvariable(value: String): Self = StObject.set(x, "Twig.expression.type.variable", value.asInstanceOf[js.Any])
  }
}
