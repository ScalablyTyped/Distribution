package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AscendingDescendingNumber extends js.Object {
  var ascending: scala.Double
  var descending: scala.Double
}

object Anon_AscendingDescendingNumber {
  @scala.inline
  def apply(ascending: scala.Double, descending: scala.Double): Anon_AscendingDescendingNumber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ascending")(ascending)
    __obj.updateDynamic("descending")(descending)
    __obj.asInstanceOf[Anon_AscendingDescendingNumber]
  }
}

