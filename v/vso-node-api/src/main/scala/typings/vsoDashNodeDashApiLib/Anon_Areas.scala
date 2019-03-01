package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Areas extends js.Object {
  var areas: scala.Double
  var iterations: scala.Double
}

object Anon_Areas {
  @scala.inline
  def apply(areas: scala.Double, iterations: scala.Double): Anon_Areas = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("areas")(areas)
    __obj.updateDynamic("iterations")(iterations)
    __obj.asInstanceOf[Anon_Areas]
  }
}

