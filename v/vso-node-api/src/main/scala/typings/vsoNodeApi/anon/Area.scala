package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Area extends StObject {
  
  var area: scala.Double
  
  var iteration: scala.Double
}
object Area {
  
  inline def apply(area: scala.Double, iteration: scala.Double): Area = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], iteration = iteration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Area]
  }
  
  extension [Self <: Area](x: Self) {
    
    inline def setArea(value: scala.Double): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    inline def setIteration(value: scala.Double): Self = StObject.set(x, "iteration", value.asInstanceOf[js.Any])
  }
}
