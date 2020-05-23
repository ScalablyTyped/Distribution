package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locked extends js.Object {
  var builtIn: scala.Double
  var disabled: scala.Double
  var locked: scala.Double
  var multiVersion: scala.Double
  var none: scala.Double
  var paid: scala.Double
  var preview: scala.Double
  var public: scala.Double
  var system: scala.Double
  var trial: scala.Double
  var trusted: scala.Double
  var unpublished: scala.Double
  var validated: scala.Double
}

object Locked {
  @scala.inline
  def apply(
    builtIn: scala.Double,
    disabled: scala.Double,
    locked: scala.Double,
    multiVersion: scala.Double,
    none: scala.Double,
    paid: scala.Double,
    preview: scala.Double,
    public: scala.Double,
    system: scala.Double,
    trial: scala.Double,
    trusted: scala.Double,
    unpublished: scala.Double,
    validated: scala.Double
  ): Locked = {
    val __obj = js.Dynamic.literal(builtIn = builtIn.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], multiVersion = multiVersion.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], paid = paid.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], trial = trial.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any], unpublished = unpublished.asInstanceOf[js.Any], validated = validated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locked]
  }
}

