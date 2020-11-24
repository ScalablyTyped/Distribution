package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'image' | 'boxes' | 'boxInd'> */
@js.native
trait CropAndResizeInputs extends js.Object {
  
  var boxInd: js.UndefOr[js.Any] = js.native
  
  var boxes: js.UndefOr[js.Any] = js.native
  
  var image: js.UndefOr[js.Any] = js.native
}
object CropAndResizeInputs {
  
  @scala.inline
  def apply(): CropAndResizeInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CropAndResizeInputs]
  }
  
  @scala.inline
  implicit class CropAndResizeInputsOps[Self <: CropAndResizeInputs] (val x: Self) extends AnyVal {
    
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
    def setBoxInd(value: js.Any): Self = this.set("boxInd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxInd: Self = this.set("boxInd", js.undefined)
    
    @scala.inline
    def setBoxes(value: js.Any): Self = this.set("boxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxes: Self = this.set("boxes", js.undefined)
    
    @scala.inline
    def setImage(value: js.Any): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
  }
}
