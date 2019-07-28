package typings.wiiu

import typings.wiiu.wiiuNs.ImageView
import typings.wiiu.wiiuNs.VideoPlayer
import typings.wiiu.wiiuNs.WiiuGamePad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofwiiu extends js.Object {
  var gamepad: WiiuGamePad
  var imageview: ImageView
  var videoplayer: VideoPlayer
}

object Typeofwiiu {
  @scala.inline
  def apply(gamepad: WiiuGamePad, imageview: ImageView, videoplayer: VideoPlayer): Typeofwiiu = {
    val __obj = js.Dynamic.literal(gamepad = gamepad, imageview = imageview, videoplayer = videoplayer)
  
    __obj.asInstanceOf[Typeofwiiu]
  }
}

