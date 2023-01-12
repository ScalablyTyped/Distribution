package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Validated extends StObject {
  
  var none: scala.Double
  
  var validated: scala.Double
}
object Validated {
  
  inline def apply(none: scala.Double, validated: scala.Double): Validated = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], validated = validated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Validated]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Validated] (val x: Self) extends AnyVal {
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setValidated(value: scala.Double): Self = StObject.set(x, "validated", value.asInstanceOf[js.Any])
  }
}
