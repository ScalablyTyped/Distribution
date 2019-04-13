package typings
package webpackbarLib.webpackbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var color: java.lang.String
  var isRunning: scala.Boolean
  var profile: Profile | scala.Null
}

object State {
  @scala.inline
  def apply(color: java.lang.String, isRunning: scala.Boolean, profile: Profile = null): State = {
    val __obj = js.Dynamic.literal(color = color, isRunning = isRunning)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    __obj.asInstanceOf[State]
  }
}

