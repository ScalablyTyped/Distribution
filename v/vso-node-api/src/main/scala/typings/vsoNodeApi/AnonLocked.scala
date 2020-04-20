package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLocked extends js.Object {
  var builtIn: Double
  var disabled: Double
  var locked: Double
  var multiVersion: Double
  var none: Double
  var paid: Double
  var preview: Double
  var public: Double
  var system: Double
  var trial: Double
  var trusted: Double
  var unpublished: Double
  var validated: Double
}

object AnonLocked {
  @scala.inline
  def apply(
    builtIn: Double,
    disabled: Double,
    locked: Double,
    multiVersion: Double,
    none: Double,
    paid: Double,
    preview: Double,
    public: Double,
    system: Double,
    trial: Double,
    trusted: Double,
    unpublished: Double,
    validated: Double
  ): AnonLocked = {
    val __obj = js.Dynamic.literal(builtIn = builtIn.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], multiVersion = multiVersion.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], paid = paid.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], trial = trial.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any], unpublished = unpublished.asInstanceOf[js.Any], validated = validated.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLocked]
  }
}

