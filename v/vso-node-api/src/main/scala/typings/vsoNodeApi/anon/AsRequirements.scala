package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsRequirements extends StObject {
  
  var asRequirements: scala.Double
  
  var asTasks: scala.Double
  
  var off: scala.Double
}
object AsRequirements {
  
  inline def apply(asRequirements: scala.Double, asTasks: scala.Double, off: scala.Double): AsRequirements = {
    val __obj = js.Dynamic.literal(asRequirements = asRequirements.asInstanceOf[js.Any], asTasks = asTasks.asInstanceOf[js.Any], off = off.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsRequirements]
  }
  
  extension [Self <: AsRequirements](x: Self) {
    
    inline def setAsRequirements(value: scala.Double): Self = StObject.set(x, "asRequirements", value.asInstanceOf[js.Any])
    
    inline def setAsTasks(value: scala.Double): Self = StObject.set(x, "asTasks", value.asInstanceOf[js.Any])
    
    inline def setOff(value: scala.Double): Self = StObject.set(x, "off", value.asInstanceOf[js.Any])
  }
}
