package typings
package twitchDashExtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var Twitch: Anon_Ext
}

object Window {
  @scala.inline
  def apply(Twitch: Anon_Ext): Window = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Twitch")(Twitch)
    __obj.asInstanceOf[Window]
  }
}

