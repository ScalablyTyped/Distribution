package typings.urbanairshipDashCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alert extends js.Object {
  var alert: Double
  var badge: Double
  var none: Double
  var sound: Double
}

object Anon_Alert {
  @scala.inline
  def apply(alert: Double, badge: Double, none: Double, sound: Double): Anon_Alert = {
    val __obj = js.Dynamic.literal(alert = alert, badge = badge, none = none, sound = sound)
  
    __obj.asInstanceOf[Anon_Alert]
  }
}

