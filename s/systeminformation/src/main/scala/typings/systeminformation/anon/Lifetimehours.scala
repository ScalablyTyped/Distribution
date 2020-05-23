package typings.systeminformation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lifetimehours extends js.Object {
  var lifetime_hours: Double
  var status: Value
  var `type`: String
}

object Lifetimehours {
  @scala.inline
  def apply(lifetime_hours: Double, status: Value, `type`: String): Lifetimehours = {
    val __obj = js.Dynamic.literal(lifetime_hours = lifetime_hours.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lifetimehours]
  }
}

