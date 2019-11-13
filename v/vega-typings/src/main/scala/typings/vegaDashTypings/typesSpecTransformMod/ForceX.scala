package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.vegaDashTypingsStrings.x
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForceX extends Force {
  var force: x
  var strength: js.UndefOr[Double | SignalRef] = js.undefined
  var x: js.UndefOr[FieldRef] = js.undefined
}

object ForceX {
  @scala.inline
  def apply(force: x, strength: Double | SignalRef = null, x: FieldRef = null): ForceX = {
    val __obj = js.Dynamic.literal(force = force)
    if (strength != null) __obj.updateDynamic("strength")(strength.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceX]
  }
}

