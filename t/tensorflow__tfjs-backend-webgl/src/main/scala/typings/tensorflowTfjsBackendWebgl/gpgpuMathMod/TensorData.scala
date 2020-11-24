package typings.tensorflowTfjsBackendWebgl.gpgpuMathMod

import typings.tensorflowTfjsBackendWebgl.texUtilMod.TextureData
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TensorData extends js.Object {
  
  var isUniform: Boolean = js.native
  
  var shape: js.Array[Double] = js.native
  
  var texData: TextureData = js.native
  
  var uniformValues: js.UndefOr[TypedArray] = js.native
}
object TensorData {
  
  @scala.inline
  def apply(isUniform: Boolean, shape: js.Array[Double], texData: TextureData): TensorData = {
    val __obj = js.Dynamic.literal(isUniform = isUniform.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], texData = texData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TensorData]
  }
  
  @scala.inline
  implicit class TensorDataOps[Self <: TensorData] (val x: Self) extends AnyVal {
    
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
    def setIsUniform(value: Boolean): Self = this.set("isUniform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeVarargs(value: Double*): Self = this.set("shape", js.Array(value :_*))
    
    @scala.inline
    def setShape(value: js.Array[Double]): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTexData(value: TextureData): Self = this.set("texData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniformValues(value: TypedArray): Self = this.set("uniformValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniformValues: Self = this.set("uniformValues", js.undefined)
  }
}
