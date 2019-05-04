package typings
package vegaDashLiteLib.buildSrcBinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinParams extends BaseBin {
  /**
    * A two-element (`[min, max]`) array indicating the range of desired bin values.
    * @minItems 2
    * @maxItems 2
    */
  var extent: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object BinParams {
  @scala.inline
  def apply(
    anchor: scala.Int | scala.Double = null,
    base: scala.Int | scala.Double = null,
    divide: js.Array[scala.Double] = null,
    extent: js.Array[scala.Double] = null,
    maxbins: scala.Int | scala.Double = null,
    minstep: scala.Int | scala.Double = null,
    nice: js.UndefOr[scala.Boolean] = js.undefined,
    step: scala.Int | scala.Double = null,
    steps: js.Array[scala.Double] = null
  ): BinParams = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (divide != null) __obj.updateDynamic("divide")(divide)
    if (extent != null) __obj.updateDynamic("extent")(extent)
    if (maxbins != null) __obj.updateDynamic("maxbins")(maxbins.asInstanceOf[js.Any])
    if (minstep != null) __obj.updateDynamic("minstep")(minstep.asInstanceOf[js.Any])
    if (!js.isUndefined(nice)) __obj.updateDynamic("nice")(nice)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps)
    __obj.asInstanceOf[BinParams]
  }
}

