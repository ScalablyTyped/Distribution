package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PadV2Attrs extends js.Object {
  
  var constantValue: Double = js.native
  
  var paddings: js.Array[js.Tuple2[Double, Double]] = js.native
}
object PadV2Attrs {
  
  @scala.inline
  def apply(constantValue: Double, paddings: js.Array[js.Tuple2[Double, Double]]): PadV2Attrs = {
    val __obj = js.Dynamic.literal(constantValue = constantValue.asInstanceOf[js.Any], paddings = paddings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PadV2Attrs]
  }
  
  @scala.inline
  implicit class PadV2AttrsOps[Self <: PadV2Attrs] (val x: Self) extends AnyVal {
    
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
    def setConstantValue(value: Double): Self = this.set("constantValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingsVarargs(value: (js.Tuple2[Double, Double])*): Self = this.set("paddings", js.Array(value :_*))
    
    @scala.inline
    def setPaddings(value: js.Array[js.Tuple2[Double, Double]]): Self = this.set("paddings", value.asInstanceOf[js.Any])
  }
}
