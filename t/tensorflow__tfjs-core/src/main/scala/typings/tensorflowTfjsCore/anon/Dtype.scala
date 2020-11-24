package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float16
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.uint16
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.uint8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dtype extends js.Object {
  
  var dtype: uint16 | uint8 | float16 = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var scale: js.UndefOr[Double] = js.native
}
object Dtype {
  
  @scala.inline
  def apply(dtype: uint16 | uint8 | float16): Dtype = {
    val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dtype]
  }
  
  @scala.inline
  implicit class DtypeOps[Self <: Dtype] (val x: Self) extends AnyVal {
    
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
    def setDtype(value: uint16 | uint8 | float16): Self = this.set("dtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
  }
}
