package typings.tensorflow.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tensor_ extends js.Object {
  var shape: js.Array[Double]
  var `type`: Types
  var value: Buffer | TensorValue
}

object Tensor_ {
  @scala.inline
  def apply(shape: js.Array[Double], `type`: Types, value: Buffer | TensorValue): Tensor_ = {
    val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tensor_]
  }
}

