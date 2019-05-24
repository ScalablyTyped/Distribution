package typings
package vegaDashTypingsLib.typesSpecTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KDETransform extends _Transforms {
  var as: js.UndefOr[
    (vegaDashTypingsLib.typesSpecUtilMod.Vector2[java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var bandwidth: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var counts: js.UndefOr[scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var cumulative: js.UndefOr[scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var extent: js.UndefOr[
    (js.Tuple2[scala.Double, scala.Double]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var field: java.lang.String | TransformField
  var groupby: js.UndefOr[
    (js.Array[java.lang.String | TransformField]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var maxsteps: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var minsteps: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var steps: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.kde
}

object KDETransform {
  @scala.inline
  def apply(
    field: java.lang.String | TransformField,
    `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.kde,
    as: (vegaDashTypingsLib.typesSpecUtilMod.Vector2[java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    bandwidth: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    counts: scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    cumulative: scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    extent: (js.Tuple2[scala.Double, scala.Double]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    groupby: (js.Array[java.lang.String | TransformField]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    maxsteps: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    minsteps: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    steps: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null
  ): KDETransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (bandwidth != null) __obj.updateDynamic("bandwidth")(bandwidth.asInstanceOf[js.Any])
    if (counts != null) __obj.updateDynamic("counts")(counts.asInstanceOf[js.Any])
    if (cumulative != null) __obj.updateDynamic("cumulative")(cumulative.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (groupby != null) __obj.updateDynamic("groupby")(groupby.asInstanceOf[js.Any])
    if (maxsteps != null) __obj.updateDynamic("maxsteps")(maxsteps.asInstanceOf[js.Any])
    if (minsteps != null) __obj.updateDynamic("minsteps")(minsteps.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[KDETransform]
  }
}

