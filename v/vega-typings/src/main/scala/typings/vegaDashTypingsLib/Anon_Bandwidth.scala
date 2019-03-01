package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bandwidth extends js.Object {
  var bandwidth: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var cellSize: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var signal: js.UndefOr[java.lang.String] = js.undefined
  var size: (js.Array[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  var `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.contour
   // TODO: change to Vector2<SignalRef | number> after https://github.com/Microsoft/TypeScript/issues/28017 has been fixed
  var values: js.UndefOr[
    (js.Array[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var x: js.UndefOr[java.lang.String | vegaDashTypingsLib.typesSpecTransformMod.TransformField] = js.undefined
  var y: js.UndefOr[java.lang.String | vegaDashTypingsLib.typesSpecTransformMod.TransformField] = js.undefined
}

object Anon_Bandwidth {
  @scala.inline
  def apply(
    size: (js.Array[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef,
    `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.contour,
    bandwidth: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    cellSize: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    signal: java.lang.String = null,
    values: (js.Array[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    x: java.lang.String | vegaDashTypingsLib.typesSpecTransformMod.TransformField = null,
    y: java.lang.String | vegaDashTypingsLib.typesSpecTransformMod.TransformField = null
  ): Anon_Bandwidth = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (bandwidth != null) __obj.updateDynamic("bandwidth")(bandwidth.asInstanceOf[js.Any])
    if (cellSize != null) __obj.updateDynamic("cellSize")(cellSize.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal)
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bandwidth]
  }
}

