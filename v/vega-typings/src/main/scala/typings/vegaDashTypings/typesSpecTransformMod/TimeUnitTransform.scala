package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.typesSpecUtilMod.Vector2
import typings.vegaDashTypings.vegaDashTypingsStrings.timeunit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeUnitTransform extends Transforms {
  var as: js.UndefOr[(Vector2[String | SignalRef]) | SignalRef] = js.undefined
  var field: FieldRef
  var interval: js.UndefOr[Boolean | SignalRef] = js.undefined
  var signal: js.UndefOr[SignalName] = js.undefined
  var step: js.UndefOr[Double | SignalRef] = js.undefined
  var timezone: js.UndefOr[TimeZone | SignalRef] = js.undefined
  var `type`: timeunit
  var units: js.UndefOr[(js.Array[TimeUnit | SignalRef]) | SignalRef] = js.undefined
}

object TimeUnitTransform {
  @scala.inline
  def apply(
    field: FieldRef,
    `type`: timeunit,
    as: (Vector2[String | SignalRef]) | SignalRef = null,
    interval: Boolean | SignalRef = null,
    signal: SignalName = null,
    step: Double | SignalRef = null,
    timezone: TimeZone | SignalRef = null,
    units: (js.Array[TimeUnit | SignalRef]) | SignalRef = null
  ): TimeUnitTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeUnitTransform]
  }
}

