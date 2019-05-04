package typings
package vegaDashLiteLib.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgBinTransform
  extends vegaDashLiteLib.buildSrcBinMod.BaseBin
     with VgTransform {
  var as: js.Array[java.lang.String]
  var extent: js.UndefOr[js.Array[scala.Double] | vegaDashLiteLib.Anon_Signal] = js.undefined
  var field: java.lang.String
  var signal: js.UndefOr[java.lang.String] = js.undefined
  var `type`: vegaDashLiteLib.vegaDashLiteLibStrings.bin
}

object VgBinTransform {
  @scala.inline
  def apply(
    as: js.Array[java.lang.String],
    field: java.lang.String,
    `type`: vegaDashLiteLib.vegaDashLiteLibStrings.bin,
    anchor: scala.Int | scala.Double = null,
    base: scala.Int | scala.Double = null,
    divide: js.Array[scala.Double] = null,
    extent: js.Array[scala.Double] | vegaDashLiteLib.Anon_Signal = null,
    maxbins: scala.Int | scala.Double = null,
    minstep: scala.Int | scala.Double = null,
    nice: js.UndefOr[scala.Boolean] = js.undefined,
    signal: java.lang.String = null,
    step: scala.Int | scala.Double = null,
    steps: js.Array[scala.Double] = null
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

