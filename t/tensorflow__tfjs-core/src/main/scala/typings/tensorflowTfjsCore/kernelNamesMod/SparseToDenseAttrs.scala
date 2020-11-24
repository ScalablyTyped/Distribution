package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SparseToDenseAttrs extends js.Object {
  
  var outputShape: js.Array[Double] = js.native
}
object SparseToDenseAttrs {
  
  @scala.inline
  def apply(outputShape: js.Array[Double]): SparseToDenseAttrs = {
    val __obj = js.Dynamic.literal(outputShape = outputShape.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparseToDenseAttrs]
  }
  
  @scala.inline
  implicit class SparseToDenseAttrsOps[Self <: SparseToDenseAttrs] (val x: Self) extends AnyVal {
    
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
    def setOutputShapeVarargs(value: Double*): Self = this.set("outputShape", js.Array(value :_*))
    
    @scala.inline
    def setOutputShape(value: js.Array[Double]): Self = this.set("outputShape", value.asInstanceOf[js.Any])
  }
}
