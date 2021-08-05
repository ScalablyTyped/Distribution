package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inherited extends StObject {
  
  var custom: scala.Double
  
  var inherited: scala.Double
  
  var system: scala.Double
}
object Inherited {
  
  inline def apply(custom: scala.Double, inherited: scala.Double, system: scala.Double): Inherited = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], inherited = inherited.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inherited]
  }
  
  extension [Self <: Inherited](x: Self) {
    
    inline def setCustom(value: scala.Double): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setInherited(value: scala.Double): Self = StObject.set(x, "inherited", value.asInstanceOf[js.Any])
    
    inline def setSystem(value: scala.Double): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
  }
}
