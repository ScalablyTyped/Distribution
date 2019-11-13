package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.vegaDashTypingsStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForceY extends Force {
  var force: y
  var strength: js.UndefOr[Double | SignalRef] = js.undefined
  var y: js.UndefOr[FieldRef] = js.undefined
}

object ForceY {
  @scala.inline
  def apply(force: y, strength: Double | SignalRef = null, y: FieldRef = null): ForceY = {
    val __obj = js.Dynamic.literal(force = force)
    if (strength != null) __obj.updateDynamic("strength")(strength.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceY]
  }
}

