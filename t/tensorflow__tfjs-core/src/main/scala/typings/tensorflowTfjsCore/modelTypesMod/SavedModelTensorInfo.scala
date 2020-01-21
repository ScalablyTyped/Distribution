package typings.tensorflowTfjsCore.modelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedModelTensorInfo extends js.Object {
  var dtype: String
  var name: String
  var shape: js.Array[Double]
}

object SavedModelTensorInfo {
  @scala.inline
  def apply(dtype: String, name: String, shape: js.Array[Double]): SavedModelTensorInfo = {
    val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SavedModelTensorInfo]
  }
}

