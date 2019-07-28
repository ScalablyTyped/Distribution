package typings.vegaDashLite.buildSrcBinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseBin extends js.Object {
  /**
    * A value in the binned domain at which to anchor the bins, shifting the bin boundaries if necessary to ensure that a boundary aligns with the anchor value.
    *
    * __Default Value:__ the minimum bin extent value
    */
  var anchor: js.UndefOr[Double] = js.undefined
  /**
    * The number base to use for automatic bin determination (default is base 10).
    *
    * __Default value:__ `10`
    *
    */
  var base: js.UndefOr[Double] = js.undefined
  /**
    * Scale factors indicating allowable subdivisions. The default value is [5, 2], which indicates that for base 10 numbers (the default base), the method may consider dividing bin sizes by 5 and/or 2. For example, for an initial step size of 10, the method can check if bin sizes of 2 (= 10/5), 5 (= 10/2), or 1 (= 10/(5*2)) might also satisfy the given constraints.
    *
    * __Default value:__ `[5, 2]`
    *
    * @minItems 1
    */
  var divide: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Maximum number of bins.
    *
    * __Default value:__ `6` for `row`, `column` and `shape` channels; `10` for other channels
    *
    * @minimum 2
    */
  var maxbins: js.UndefOr[Double] = js.undefined
  /**
    * A minimum allowable step size (particularly useful for integer values).
    */
  var minstep: js.UndefOr[Double] = js.undefined
  /**
    * If true (the default), attempts to make the bin boundaries use human-friendly boundaries, such as multiples of ten.
    */
  var nice: js.UndefOr[Boolean] = js.undefined
  /**
    * An exact step size to use between bins.
    *
    * __Note:__ If provided, options such as maxbins will be ignored.
    */
  var step: js.UndefOr[Double] = js.undefined
  /**
    * An array of allowable step sizes to choose from.
    * @minItems 1
    */
  var steps: js.UndefOr[js.Array[Double]] = js.undefined
}

object BaseBin {
  @scala.inline
  def apply(
    anchor: Int | Double = null,
    base: Int | Double = null,
    divide: js.Array[Double] = null,
    maxbins: Int | Double = null,
    minstep: Int | Double = null,
    nice: js.UndefOr[Boolean] = js.undefined,
    step: Int | Double = null,
    steps: js.Array[Double] = null
  ): BaseBin = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (divide != null) __obj.updateDynamic("divide")(divide)
    if (maxbins != null) __obj.updateDynamic("maxbins")(maxbins.asInstanceOf[js.Any])
    if (minstep != null) __obj.updateDynamic("minstep")(minstep.asInstanceOf[js.Any])
    if (!js.isUndefined(nice)) __obj.updateDynamic("nice")(nice)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps)
    __obj.asInstanceOf[BaseBin]
  }
}

