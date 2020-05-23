package typings.urbanairshipCordova.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alert extends js.Object {
  var alert: Double
  var badge: Double
  var none: Double
  var sound: Double
}

object Alert {
  @scala.inline
  def apply(alert: Double, badge: Double, none: Double, sound: Double): Alert = {
    val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], badge = badge.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], sound = sound.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alert]
  }
}

