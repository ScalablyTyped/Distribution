package typings.tensorflowTfjsCore.kernelNamesMod

import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCHW
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NHWC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DepthToSpaceAttrs extends js.Object {
  
  var blockSize: Double = js.native
  
  var dataFormat: NHWC | NCHW = js.native
}
object DepthToSpaceAttrs {
  
  @scala.inline
  def apply(blockSize: Double, dataFormat: NHWC | NCHW): DepthToSpaceAttrs = {
    val __obj = js.Dynamic.literal(blockSize = blockSize.asInstanceOf[js.Any], dataFormat = dataFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepthToSpaceAttrs]
  }
  
  @scala.inline
  implicit class DepthToSpaceAttrsOps[Self <: DepthToSpaceAttrs] (val x: Self) extends AnyVal {
    
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
    def setBlockSize(value: Double): Self = this.set("blockSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFormat(value: NHWC | NCHW): Self = this.set("dataFormat", value.asInstanceOf[js.Any])
  }
}
