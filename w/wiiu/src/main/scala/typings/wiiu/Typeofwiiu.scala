package typings.wiiu

import typings.wiiu.wiiu.ImageView_
import typings.wiiu.wiiu.VideoPlayer_
import typings.wiiu.wiiu.WiiuGamePad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofwiiu extends js.Object {
  var gamepad: WiiuGamePad
  var imageview: ImageView_
  var videoplayer: VideoPlayer_
}

object Typeofwiiu {
  @scala.inline
  def apply(gamepad: WiiuGamePad, imageview: ImageView_, videoplayer: VideoPlayer_): Typeofwiiu = {
    val __obj = js.Dynamic.literal(gamepad = gamepad.asInstanceOf[js.Any], imageview = imageview.asInstanceOf[js.Any], videoplayer = videoplayer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Typeofwiiu]
  }
}

