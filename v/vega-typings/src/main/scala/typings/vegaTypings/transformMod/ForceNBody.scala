package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.nbody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForceNBody extends Force {
  var distanceMax: js.UndefOr[Double | SignalRef] = js.undefined
  var distanceMin: js.UndefOr[Double | SignalRef] = js.undefined
  var force: nbody
  var strength: js.UndefOr[Double | SignalRef] = js.undefined
  var theta: js.UndefOr[Double | SignalRef] = js.undefined
}

object ForceNBody {
  @scala.inline
  def apply(
    force: nbody,
    distanceMax: Double | SignalRef = null,
    distanceMin: Double | SignalRef = null,
    strength: Double | SignalRef = null,
    theta: Double | SignalRef = null
  ): ForceNBody = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    if (distanceMax != null) __obj.updateDynamic("distanceMax")(distanceMax.asInstanceOf[js.Any])
    if (distanceMin != null) __obj.updateDynamic("distanceMin")(distanceMin.asInstanceOf[js.Any])
    if (strength != null) __obj.updateDynamic("strength")(strength.asInstanceOf[js.Any])
    if (theta != null) __obj.updateDynamic("theta")(theta.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceNBody]
  }
}

