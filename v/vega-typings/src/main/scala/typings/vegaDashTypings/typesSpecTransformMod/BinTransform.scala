package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.typesSpecUtilMod.Vector2
import typings.vegaDashTypings.vegaDashTypingsStrings.bin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinTransform
  extends BaseBin
     with Transforms {
  var anchor: js.UndefOr[Double | SignalRef] = js.undefined
  var as: js.UndefOr[(Vector2[String | SignalRef]) | SignalRef] = js.undefined
  var extent: (Vector2[Double | SignalRef]) | SignalRef
  var field: FieldRef
  var interval: js.UndefOr[Boolean | SignalRef] = js.undefined
  var name: js.UndefOr[String | SignalRef] = js.undefined
  var signal: js.UndefOr[SignalName] = js.undefined
  var span: js.UndefOr[Double | SignalRef] = js.undefined
  var `type`: bin
}

object BinTransform {
  @scala.inline
  def apply(
    extent: (Vector2[Double | SignalRef]) | SignalRef,
    field: FieldRef,
    `type`: bin,
    anchor: Double | SignalRef = null,
    as: (Vector2[String | SignalRef]) | SignalRef = null,
    base: Double | SignalRef = null,
    divide: (Vector2[Double | SignalRef]) | SignalRef = null,
    interval: Boolean | SignalRef = null,
    maxbins: Double | SignalRef = null,
    minstep: Double | SignalRef = null,
    name: String | SignalRef = null,
    nice: Boolean | SignalRef = null,
    signal: SignalName = null,
    span: Double | SignalRef = null,
    step: Double | SignalRef = null,
    steps: (js.Array[Double | SignalRef]) | SignalRef = null
  ): BinTransform = {
    val __obj = js.Dynamic.literal(extent = extent.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (divide != null) __obj.updateDynamic("divide")(divide.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (maxbins != null) __obj.updateDynamic("maxbins")(maxbins.asInstanceOf[js.Any])
    if (minstep != null) __obj.updateDynamic("minstep")(minstep.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nice != null) __obj.updateDynamic("nice")(nice.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal)
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinTransform]
  }
}

