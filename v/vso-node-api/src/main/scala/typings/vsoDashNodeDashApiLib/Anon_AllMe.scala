package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllMe extends js.Object {
  var all: scala.Double
  var me: scala.Double
  var none: scala.Double
}

object Anon_AllMe {
  @scala.inline
  def apply(all: scala.Double, me: scala.Double, none: scala.Double): Anon_AllMe = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all)
    __obj.updateDynamic("me")(me)
    __obj.updateDynamic("none")(none)
    __obj.asInstanceOf[Anon_AllMe]
  }
}

