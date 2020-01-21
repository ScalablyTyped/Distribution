package typings.tensorflowTfjsLayers.initializerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandomUniformConfig extends js.Object {
  var maxval: js.UndefOr[Double] = js.undefined
  var minval: js.UndefOr[Double] = js.undefined
  var seed: js.UndefOr[Double] = js.undefined
}

object RandomUniformConfig {
  @scala.inline
  def apply(maxval: Int | Double = null, minval: Int | Double = null, seed: Int | Double = null): RandomUniformConfig = {
    val __obj = js.Dynamic.literal()
    if (maxval != null) __obj.updateDynamic("maxval")(maxval.asInstanceOf[js.Any])
    if (minval != null) __obj.updateDynamic("minval")(minval.asInstanceOf[js.Any])
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    __obj.asInstanceOf[RandomUniformConfig]
  }
}

