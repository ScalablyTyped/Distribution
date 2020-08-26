package typings.winjs.WinJS.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The types of timeline markers supported by the MediaPlayer.
  **/
@js.native
trait MarkerType extends js.Object {
  var advertisement: String = js.native
  var chapter: String = js.native
  var custom: String = js.native
}

object MarkerType {
  @scala.inline
  def apply(advertisement: String, chapter: String, custom: String): MarkerType = {
    val __obj = js.Dynamic.literal(advertisement = advertisement.asInstanceOf[js.Any], chapter = chapter.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerType]
  }
  @scala.inline
  implicit class MarkerTypeOps[Self <: MarkerType] (val x: Self) extends AnyVal {
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
    def setAdvertisement(value: String): Self = this.set("advertisement", value.asInstanceOf[js.Any])
    @scala.inline
    def setChapter(value: String): Self = this.set("chapter", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustom(value: String): Self = this.set("custom", value.asInstanceOf[js.Any])
  }
  
}

