package typings.twig.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompiledTokenTypesWithoutMatchMap extends StObject {
  
  @JSName("Twig.expression.type.bool")
  var TwigDotexpressionDottypeDotbool: Boolean
  
  @JSName("Twig.expression.type.null")
  var TwigDotexpressionDottypeDotnull: Null
  
  @JSName("Twig.expression.type.string")
  var TwigDotexpressionDottypeDotstring: String
}
object CompiledTokenTypesWithoutMatchMap {
  
  inline def apply(
    TwigDotexpressionDottypeDotbool: Boolean,
    TwigDotexpressionDottypeDotnull: Null,
    TwigDotexpressionDottypeDotstring: String
  ): CompiledTokenTypesWithoutMatchMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Twig.expression.type.bool")(TwigDotexpressionDottypeDotbool.asInstanceOf[js.Any])
    __obj.updateDynamic("Twig.expression.type.null")(TwigDotexpressionDottypeDotnull.asInstanceOf[js.Any])
    __obj.updateDynamic("Twig.expression.type.string")(TwigDotexpressionDottypeDotstring.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompiledTokenTypesWithoutMatchMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompiledTokenTypesWithoutMatchMap] (val x: Self) extends AnyVal {
    
    inline def setTwigDotexpressionDottypeDotbool(value: Boolean): Self = StObject.set(x, "Twig.expression.type.bool", value.asInstanceOf[js.Any])
    
    inline def setTwigDotexpressionDottypeDotnull(value: Null): Self = StObject.set(x, "Twig.expression.type.null", value.asInstanceOf[js.Any])
    
    inline def setTwigDotexpressionDottypeDotstring(value: String): Self = StObject.set(x, "Twig.expression.type.string", value.asInstanceOf[js.Any])
  }
}
