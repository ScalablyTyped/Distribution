package typings.vegaDashLite.buildSrcBinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinParams extends BaseBin {
  /**
    * A two-element (`[min, max]`) array indicating the range of desired bin values.
    * @minItems 2
    * @maxItems 2
    */
  var extent: js.UndefOr[js.Array[Double]] = js.undefined
}

object BinParams {
  @scala.inline
  def apply(
    anchor: Int | Double = null,
    base: Int | Double = null,
    divide: js.Array[Double] = null,
    extent: js.Array[Double] = null,
    maxbins: Int | Double = null,
    minstep: Int | Double = null,
    nice: js.UndefOr[Boolean] = js.undefined,
    step: Int | Double = null,
    steps: js.Array[Double] = null
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

