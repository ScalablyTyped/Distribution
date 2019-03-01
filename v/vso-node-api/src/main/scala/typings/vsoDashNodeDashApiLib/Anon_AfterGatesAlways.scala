package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AfterGatesAlways extends js.Object {
  var afterGatesAlways: scala.Double
  var afterSuccessfulGates: scala.Double
  var beforeGates: scala.Double
}

object Anon_AfterGatesAlways {
  @scala.inline
  def apply(afterGatesAlways: scala.Double, afterSuccessfulGates: scala.Double, beforeGates: scala.Double): Anon_AfterGatesAlways = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("afterGatesAlways")(afterGatesAlways)
    __obj.updateDynamic("afterSuccessfulGates")(afterSuccessfulGates)
    __obj.updateDynamic("beforeGates")(beforeGates)
    __obj.asInstanceOf[Anon_AfterGatesAlways]
  }
}

