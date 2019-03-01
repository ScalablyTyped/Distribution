package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Contains extends js.Object {
  var contains: scala.Double
  var exact: scala.Double
  var startsWith: scala.Double
}

object Anon_Contains {
  @scala.inline
  def apply(contains: scala.Double, exact: scala.Double, startsWith: scala.Double): Anon_Contains = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contains")(contains)
    __obj.updateDynamic("exact")(exact)
    __obj.updateDynamic("startsWith")(startsWith)
    __obj.asInstanceOf[Anon_Contains]
  }
}

