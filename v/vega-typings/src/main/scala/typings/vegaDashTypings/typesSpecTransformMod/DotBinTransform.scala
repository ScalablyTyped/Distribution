package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.vegaDashTypingsStrings.dotbin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DotBinTransform extends _Transforms {
  var as: js.UndefOr[String | SignalRef] = js.undefined
  var field: String | TransformField
  var groupby: js.UndefOr[(js.Array[String | TransformField]) | SignalRef] = js.undefined
  var signal: js.UndefOr[String] = js.undefined
  var smooth: js.UndefOr[Boolean | SignalRef] = js.undefined
  var step: js.UndefOr[Double | SignalRef] = js.undefined
  var `type`: dotbin
}

object DotBinTransform {
  @scala.inline
  def apply(
    field: String | TransformField,
    `type`: dotbin,
    as: String | SignalRef = null,
    groupby: (js.Array[String | TransformField]) | SignalRef = null,
    signal: String = null,
    smooth: Boolean | SignalRef = null,
    step: Double | SignalRef = null
  ): DotBinTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (groupby != null) __obj.updateDynamic("groupby")(groupby.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal)
    if (smooth != null) __obj.updateDynamic("smooth")(smooth.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotBinTransform]
  }
}

