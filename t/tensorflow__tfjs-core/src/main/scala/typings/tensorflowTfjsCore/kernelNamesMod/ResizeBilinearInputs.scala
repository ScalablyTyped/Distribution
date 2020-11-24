package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'images'> */
@js.native
trait ResizeBilinearInputs extends js.Object {
  
  var images: js.UndefOr[js.Any] = js.native
}
object ResizeBilinearInputs {
  
  @scala.inline
  def apply(): ResizeBilinearInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeBilinearInputs]
  }
  
  @scala.inline
  implicit class ResizeBilinearInputsOps[Self <: ResizeBilinearInputs] (val x: Self) extends AnyVal {
    
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
    def setImages(value: js.Any): Self = this.set("images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImages: Self = this.set("images", js.undefined)
  }
}
