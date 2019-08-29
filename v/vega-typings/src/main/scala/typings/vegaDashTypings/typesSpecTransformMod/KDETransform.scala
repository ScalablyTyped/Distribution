package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.typesSpecUtilMod.Vector2
import typings.vegaDashTypings.vegaDashTypingsStrings.independent
import typings.vegaDashTypings.vegaDashTypingsStrings.kde
import typings.vegaDashTypings.vegaDashTypingsStrings.shared
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KDETransform extends _Transforms {
  var as: js.UndefOr[(Vector2[String | SignalRef]) | SignalRef] = js.undefined
  var bandwidth: js.UndefOr[Double | SignalRef] = js.undefined
  var counts: js.UndefOr[Boolean | SignalRef] = js.undefined
  var cumulative: js.UndefOr[Boolean | SignalRef] = js.undefined
  var extent: js.UndefOr[(js.Tuple2[Double, Double]) | SignalRef] = js.undefined
  var field: String | TransformField
  var groupby: js.UndefOr[(js.Array[String | TransformField]) | SignalRef] = js.undefined
  var maxsteps: js.UndefOr[Double | SignalRef] = js.undefined
  var minsteps: js.UndefOr[Double | SignalRef] = js.undefined
  var resolve: js.UndefOr[shared | independent] = js.undefined
  var steps: js.UndefOr[Double | SignalRef] = js.undefined
  var `type`: kde
}

object KDETransform {
  @scala.inline
  def apply(
    field: String | TransformField,
    `type`: kde,
    as: (Vector2[String | SignalRef]) | SignalRef = null,
    bandwidth: Double | SignalRef = null,
    counts: Boolean | SignalRef = null,
    cumulative: Boolean | SignalRef = null,
    extent: (js.Tuple2[Double, Double]) | SignalRef = null,
    groupby: (js.Array[String | TransformField]) | SignalRef = null,
    maxsteps: Double | SignalRef = null,
    minsteps: Double | SignalRef = null,
    resolve: shared | independent = null,
    steps: Double | SignalRef = null
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
    if (resolve != null) __obj.updateDynamic("resolve")(resolve.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[KDETransform]
  }
}

