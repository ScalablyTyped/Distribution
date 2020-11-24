package typings.tensorflowTfjsBackendWebgl.shaderCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShapeInfo extends js.Object {
  
  var flatOffset: Double = js.native
  
  var isPacked: Boolean = js.native
  
  var isUniform: Boolean = js.native
  
  var logicalShape: js.Array[Double] = js.native
  
  var texShape: js.Tuple2[Double, Double] = js.native
}
object ShapeInfo {
  
  @scala.inline
  def apply(
    flatOffset: Double,
    isPacked: Boolean,
    isUniform: Boolean,
    logicalShape: js.Array[Double],
    texShape: js.Tuple2[Double, Double]
  ): ShapeInfo = {
    val __obj = js.Dynamic.literal(flatOffset = flatOffset.asInstanceOf[js.Any], isPacked = isPacked.asInstanceOf[js.Any], isUniform = isUniform.asInstanceOf[js.Any], logicalShape = logicalShape.asInstanceOf[js.Any], texShape = texShape.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeInfo]
  }
  
  @scala.inline
  implicit class ShapeInfoOps[Self <: ShapeInfo] (val x: Self) extends AnyVal {
    
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
    def setFlatOffset(value: Double): Self = this.set("flatOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPacked(value: Boolean): Self = this.set("isPacked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUniform(value: Boolean): Self = this.set("isUniform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicalShapeVarargs(value: Double*): Self = this.set("logicalShape", js.Array(value :_*))
    
    @scala.inline
    def setLogicalShape(value: js.Array[Double]): Self = this.set("logicalShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTexShape(value: js.Tuple2[Double, Double]): Self = this.set("texShape", value.asInstanceOf[js.Any])
  }
}
