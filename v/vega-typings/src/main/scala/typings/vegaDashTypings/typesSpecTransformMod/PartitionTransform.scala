package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecMarkMod.Compare
import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.typesSpecUtilMod.Vector2
import typings.vegaDashTypings.typesSpecUtilMod.Vector6
import typings.vegaDashTypings.vegaDashTypingsStrings.partition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartitionTransform extends _Transforms {
  var as: js.UndefOr[(Vector6[String | SignalRef]) | SignalRef] = js.undefined
  var field: js.UndefOr[FieldRef] = js.undefined
  var padding: js.UndefOr[Double | SignalRef] = js.undefined
  var round: js.UndefOr[Boolean | SignalRef] = js.undefined
  var size: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.undefined
  var sort: js.UndefOr[Compare] = js.undefined
  var `type`: partition
}

object PartitionTransform {
  @scala.inline
  def apply(
    `type`: partition,
    as: (Vector6[String | SignalRef]) | SignalRef = null,
    field: FieldRef = null,
    padding: Double | SignalRef = null,
    round: Boolean | SignalRef = null,
    size: (Vector2[Double | SignalRef]) | SignalRef = null,
    sort: Compare = null
  ): PartitionTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartitionTransform]
  }
}

