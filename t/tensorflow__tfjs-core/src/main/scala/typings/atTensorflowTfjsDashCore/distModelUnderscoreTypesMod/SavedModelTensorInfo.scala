package typings.atTensorflowTfjsDashCore.distModelUnderscoreTypesMod

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
    val __obj = js.Dynamic.literal(dtype = dtype, name = name, shape = shape)
  
    __obj.asInstanceOf[SavedModelTensorInfo]
  }
}

