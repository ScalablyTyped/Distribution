package typings.tensorflowTfjsLayers.initializerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstantConfig extends js.Object {
  var value: Double
}

object ConstantConfig {
  @scala.inline
  def apply(value: Double): ConstantConfig = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstantConfig]
  }
}

