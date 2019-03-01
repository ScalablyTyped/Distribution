package typings
package vegaDashTypingsLib.typesSpecTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinTransform
  extends BaseBin
     with _Transforms {
  var anchor: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var as: js.UndefOr[
    (vegaDashTypingsLib.typesSpecUtilMod.Vector2[java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var extent: (vegaDashTypingsLib.typesSpecUtilMod.Vector2[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  var field: java.lang.String | TransformField
  var name: js.UndefOr[java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var signal: js.UndefOr[java.lang.String] = js.undefined
  var `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.bin
}

object BinTransform {
  @scala.inline
  def apply(
    extent: (vegaDashTypingsLib.typesSpecUtilMod.Vector2[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef,
    field: java.lang.String | TransformField,
    `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.bin,
    anchor: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    as: (vegaDashTypingsLib.typesSpecUtilMod.Vector2[java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    base: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    divide: (vegaDashTypingsLib.typesSpecUtilMod.Vector2[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    maxbins: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    minstep: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    name: java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    nice: scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    signal: java.lang.String = null,
    step: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    steps: (js.Array[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null
  ): BinTransform = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (divide != null) __obj.updateDynamic("divide")(divide.asInstanceOf[js.Any])
    if (maxbins != null) __obj.updateDynamic("maxbins")(maxbins.asInstanceOf[js.Any])
    if (minstep != null) __obj.updateDynamic("minstep")(minstep.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nice != null) __obj.updateDynamic("nice")(nice.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinTransform]
  }
}

