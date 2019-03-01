package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Behaviors extends js.Object {
  var behaviors: scala.Double
  var layout: scala.Double
  var none: scala.Double
  var states: scala.Double
}

object Anon_Behaviors {
  @scala.inline
  def apply(behaviors: scala.Double, layout: scala.Double, none: scala.Double, states: scala.Double): Anon_Behaviors = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("behaviors")(behaviors)
    __obj.updateDynamic("layout")(layout)
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("states")(states)
    __obj.asInstanceOf[Anon_Behaviors]
  }
}

