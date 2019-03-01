package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Automated extends js.Object {
  var automated: scala.Double
  var manual: scala.Double
  var none: scala.Double
  var scheduled: scala.Double
}

object Anon_Automated {
  @scala.inline
  def apply(automated: scala.Double, manual: scala.Double, none: scala.Double, scheduled: scala.Double): Anon_Automated = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("automated")(automated)
    __obj.updateDynamic("manual")(manual)
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("scheduled")(scheduled)
    __obj.asInstanceOf[Anon_Automated]
  }
}

