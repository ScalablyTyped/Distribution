package typings.vegaDashLite.buildSrcVegaDotSchemaMod

import typings.vegaDashLite.Anon_Signal
import typings.vegaDashLite.buildSrcBinMod.BaseBin
import typings.vegaDashLite.vegaDashLiteStrings.bin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgBinTransform
  extends BaseBin
     with VgTransform {
  var as: js.Array[String]
  var extent: js.UndefOr[js.Array[Double] | Anon_Signal] = js.undefined
  var field: String
  var signal: js.UndefOr[String] = js.undefined
  var `type`: bin
}

object VgBinTransform {
  @scala.inline
  def apply(
    as: js.Array[String],
    field: String,
    `type`: bin,
    anchor: Int | Double = null,
    base: Int | Double = null,
    divide: js.Array[Double] = null,
    extent: js.Array[Double] | Anon_Signal = null,
    maxbins: Int | Double = null,
    minstep: Int | Double = null,
    nice: js.UndefOr[Boolean] = js.undefined,
    signal: String = null,
    step: Int | Double = null,
    steps: js.Array[Double] = null
  ): VgBinTransform = {
    val __obj = js.Dynamic.literal(as = as, field = field)
    __obj.updateDynamic("type")(`type`)
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (divide != null) __obj.updateDynamic("divide")(divide)
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (maxbins != null) __obj.updateDynamic("maxbins")(maxbins.asInstanceOf[js.Any])
    if (minstep != null) __obj.updateDynamic("minstep")(minstep.asInstanceOf[js.Any])
    if (!js.isUndefined(nice)) __obj.updateDynamic("nice")(nice)
    if (signal != null) __obj.updateDynamic("signal")(signal)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps)
    __obj.asInstanceOf[VgBinTransform]
  }
}

