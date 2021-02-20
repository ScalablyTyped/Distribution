package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Area extends StObject {
  
  var area: scala.Double = js.native
  
  var iteration: scala.Double = js.native
}
object Area {
  
  @scala.inline
  def apply(area: scala.Double, iteration: scala.Double): Area = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], iteration = iteration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Area]
  }
  
  @scala.inline
  implicit class AreaMutableBuilder[Self <: Area] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArea(value: scala.Double): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIteration(value: scala.Double): Self = StObject.set(x, "iteration", value.asInstanceOf[js.Any])
  }
}
