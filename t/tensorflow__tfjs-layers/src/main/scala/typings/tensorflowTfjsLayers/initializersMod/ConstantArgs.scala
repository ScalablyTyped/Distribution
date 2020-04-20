package typings.tensorflowTfjsLayers.initializersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstantArgs extends js.Object {
  /** The value for each element in the variable. */
  var value: Double
}

object ConstantArgs {
  @scala.inline
  def apply(value: Double): ConstantArgs = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstantArgs]
  }
}

