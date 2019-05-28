package typings
package wiiuLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofwiiu extends js.Object {
  var gamepad: wiiuLib.wiiuNs.WiiuGamePad
  var imageview: wiiuLib.wiiuNs.ImageView
  var videoplayer: wiiuLib.wiiuNs.VideoPlayer
}

object Typeofwiiu {
  @scala.inline
  def apply(
    gamepad: wiiuLib.wiiuNs.WiiuGamePad,
    imageview: wiiuLib.wiiuNs.ImageView,
    videoplayer: wiiuLib.wiiuNs.VideoPlayer
  ): Typeofwiiu = {
    val __obj = js.Dynamic.literal(gamepad = gamepad, imageview = imageview, videoplayer = videoplayer)
  
    __obj.asInstanceOf[Typeofwiiu]
  }
}

