package typings.tensorflow.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tensor_ extends js.Object {
  
  var shape: js.Array[Double] = js.native
  
  var `type`: Types = js.native
  
  var value: Buffer | TensorValue = js.native
}
object Tensor_ {
  
  @scala.inline
  def apply(shape: js.Array[Double], `type`: Types, value: Buffer | TensorValue): Tensor_ = {
    val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tensor_]
  }
  
  @scala.inline
  implicit class Tensor_Ops[Self <: Tensor_] (val x: Self) extends AnyVal {
    
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
    def setShapeVarargs(value: Double*): Self = this.set("shape", js.Array(value :_*))
    
    @scala.inline
    def setShape(value: js.Array[Double]): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Types): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: ((js.Array[(js.Array[js.Array[TensorData] | TensorData]) | TensorData]) | TensorData)*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: Buffer | TensorValue): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
