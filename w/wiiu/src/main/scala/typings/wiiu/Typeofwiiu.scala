package typings.wiiu

import typings.wiiu.wiiu.ImageView
import typings.wiiu.wiiu.VideoPlayer
import typings.wiiu.wiiu.WiiuGamePad
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

