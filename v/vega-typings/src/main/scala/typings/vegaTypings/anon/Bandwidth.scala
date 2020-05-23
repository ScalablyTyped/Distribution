package typings.vegaTypings.anon

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.transformMod.FieldRef
import typings.vegaTypings.vegaTypingsStrings.contour
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bandwidth extends js.Object {
  var bandwidth: js.UndefOr[Double | SignalRef] = js.undefined
  var cellSize: js.UndefOr[Double | SignalRef] = js.undefined
  var signal: js.UndefOr[String] = js.undefined
  var size: (js.Array[Double | SignalRef]) | SignalRef
  var `type`: contour
   // TODO: change to Vector2<number | SignalRef> after https://github.com/Microsoft/TypeScript/issues/28017 has been fixed
  var values: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.undefined
  var x: js.UndefOr[FieldRef] = js.undefined
  var y: js.UndefOr[FieldRef] = js.undefined
}

object Bandwidth {
  @scala.inline
  def apply(
    size: (js.Array[Double | SignalRef]) | SignalRef,
    `type`: contour,
    bandwidth: Double | SignalRef = null,
    cellSize: Double | SignalRef = null,
    signal: String = null,
    values: (js.Array[Double | SignalRef]) | SignalRef = null,
    x: FieldRef = null,
    y: FieldRef = null
  ): Bandwidth = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bandwidth != null) __obj.updateDynamic("bandwidth")(bandwidth.asInstanceOf[js.Any])
    if (cellSize != null) __obj.updateDynamic("cellSize")(cellSize.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bandwidth]
  }
}

