package typings.wordpressApiFetch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Aperture extends js.Object {
  var aperture: String = js.native
  var camera: String = js.native
  var caption: String = js.native
  var copyright: String = js.native
  var created_timestamp: String = js.native
  var credit: String = js.native
  var focal_length: String = js.native
  var iso: String = js.native
  var keywords: js.Array[String] = js.native
  var orientation: String = js.native
  var shutter_speed: String = js.native
  var title: String = js.native
}

object Aperture {
  @scala.inline
  def apply(
    aperture: String,
    camera: String,
    caption: String,
    copyright: String,
    created_timestamp: String,
    credit: String,
    focal_length: String,
    iso: String,
    keywords: js.Array[String],
    orientation: String,
    shutter_speed: String,
    title: String
  ): Aperture = {
    val __obj = js.Dynamic.literal(aperture = aperture.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], copyright = copyright.asInstanceOf[js.Any], created_timestamp = created_timestamp.asInstanceOf[js.Any], credit = credit.asInstanceOf[js.Any], focal_length = focal_length.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], shutter_speed = shutter_speed.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aperture]
  }
  @scala.inline
  implicit class ApertureOps[Self <: Aperture] (val x: Self) extends AnyVal {
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
    def setAperture(value: String): Self = this.set("aperture", value.asInstanceOf[js.Any])
    @scala.inline
    def setCamera(value: String): Self = this.set("camera", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def setCopyright(value: String): Self = this.set("copyright", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated_timestamp(value: String): Self = this.set("created_timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setCredit(value: String): Self = this.set("credit", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocal_length(value: String): Self = this.set("focal_length", value.asInstanceOf[js.Any])
    @scala.inline
    def setIso(value: String): Self = this.set("iso", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeywordsVarargs(value: String*): Self = this.set("keywords", js.Array(value :_*))
    @scala.inline
    def setKeywords(value: js.Array[String]): Self = this.set("keywords", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def setShutter_speed(value: String): Self = this.set("shutter_speed", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

