package typings
package wiiuLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Gamepad extends js.Object {
  var gamepad: wiiuLib.wiiuNs.WiiuGamePad
  var imageview: wiiuLib.wiiuNs.ImageView
  var videoplayer: wiiuLib.wiiuNs.VideoPlayer
}

object Anon_Gamepad {
  @scala.inline
  def apply(
    gamepad: wiiuLib.wiiuNs.WiiuGamePad,
    imageview: wiiuLib.wiiuNs.ImageView,
    videoplayer: wiiuLib.wiiuNs.VideoPlayer
  ): Anon_Gamepad = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("gamepad")(gamepad)
    __obj.updateDynamic("imageview")(imageview)
    __obj.updateDynamic("videoplayer")(videoplayer)
    __obj.asInstanceOf[Anon_Gamepad]
  }
}

