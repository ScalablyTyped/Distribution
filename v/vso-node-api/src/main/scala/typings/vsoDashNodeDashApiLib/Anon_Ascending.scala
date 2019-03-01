package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ascending extends js.Object {
  var ascending: scala.Double
  var default: scala.Double
  var descending: scala.Double
}

object Anon_Ascending {
  @scala.inline
  def apply(ascending: scala.Double, default: scala.Double, descending: scala.Double): Anon_Ascending = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ascending")(ascending)
    __obj.updateDynamic("default")(default)
    __obj.updateDynamic("descending")(descending)
    __obj.asInstanceOf[Anon_Ascending]
  }
}

