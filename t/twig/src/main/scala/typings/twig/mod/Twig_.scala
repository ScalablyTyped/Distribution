package typings.twig.mod

import typings.twig.anon.Cache
import typings.twig.anon.Compile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Twig_ extends StObject {
  
  var exports: Cache
  
  var expression: Compile
}
object Twig_ {
  
  inline def apply(exports: Cache, expression: Compile): Twig_ = {
    val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[Twig_]
  }
  
  extension [Self <: Twig_](x: Self) {
    
    inline def setExports(value: Cache): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setExpression(value: Compile): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
  }
}
