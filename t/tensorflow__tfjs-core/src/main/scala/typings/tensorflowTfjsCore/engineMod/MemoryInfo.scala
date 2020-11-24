package typings.tensorflowTfjsCore.engineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemoryInfo extends js.Object {
  
  var numBytes: Double = js.native
  
  var numDataBuffers: Double = js.native
  
  var numTensors: Double = js.native
  
  var reasons: js.Array[String] = js.native
  
  var unreliable: js.UndefOr[Boolean] = js.native
}
object MemoryInfo {
  
  @scala.inline
  def apply(numBytes: Double, numDataBuffers: Double, numTensors: Double, reasons: js.Array[String]): MemoryInfo = {
    val __obj = js.Dynamic.literal(numBytes = numBytes.asInstanceOf[js.Any], numDataBuffers = numDataBuffers.asInstanceOf[js.Any], numTensors = numTensors.asInstanceOf[js.Any], reasons = reasons.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryInfo]
  }
  
  @scala.inline
  implicit class MemoryInfoOps[Self <: MemoryInfo] (val x: Self) extends AnyVal {
    
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
    def setNumBytes(value: Double): Self = this.set("numBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumDataBuffers(value: Double): Self = this.set("numDataBuffers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumTensors(value: Double): Self = this.set("numTensors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonsVarargs(value: String*): Self = this.set("reasons", js.Array(value :_*))
    
    @scala.inline
    def setReasons(value: js.Array[String]): Self = this.set("reasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnreliable(value: Boolean): Self = this.set("unreliable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnreliable: Self = this.set("unreliable", js.undefined)
  }
}
