package typings
package atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatInitializerUnderscoreConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandomUniformConfig extends js.Object {
  var maxval: js.UndefOr[scala.Double] = js.undefined
  var minval: js.UndefOr[scala.Double] = js.undefined
  var seed: js.UndefOr[scala.Double] = js.undefined
}

object RandomUniformConfig {
  @scala.inline
  def apply(
    maxval: scala.Int | scala.Double = null,
    minval: scala.Int | scala.Double = null,
    seed: scala.Int | scala.Double = null
  ): RandomUniformConfig = {
    val __obj = js.Dynamic.literal()
    if (maxval != null) __obj.updateDynamic("maxval")(maxval.asInstanceOf[js.Any])
    if (minval != null) __obj.updateDynamic("minval")(minval.asInstanceOf[js.Any])
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    __obj.asInstanceOf[RandomUniformConfig]
  }
}

