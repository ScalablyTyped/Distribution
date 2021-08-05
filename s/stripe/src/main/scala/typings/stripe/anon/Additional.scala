package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Additional extends StObject {
  
  var additional: js.Array[String]
  
  var minimum: js.Array[String]
}
object Additional {
  
  inline def apply(additional: js.Array[String], minimum: js.Array[String]): Additional = {
    val __obj = js.Dynamic.literal(additional = additional.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Additional]
  }
  
  extension [Self <: Additional](x: Self) {
    
    inline def setAdditional(value: js.Array[String]): Self = StObject.set(x, "additional", value.asInstanceOf[js.Any])
    
    inline def setAdditionalVarargs(value: String*): Self = StObject.set(x, "additional", js.Array(value :_*))
    
    inline def setMinimum(value: js.Array[String]): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    inline def setMinimumVarargs(value: String*): Self = StObject.set(x, "minimum", js.Array(value :_*))
  }
}
