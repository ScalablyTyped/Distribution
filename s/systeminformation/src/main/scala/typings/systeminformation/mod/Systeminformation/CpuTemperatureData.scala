package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CpuTemperatureData extends StObject {
  
  var cores: js.Array[Double] = js.native
  
  var main: Double = js.native
  
  var max: Double = js.native
}
object CpuTemperatureData {
  
  @scala.inline
  def apply(cores: js.Array[Double], main: Double, max: Double): CpuTemperatureData = {
    val __obj = js.Dynamic.literal(cores = cores.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[CpuTemperatureData]
  }
  
  @scala.inline
  implicit class CpuTemperatureDataMutableBuilder[Self <: CpuTemperatureData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCores(value: js.Array[Double]): Self = StObject.set(x, "cores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoresVarargs(value: Double*): Self = StObject.set(x, "cores", js.Array(value :_*))
    
    @scala.inline
    def setMain(value: Double): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
  }
}
