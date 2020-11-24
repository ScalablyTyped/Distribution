package typings.tensorflowTfjsCore.kernelNamesMod

import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCDHW
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NDHWC
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Conv3DAttrs extends js.Object {
  
  var dataFormat: NDHWC | NCDHW = js.native
  
  var dilations: (js.Tuple3[Double, Double, Double]) | Double = js.native
  
  var pad: valid_ | same_ = js.native
  
  var strides: (js.Tuple3[Double, Double, Double]) | Double = js.native
}
object Conv3DAttrs {
  
  @scala.inline
  def apply(
    dataFormat: NDHWC | NCDHW,
    dilations: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid_ | same_,
    strides: (js.Tuple3[Double, Double, Double]) | Double
  ): Conv3DAttrs = {
    val __obj = js.Dynamic.literal(dataFormat = dataFormat.asInstanceOf[js.Any], dilations = dilations.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conv3DAttrs]
  }
  
  @scala.inline
  implicit class Conv3DAttrsOps[Self <: Conv3DAttrs] (val x: Self) extends AnyVal {
    
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
    def setDataFormat(value: NDHWC | NCDHW): Self = this.set("dataFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDilations(value: (js.Tuple3[Double, Double, Double]) | Double): Self = this.set("dilations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPad(value: valid_ | same_): Self = this.set("pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrides(value: (js.Tuple3[Double, Double, Double]) | Double): Self = this.set("strides", value.asInstanceOf[js.Any])
  }
}
