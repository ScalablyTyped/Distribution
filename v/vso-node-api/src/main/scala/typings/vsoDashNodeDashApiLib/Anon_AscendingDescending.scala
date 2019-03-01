package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AscendingDescending extends js.Object {
  var ascending: scala.Double
  var descending: scala.Double
  var none: scala.Double
}

object Anon_AscendingDescending {
  @scala.inline
  def apply(ascending: scala.Double, descending: scala.Double, none: scala.Double): Anon_AscendingDescending = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ascending")(ascending)
    __obj.updateDynamic("descending")(descending)
    __obj.updateDynamic("none")(none)
    __obj.asInstanceOf[Anon_AscendingDescending]
  }
}

