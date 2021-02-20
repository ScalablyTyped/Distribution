package typings.winrt.Windows.UI.Input

import typings.winrt.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManipulationVelocities extends StObject {
  
  var angular: Double = js.native
  
  var expansion: Double = js.native
  
  var linear: Point = js.native
}
object ManipulationVelocities {
  
  @scala.inline
  def apply(angular: Double, expansion: Double, linear: Point): ManipulationVelocities = {
    val __obj = js.Dynamic.literal(angular = angular.asInstanceOf[js.Any], expansion = expansion.asInstanceOf[js.Any], linear = linear.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManipulationVelocities]
  }
  
  @scala.inline
  implicit class ManipulationVelocitiesMutableBuilder[Self <: ManipulationVelocities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngular(value: Double): Self = StObject.set(x, "angular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpansion(value: Double): Self = StObject.set(x, "expansion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinear(value: Point): Self = StObject.set(x, "linear", value.asInstanceOf[js.Any])
  }
}
