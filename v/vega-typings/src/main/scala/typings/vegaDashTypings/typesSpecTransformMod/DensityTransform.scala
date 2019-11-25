package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.typesSpecUtilMod.Vector2
import typings.vegaDashTypings.vegaDashTypingsStrings.density
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DensityTransform extends _Transforms {
  var as: js.UndefOr[(Vector2[String | SignalRef]) | SignalRef] = js.undefined
  var distribution: js.UndefOr[Distribution | SignalRef] = js.undefined
  var extent: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.undefined
  var maxsteps: js.UndefOr[Double | SignalRef] = js.undefined
  var method: js.UndefOr[DensityMethod | SignalRef] = js.undefined
  var minsteps: js.UndefOr[Double | SignalRef] = js.undefined
  var steps: js.UndefOr[Double | SignalRef] = js.undefined
  var `type`: density
}

object DensityTransform {
  @scala.inline
  def apply(
    `type`: density,
    as: (Vector2[String | SignalRef]) | SignalRef = null,
    distribution: Distribution | SignalRef = null,
    extent: (Vector2[Double | SignalRef]) | SignalRef = null,
    maxsteps: Double | SignalRef = null,
    method: DensityMethod | SignalRef = null,
    minsteps: Double | SignalRef = null,
    steps: Double | SignalRef = null
  ): DensityTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (distribution != null) __obj.updateDynamic("distribution")(distribution.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (maxsteps != null) __obj.updateDynamic("maxsteps")(maxsteps.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (minsteps != null) __obj.updateDynamic("minsteps")(minsteps.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[DensityTransform]
  }
}

