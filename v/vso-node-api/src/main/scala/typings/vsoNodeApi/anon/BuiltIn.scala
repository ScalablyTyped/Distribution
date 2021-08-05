package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuiltIn extends StObject {
  
  var builtIn: scala.Double
  
  var trusted: scala.Double
}
object BuiltIn {
  
  inline def apply(builtIn: scala.Double, trusted: scala.Double): BuiltIn = {
    val __obj = js.Dynamic.literal(builtIn = builtIn.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuiltIn]
  }
  
  extension [Self <: BuiltIn](x: Self) {
    
    inline def setBuiltIn(value: scala.Double): Self = StObject.set(x, "builtIn", value.asInstanceOf[js.Any])
    
    inline def setTrusted(value: scala.Double): Self = StObject.set(x, "trusted", value.asInstanceOf[js.Any])
  }
}
