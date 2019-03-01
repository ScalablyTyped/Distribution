package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllOrNone extends js.Object {
  var allOrNone: scala.Double
  var bestEffort: scala.Double
}

object Anon_AllOrNone {
  @scala.inline
  def apply(allOrNone: scala.Double, bestEffort: scala.Double): Anon_AllOrNone = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allOrNone")(allOrNone)
    __obj.updateDynamic("bestEffort")(bestEffort)
    __obj.asInstanceOf[Anon_AllOrNone]
  }
}

