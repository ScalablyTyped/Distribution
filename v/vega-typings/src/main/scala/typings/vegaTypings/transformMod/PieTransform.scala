package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.vegaTypingsStrings.pie
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PieTransform extends _Transforms {
  var as: js.UndefOr[(Vector2[String | SignalRef]) | SignalRef] = js.undefined
  var endAngle: js.UndefOr[Double | SignalRef] = js.undefined
  var field: js.UndefOr[FieldRef] = js.undefined
  var sort: js.UndefOr[Boolean | SignalRef] = js.undefined
  var startAngle: js.UndefOr[Double | SignalRef] = js.undefined
  var `type`: pie
}

object PieTransform {
  @scala.inline
  def apply(
    `type`: pie,
    as: (Vector2[String | SignalRef]) | SignalRef = null,
    endAngle: Double | SignalRef = null,
    field: FieldRef = null,
    sort: Boolean | SignalRef = null,
    startAngle: Double | SignalRef = null
  ): PieTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieTransform]
  }
}

