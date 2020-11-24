package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CpuTemperatureData extends js.Object {
  
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
  implicit class CpuTemperatureDataOps[Self <: CpuTemperatureData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCoresVarargs(value: Double*): Self = this.set("cores", js.Array(value :_*))
    
    @scala.inline
    def setCores(value: js.Array[Double]): Self = this.set("cores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMain(value: Double): Self = this.set("main", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
  }
}
