package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.vegaDashTypingsStrings.contour
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContourTransform extends Transforms {
  var bandwidth: js.UndefOr[Double | SignalRef] = js.undefined
  var cellSize: js.UndefOr[Double | SignalRef] = js.undefined
  var count: js.UndefOr[Double | SignalRef] = js.undefined
  var nice: js.UndefOr[Double | SignalRef] = js.undefined
  var signal: js.UndefOr[String] = js.undefined
  var size: (js.Array[Double | SignalRef]) | SignalRef
  var thresholds: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.undefined
  var `type`: contour
   // TODO: change to Vector2<number | SignalRef> after https://github.com/Microsoft/TypeScript/issues/28017 has been fixed
  var values: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.undefined
  var x: js.UndefOr[FieldRef] = js.undefined
  var y: js.UndefOr[FieldRef] = js.undefined
}

object ContourTransform {
  @scala.inline
  def apply(
    size: (js.Array[Double | SignalRef]) | SignalRef,
    `type`: contour,
    bandwidth: Double | SignalRef = null,
    cellSize: Double | SignalRef = null,
    count: Double | SignalRef = null,
    nice: Double | SignalRef = null,
    signal: String = null,
    thresholds: (js.Array[Double | SignalRef]) | SignalRef = null,
    values: (js.Array[Double | SignalRef]) | SignalRef = null,
    x: FieldRef = null,
    y: FieldRef = null
  ): ContourTransform = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (bandwidth != null) __obj.updateDynamic("bandwidth")(bandwidth.asInstanceOf[js.Any])
    if (cellSize != null) __obj.updateDynamic("cellSize")(cellSize.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (nice != null) __obj.updateDynamic("nice")(nice.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal)
    if (thresholds != null) __obj.updateDynamic("thresholds")(thresholds.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContourTransform]
  }
}

