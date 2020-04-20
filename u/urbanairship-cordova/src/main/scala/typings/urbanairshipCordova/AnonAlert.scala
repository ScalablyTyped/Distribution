package typings.urbanairshipCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlert extends js.Object {
  var alert: Double
  var badge: Double
  var none: Double
  var sound: Double
}

object AnonAlert {
  @scala.inline
  def apply(alert: Double, badge: Double, none: Double, sound: Double): AnonAlert = {
    val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], badge = badge.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], sound = sound.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlert]
  }
}

