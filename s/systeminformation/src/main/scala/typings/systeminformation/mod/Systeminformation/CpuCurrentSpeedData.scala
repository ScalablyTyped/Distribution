package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CpuCurrentSpeedData extends StObject {
  
  var avg: Double
  
  var cores: js.Array[Double]
  
  var max: Double
  
  var min: Double
}
object CpuCurrentSpeedData {
  
  @scala.inline
  def apply(avg: Double, cores: js.Array[Double], max: Double, min: Double): CpuCurrentSpeedData = {
    val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any], cores = cores.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[CpuCurrentSpeedData]
  }
  
  @scala.inline
  implicit class CpuCurrentSpeedDataMutableBuilder[Self <: CpuCurrentSpeedData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvg(value: Double): Self = StObject.set(x, "avg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCores(value: js.Array[Double]): Self = StObject.set(x, "cores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoresVarargs(value: Double*): Self = StObject.set(x, "cores", js.Array(value :_*))
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
