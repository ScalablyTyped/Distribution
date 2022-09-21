package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CpuTemperatureData extends StObject {
  
  var chipset: js.UndefOr[Double] = js.undefined
  
  var cores: js.Array[Double]
  
  var main: Double
  
  var max: Double
  
  var socket: js.UndefOr[js.Array[Double]] = js.undefined
}
object CpuTemperatureData {
  
  inline def apply(cores: js.Array[Double], main: Double, max: Double): CpuTemperatureData = {
    val __obj = js.Dynamic.literal(cores = cores.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[CpuTemperatureData]
  }
  
  extension [Self <: CpuTemperatureData](x: Self) {
    
    inline def setChipset(value: Double): Self = StObject.set(x, "chipset", value.asInstanceOf[js.Any])
    
    inline def setChipsetUndefined: Self = StObject.set(x, "chipset", js.undefined)
    
    inline def setCores(value: js.Array[Double]): Self = StObject.set(x, "cores", value.asInstanceOf[js.Any])
    
    inline def setCoresVarargs(value: Double*): Self = StObject.set(x, "cores", js.Array(value*))
    
    inline def setMain(value: Double): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setSocket(value: js.Array[Double]): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    
    inline def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
    
    inline def setSocketVarargs(value: Double*): Self = StObject.set(x, "socket", js.Array(value*))
  }
}
