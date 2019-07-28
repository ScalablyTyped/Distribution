package typings.webpackbar.webpackbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var color: String
  var isRunning: Boolean
  var profile: Profile | Null
}

object State {
  @scala.inline
  def apply(color: String, isRunning: Boolean, profile: Profile = null): State = {
    val __obj = js.Dynamic.literal(color = color, isRunning = isRunning)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    __obj.asInstanceOf[State]
  }
}

