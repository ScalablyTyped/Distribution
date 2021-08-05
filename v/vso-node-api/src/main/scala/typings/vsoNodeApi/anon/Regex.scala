package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Regex extends StObject {
  
  var regex: scala.Double
  
  var variable: scala.Double
}
object Regex {
  
  inline def apply(regex: scala.Double, variable: scala.Double): Regex = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Regex]
  }
  
  extension [Self <: Regex](x: Self) {
    
    inline def setRegex(value: scala.Double): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    inline def setVariable(value: scala.Double): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
  }
}
