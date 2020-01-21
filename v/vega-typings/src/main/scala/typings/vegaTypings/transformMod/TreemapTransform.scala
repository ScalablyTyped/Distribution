package typings.vegaTypings.transformMod

import typings.vegaTypings.markMod.Compare
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.utilMod.Vector6
import typings.vegaTypings.vegaTypingsStrings.treemap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreemapTransform extends _Transforms {
  var as: js.UndefOr[(Vector6[String | SignalRef]) | SignalRef] = js.undefined
  var field: js.UndefOr[FieldRef] = js.undefined
  var method: js.UndefOr[TreemapMethod | SignalRef] = js.undefined
  var padding: js.UndefOr[Double | SignalRef] = js.undefined
  var paddingBottom: js.UndefOr[Double | SignalRef] = js.undefined
  var paddingInner: js.UndefOr[Double | SignalRef] = js.undefined
  var paddingLeft: js.UndefOr[Double | SignalRef] = js.undefined
  var paddingOuter: js.UndefOr[Double | SignalRef] = js.undefined
  var paddingRight: js.UndefOr[Double | SignalRef] = js.undefined
  var paddingTop: js.UndefOr[Double | SignalRef] = js.undefined
  var ratio: js.UndefOr[Double | SignalRef] = js.undefined
  var round: js.UndefOr[Boolean | SignalRef] = js.undefined
  var size: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.undefined
  var sort: js.UndefOr[Compare] = js.undefined
  var `type`: treemap
}

object TreemapTransform {
  @scala.inline
  def apply(
    `type`: treemap,
    as: (Vector6[String | SignalRef]) | SignalRef = null,
    field: FieldRef = null,
    method: TreemapMethod | SignalRef = null,
    padding: Double | SignalRef = null,
    paddingBottom: Double | SignalRef = null,
    paddingInner: Double | SignalRef = null,
    paddingLeft: Double | SignalRef = null,
    paddingOuter: Double | SignalRef = null,
    paddingRight: Double | SignalRef = null,
    paddingTop: Double | SignalRef = null,
    ratio: Double | SignalRef = null,
    round: Boolean | SignalRef = null,
    size: (Vector2[Double | SignalRef]) | SignalRef = null,
    sort: Compare = null
  ): TreemapTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom.asInstanceOf[js.Any])
    if (paddingInner != null) __obj.updateDynamic("paddingInner")(paddingInner.asInstanceOf[js.Any])
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (paddingOuter != null) __obj.updateDynamic("paddingOuter")(paddingOuter.asInstanceOf[js.Any])
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreemapTransform]
  }
}

