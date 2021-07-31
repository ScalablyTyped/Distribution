package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Areas extends StObject {
  
  var areas: scala.Double
  
  var iterations: scala.Double
}
object Areas {
  
  @scala.inline
  def apply(areas: scala.Double, iterations: scala.Double): Areas = {
    val __obj = js.Dynamic.literal(areas = areas.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Areas]
  }
  
  @scala.inline
  implicit class AreasMutableBuilder[Self <: Areas] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAreas(value: scala.Double): Self = StObject.set(x, "areas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterations(value: scala.Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
  }
}
