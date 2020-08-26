package typings.winrtUwp.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides properties for image information that is displayed by SystemMediaTransportControlsDisplayUpdater class. */
@js.native
trait ImageDisplayProperties extends js.Object {
  /** Gets or sets the subtitle of the image. */
  var subtitle: String = js.native
  /** Gets or sets the title of the image. */
  var title: String = js.native
}

object ImageDisplayProperties {
  @scala.inline
  def apply(subtitle: String, title: String): ImageDisplayProperties = {
    val __obj = js.Dynamic.literal(subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageDisplayProperties]
  }
  @scala.inline
  implicit class ImageDisplayPropertiesOps[Self <: ImageDisplayProperties] (val x: Self) extends AnyVal {
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
    def setSubtitle(value: String): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

