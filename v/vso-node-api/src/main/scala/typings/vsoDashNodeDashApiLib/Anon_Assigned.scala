package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Assigned extends js.Object {
  var assigned: scala.Double
  var inherited: scala.Double
}

object Anon_Assigned {
  @scala.inline
  def apply(assigned: scala.Double, inherited: scala.Double): Anon_Assigned = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("assigned")(assigned)
    __obj.updateDynamic("inherited")(inherited)
    __obj.asInstanceOf[Anon_Assigned]
  }
}

