package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PartiallyResolved extends js.Object {
  var partiallyResolved: scala.Double
  var resolved: scala.Double
  var unresolved: scala.Double
}

object Anon_PartiallyResolved {
  @scala.inline
  def apply(partiallyResolved: scala.Double, resolved: scala.Double, unresolved: scala.Double): Anon_PartiallyResolved = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("partiallyResolved")(partiallyResolved)
    __obj.updateDynamic("resolved")(resolved)
    __obj.updateDynamic("unresolved")(unresolved)
    __obj.asInstanceOf[Anon_PartiallyResolved]
  }
}

