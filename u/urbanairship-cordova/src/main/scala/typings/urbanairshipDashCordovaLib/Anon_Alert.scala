package typings
package urbanairshipDashCordovaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alert extends js.Object {
  var alert: scala.Double
  var badge: scala.Double
  var none: scala.Double
  var sound: scala.Double
}

object Anon_Alert {
  @scala.inline
  def apply(alert: scala.Double, badge: scala.Double, none: scala.Double, sound: scala.Double): Anon_Alert = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alert")(alert)
    __obj.updateDynamic("badge")(badge)
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("sound")(sound)
    __obj.asInstanceOf[Anon_Alert]
  }
}

