package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.vegaDashTypingsStrings.force
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForceTransform extends _Transforms {
  var alpha: js.UndefOr[Double | SignalRef] = js.undefined
  var alphaMin: js.UndefOr[Double | SignalRef] = js.undefined
  var alphaTarget: js.UndefOr[Double | SignalRef] = js.undefined
  var forces: js.UndefOr[(js.Array[Force | SignalRef]) | SignalRef] = js.undefined
  var iterations: js.UndefOr[Double | SignalRef] = js.undefined
  var restart: js.UndefOr[Boolean | SignalRef] = js.undefined
  var signal: js.UndefOr[SignalName] = js.undefined
  var static: js.UndefOr[Boolean | SignalRef] = js.undefined
  var `type`: force
  var velocityDecay: js.UndefOr[Double | SignalRef] = js.undefined
}

object ForceTransform {
  @scala.inline
  def apply(
    `type`: force,
    alpha: Double | SignalRef = null,
    alphaMin: Double | SignalRef = null,
    alphaTarget: Double | SignalRef = null,
    forces: (js.Array[Force | SignalRef]) | SignalRef = null,
    iterations: Double | SignalRef = null,
    restart: Boolean | SignalRef = null,
    signal: SignalName = null,
    static: Boolean | SignalRef = null,
    velocityDecay: Double | SignalRef = null
  ): ForceTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (alphaMin != null) __obj.updateDynamic("alphaMin")(alphaMin.asInstanceOf[js.Any])
    if (alphaTarget != null) __obj.updateDynamic("alphaTarget")(alphaTarget.asInstanceOf[js.Any])
    if (forces != null) __obj.updateDynamic("forces")(forces.asInstanceOf[js.Any])
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    if (restart != null) __obj.updateDynamic("restart")(restart.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (static != null) __obj.updateDynamic("static")(static.asInstanceOf[js.Any])
    if (velocityDecay != null) __obj.updateDynamic("velocityDecay")(velocityDecay.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceTransform]
  }
}

