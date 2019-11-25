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
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], isRunning = isRunning.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

