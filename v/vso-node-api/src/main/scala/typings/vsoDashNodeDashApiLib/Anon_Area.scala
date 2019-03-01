package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Area extends js.Object {
  var area: scala.Double
  var iteration: scala.Double
}

object Anon_Area {
  @scala.inline
  def apply(area: scala.Double, iteration: scala.Double): Anon_Area = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("area")(area)
    __obj.updateDynamic("iteration")(iteration)
    __obj.asInstanceOf[Anon_Area]
  }
}

