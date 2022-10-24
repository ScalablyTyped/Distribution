package typings.yarnpkgParsers.anon

import typings.yarnpkgParsers.libGrammarsShellMod.ArgumentSegment
import typings.yarnpkgParsers.libGrammarsShellMod.ArithmeticExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arithmetic
  extends StObject
     with ArgumentSegment {
  
  var arithmetic: ArithmeticExpression
  
  var `type`: /* template literal string: arithmetic */ String
}
object Arithmetic {
  
  inline def apply(arithmetic: ArithmeticExpression, `type`: /* template literal string: arithmetic */ String): Arithmetic = {
    val __obj = js.Dynamic.literal(arithmetic = arithmetic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arithmetic]
  }
  
  extension [Self <: Arithmetic](x: Self) {
    
    inline def setArithmetic(value: ArithmeticExpression): Self = StObject.set(x, "arithmetic", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* template literal string: arithmetic */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
