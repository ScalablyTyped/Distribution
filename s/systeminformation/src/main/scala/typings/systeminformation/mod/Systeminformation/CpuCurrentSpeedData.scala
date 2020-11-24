package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CpuCurrentSpeedData extends js.Object {
  
  var avg: Double = js.native
  
  var cores: js.Array[Double] = js.native
  
  var max: Double = js.native
  
  var min: Double = js.native
}
object CpuCurrentSpeedData {
  
  @scala.inline
  def apply(avg: Double, cores: js.Array[Double], max: Double, min: Double): CpuCurrentSpeedData = {
    val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any], cores = cores.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[CpuCurrentSpeedData]
  }
  
  @scala.inline
  implicit class CpuCurrentSpeedDataOps[Self <: CpuCurrentSpeedData] (val x: Self) extends AnyVal {
    
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
    def setAvg(value: Double): Self = this.set("avg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoresVarargs(value: Double*): Self = this.set("cores", js.Array(value :_*))
    
    @scala.inline
    def setCores(value: js.Array[Double]): Self = this.set("cores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
  }
}
