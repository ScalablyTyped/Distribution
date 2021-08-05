package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Derived extends StObject {
  
  var custom: scala.Double
  
  var derived: scala.Double
  
  var system: scala.Double
}
object Derived {
  
  inline def apply(custom: scala.Double, derived: scala.Double, system: scala.Double): Derived = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], derived = derived.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
    __obj.asInstanceOf[Derived]
  }
  
  extension [Self <: Derived](x: Self) {
    
    inline def setCustom(value: scala.Double): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setDerived(value: scala.Double): Self = StObject.set(x, "derived", value.asInstanceOf[js.Any])
    
    inline def setSystem(value: scala.Double): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
  }
}
