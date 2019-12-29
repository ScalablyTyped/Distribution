package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecExprMod.ExprRef
import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.vegaDashTypingsStrings.center
import typings.vegaDashTypings.vegaDashTypingsStrings.collide
import typings.vegaDashTypings.vegaDashTypingsStrings.link
import typings.vegaDashTypings.vegaDashTypingsStrings.nbody
import typings.vegaDashTypings.vegaDashTypingsStrings.x
import typings.vegaDashTypings.vegaDashTypingsStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaDashTypings.typesSpecTransformMod.ForceCenter
  - typings.vegaDashTypings.typesSpecTransformMod.ForceCollide
  - typings.vegaDashTypings.typesSpecTransformMod.ForceLink
  - typings.vegaDashTypings.typesSpecTransformMod.ForceNBody
  - typings.vegaDashTypings.typesSpecTransformMod.ForceX
  - typings.vegaDashTypings.typesSpecTransformMod.ForceY
*/
trait Force extends js.Object

object Force {
  @scala.inline
  def ForceCenter(force: center, x: Double | SignalRef = null, y: Double | SignalRef = null): Force = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Force]
  }
  @scala.inline
  def ForceLink(
    force: link,
    distance: Double | SignalRef | ExprRef = null,
    id: FieldRef = null,
    iterations: Double | SignalRef = null,
    links: DataName = null,
    strength: Double | SignalRef | ExprRef = null
  ): Force = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (strength != null) __obj.updateDynamic("strength")(strength.asInstanceOf[js.Any])
    __obj.asInstanceOf[Force]
  }
  @scala.inline
  def ForceX(force: x, strength: Double | SignalRef = null, x: FieldRef = null): Force = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    if (strength != null) __obj.updateDynamic("strength")(strength.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    __obj.asInstanceOf[Force]
  }
  @scala.inline
  def ForceY(force: y, strength: Double | SignalRef = null, y: FieldRef = null): Force = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    if (strength != null) __obj.updateDynamic("strength")(strength.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Force]
  }
  @scala.inline
  def ForceCollide(
    force: collide,
    iterations: Double | SignalRef = null,
    radius: Double | SignalRef | ExprRef = null,
    strength: Double | SignalRef = null
  ): Force = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (strength != null) __obj.updateDynamic("strength")(strength.asInstanceOf[js.Any])
    __obj.asInstanceOf[Force]
  }
  @scala.inline
  def ForceNBody(
    force: nbody,
    distanceMax: Double | SignalRef = null,
    distanceMin: Double | SignalRef = null,
    strength: Double | SignalRef = null,
    theta: Double | SignalRef = null
  ): Force = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    if (distanceMax != null) __obj.updateDynamic("distanceMax")(distanceMax.asInstanceOf[js.Any])
    if (distanceMin != null) __obj.updateDynamic("distanceMin")(distanceMin.asInstanceOf[js.Any])
    if (strength != null) __obj.updateDynamic("strength")(strength.asInstanceOf[js.Any])
    if (theta != null) __obj.updateDynamic("theta")(theta.asInstanceOf[js.Any])
    __obj.asInstanceOf[Force]
  }
}

