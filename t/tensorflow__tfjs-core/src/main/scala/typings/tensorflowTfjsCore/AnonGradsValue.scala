package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.tensorMod.Scalar
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGradsValue extends js.Object {
  var grads: NamedTensorMap
  var value: Scalar
}

object AnonGradsValue {
  @scala.inline
  def apply(grads: NamedTensorMap, value: Scalar): AnonGradsValue = {
    val __obj = js.Dynamic.literal(grads = grads.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGradsValue]
  }
}

