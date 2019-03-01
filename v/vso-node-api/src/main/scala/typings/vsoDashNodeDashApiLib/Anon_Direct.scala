package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Direct extends js.Object {
  var direct: scala.Double
  var expanded: scala.Double
  var expandedDown: scala.Double
  var expandedUp: scala.Double
  var none: scala.Double
}

object Anon_Direct {
  @scala.inline
  def apply(
    direct: scala.Double,
    expanded: scala.Double,
    expandedDown: scala.Double,
    expandedUp: scala.Double,
    none: scala.Double
  ): Anon_Direct = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("direct")(direct)
    __obj.updateDynamic("expanded")(expanded)
    __obj.updateDynamic("expandedDown")(expandedDown)
    __obj.updateDynamic("expandedUp")(expandedUp)
    __obj.updateDynamic("none")(none)
    __obj.asInstanceOf[Anon_Direct]
  }
}

