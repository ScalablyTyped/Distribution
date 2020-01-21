package typings.tensorflowTfjsLayers.optimizerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SGDOptimizerConfig extends js.Object {
  var learning_rate: Double
}

object SGDOptimizerConfig {
  @scala.inline
  def apply(learning_rate: Double): SGDOptimizerConfig = {
    val __obj = js.Dynamic.literal(learning_rate = learning_rate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SGDOptimizerConfig]
  }
}

