package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.kde2d
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KDE2DTransform extends _Transforms {
  var as: js.UndefOr[String | SignalRef] = js.undefined
  var bandwidth: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.undefined
  var cellSize: js.UndefOr[Double | SignalRef] = js.undefined
   // TODO: change to Vector2<number | SignalRef> after https://github.com/Microsoft/TypeScript/issues/28017 has been fixed
  var counts: js.UndefOr[Boolean | SignalRef] = js.undefined
  var groupby: js.UndefOr[(js.Array[String | TransformField]) | SignalRef] = js.undefined
  var size: (js.Array[Double | SignalRef]) | SignalRef
  var `type`: kde2d
  var weight: js.UndefOr[String | TransformField] = js.undefined
   // TODO: change to Vector2<number | SignalRef> after https://github.com/Microsoft/TypeScript/issues/28017 has been fixed
  var x: String | TransformField
  var y: String | TransformField
}

object KDE2DTransform {
  @scala.inline
  def apply(
    size: (js.Array[Double | SignalRef]) | SignalRef,
    `type`: kde2d,
    x: String | TransformField,
    y: String | TransformField,
    as: String | SignalRef = null,
    bandwidth: (js.Array[Double | SignalRef]) | SignalRef = null,
    cellSize: Double | SignalRef = null,
    counts: Boolean | SignalRef = null,
    groupby: (js.Array[String | TransformField]) | SignalRef = null,
    weight: String | TransformField = null
  ): KDE2DTransform = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (bandwidth != null) __obj.updateDynamic("bandwidth")(bandwidth.asInstanceOf[js.Any])
    if (cellSize != null) __obj.updateDynamic("cellSize")(cellSize.asInstanceOf[js.Any])
    if (counts != null) __obj.updateDynamic("counts")(counts.asInstanceOf[js.Any])
    if (groupby != null) __obj.updateDynamic("groupby")(groupby.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[KDE2DTransform]
  }
}

