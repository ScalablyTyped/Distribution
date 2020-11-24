package typings.tensorflowTfjsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeptDims extends js.Object {
  
  var keptDims: js.Array[Double] = js.native
  
  var newShape: js.Array[Double] = js.native
}
object KeptDims {
  
  @scala.inline
  def apply(keptDims: js.Array[Double], newShape: js.Array[Double]): KeptDims = {
    val __obj = js.Dynamic.literal(keptDims = keptDims.asInstanceOf[js.Any], newShape = newShape.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeptDims]
  }
  
  @scala.inline
  implicit class KeptDimsOps[Self <: KeptDims] (val x: Self) extends AnyVal {
    
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
    def setKeptDimsVarargs(value: Double*): Self = this.set("keptDims", js.Array(value :_*))
    
    @scala.inline
    def setKeptDims(value: js.Array[Double]): Self = this.set("keptDims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewShapeVarargs(value: Double*): Self = this.set("newShape", js.Array(value :_*))
    
    @scala.inline
    def setNewShape(value: js.Array[Double]): Self = this.set("newShape", value.asInstanceOf[js.Any])
  }
}
