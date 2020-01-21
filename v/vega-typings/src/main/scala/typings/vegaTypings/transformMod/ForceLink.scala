package typings.vegaTypings.transformMod

import typings.vegaTypings.exprMod.ExprRef
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForceLink extends Force {
  var distance: js.UndefOr[Double | SignalRef | ExprRef] = js.undefined
  var force: link
  var id: js.UndefOr[FieldRef] = js.undefined
  var iterations: js.UndefOr[Double | SignalRef] = js.undefined
  var links: js.UndefOr[DataName] = js.undefined
  var strength: js.UndefOr[Double | SignalRef | ExprRef] = js.undefined
}

object ForceLink {
  @scala.inline
  def apply(
    force: link,
    distance: Double | SignalRef | ExprRef = null,
    id: FieldRef = null,
    iterations: Double | SignalRef = null,
    links: DataName = null,
    strength: Double | SignalRef | ExprRef = null
  ): ForceLink = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (strength != null) __obj.updateDynamic("strength")(strength.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceLink]
  }
}

