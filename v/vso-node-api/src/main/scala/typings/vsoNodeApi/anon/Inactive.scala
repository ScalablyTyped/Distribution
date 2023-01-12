package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inactive extends StObject {
  
  var active: scala.Double
  
  var inactive: scala.Double
}
object Inactive {
  
  inline def apply(active: scala.Double, inactive: scala.Double): Inactive = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], inactive = inactive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inactive]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Inactive] (val x: Self) extends AnyVal {
    
    inline def setActive(value: scala.Double): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setInactive(value: scala.Double): Self = StObject.set(x, "inactive", value.asInstanceOf[js.Any])
  }
}
