package typings.vegaTypings.transformMod

import typings.vegaTypings.markMod.Compare
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.utilMod.Vector7
import typings.vegaTypings.vegaTypingsStrings.begin
import typings.vegaTypings.vegaTypingsStrings.end
import typings.vegaTypings.vegaTypingsStrings.label
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelTransform extends _Transforms {
  var anchor: js.UndefOr[js.Array[String] | String | SignalRef] = js.undefined
  var as: js.UndefOr[(Vector7[String | SignalRef]) | SignalRef] = js.undefined
  var avoidBaseMark: js.UndefOr[Boolean | SignalRef] = js.undefined
  var avoidMarks: js.UndefOr[js.Array[String]] = js.undefined
  var lineAnchor: js.UndefOr[begin | end | SignalRef] = js.undefined
  var markIndex: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[js.Array[Double] | Double | SignalRef] = js.undefined
  var padding: js.UndefOr[Double | SignalRef] = js.undefined
  var size: (Vector2[Double | SignalRef]) | SignalRef
  var sort: js.UndefOr[Compare] = js.undefined
  var `type`: label
}

object LabelTransform {
  @scala.inline
  def apply(
    size: (Vector2[Double | SignalRef]) | SignalRef,
    `type`: label,
    anchor: js.Array[String] | String | SignalRef = null,
    as: (Vector7[String | SignalRef]) | SignalRef = null,
    avoidBaseMark: Boolean | SignalRef = null,
    avoidMarks: js.Array[String] = null,
    lineAnchor: begin | end | SignalRef = null,
    markIndex: Int | Double = null,
    offset: js.Array[Double] | Double | SignalRef = null,
    padding: Double | SignalRef = null,
    sort: Compare = null
  ): LabelTransform = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (avoidBaseMark != null) __obj.updateDynamic("avoidBaseMark")(avoidBaseMark.asInstanceOf[js.Any])
    if (avoidMarks != null) __obj.updateDynamic("avoidMarks")(avoidMarks.asInstanceOf[js.Any])
    if (lineAnchor != null) __obj.updateDynamic("lineAnchor")(lineAnchor.asInstanceOf[js.Any])
    if (markIndex != null) __obj.updateDynamic("markIndex")(markIndex.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelTransform]
  }
}

