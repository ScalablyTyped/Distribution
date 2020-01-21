package typings.vegaTypings.transformMod

import typings.vegaTypings.exprMod.ExprRef
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.collide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForceCollide extends Force {
  var force: collide
  var iterations: js.UndefOr[Double | SignalRef] = js.undefined
  var radius: js.UndefOr[Double | SignalRef | ExprRef] = js.undefined
  var strength: js.UndefOr[Double | SignalRef] = js.undefined
}

object ForceCollide {
  @scala.inline
  def apply(
    force: collide,
    iterations: Double | SignalRef = null,
    radius: Double | SignalRef | ExprRef = null,
    strength: Double | SignalRef = null
  ): ForceCollide = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (strength != null) __obj.updateDynamic("strength")(strength.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceCollide]
  }
}

