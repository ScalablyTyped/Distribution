package typings.wiiu.anon

import typings.wiiu.wiiu.ImageView
import typings.wiiu.wiiu.VideoPlayer
import typings.wiiu.wiiu.WiiuGamePad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofwiiu extends js.Object {
  var gamepad: WiiuGamePad = js.native
  var imageview: ImageView = js.native
  var videoplayer: VideoPlayer = js.native
}

object Typeofwiiu {
  @scala.inline
  def apply(gamepad: WiiuGamePad, imageview: ImageView, videoplayer: VideoPlayer): Typeofwiiu = {
    val __obj = js.Dynamic.literal(gamepad = gamepad.asInstanceOf[js.Any], imageview = imageview.asInstanceOf[js.Any], videoplayer = videoplayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofwiiu]
  }
  @scala.inline
  implicit class TypeofwiiuOps[Self <: Typeofwiiu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGamepad(value: WiiuGamePad): Self = this.set("gamepad", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageview(value: ImageView): Self = this.set("imageview", value.asInstanceOf[js.Any])
    @scala.inline
    def setVideoplayer(value: VideoPlayer): Self = this.set("videoplayer", value.asInstanceOf[js.Any])
  }
  
}

