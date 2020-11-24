package typings.tensorflowTfjsBackendCpu.anon

import typings.std.Uint8Array
import typings.tensorflowTfjsCore.distTypesMod.BackendValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Indices extends js.Object {
  
  var indices: BackendValues = js.native
  
  var outputShape: js.Array[Double] = js.native
  
  var outputValues: BackendValues = js.native
}
object Indices {
  
  @scala.inline
  def apply(indices: BackendValues, outputShape: js.Array[Double], outputValues: BackendValues): Indices = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], outputShape = outputShape.asInstanceOf[js.Any], outputValues = outputValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indices]
  }
  
  @scala.inline
  implicit class IndicesOps[Self <: Indices] (val x: Self) extends AnyVal {
    
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
    def setIndicesVarargs(value: Uint8Array*): Self = this.set("indices", js.Array(value :_*))
    
    @scala.inline
    def setIndices(value: BackendValues): Self = this.set("indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputShapeVarargs(value: Double*): Self = this.set("outputShape", js.Array(value :_*))
    
    @scala.inline
    def setOutputShape(value: js.Array[Double]): Self = this.set("outputShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputValuesVarargs(value: Uint8Array*): Self = this.set("outputValues", js.Array(value :_*))
    
    @scala.inline
    def setOutputValues(value: BackendValues): Self = this.set("outputValues", value.asInstanceOf[js.Any])
  }
}
