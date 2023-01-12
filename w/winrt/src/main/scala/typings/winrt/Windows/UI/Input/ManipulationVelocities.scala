package typings.winrt.Windows.UI.Input

import typings.winrt.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManipulationVelocities extends StObject {
  
  var angular: Double
  
  var expansion: Double
  
  var linear: Point
}
object ManipulationVelocities {
  
  inline def apply(angular: Double, expansion: Double, linear: Point): ManipulationVelocities = {
    val __obj = js.Dynamic.literal(angular = angular.asInstanceOf[js.Any], expansion = expansion.asInstanceOf[js.Any], linear = linear.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManipulationVelocities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManipulationVelocities] (val x: Self) extends AnyVal {
    
    inline def setAngular(value: Double): Self = StObject.set(x, "angular", value.asInstanceOf[js.Any])
    
    inline def setExpansion(value: Double): Self = StObject.set(x, "expansion", value.asInstanceOf[js.Any])
    
    inline def setLinear(value: Point): Self = StObject.set(x, "linear", value.asInstanceOf[js.Any])
  }
}
