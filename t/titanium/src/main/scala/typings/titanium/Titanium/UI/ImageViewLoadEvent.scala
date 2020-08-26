package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when either the initial image and/or all of the images in an animation are loaded.
  */
@js.native
trait ImageViewLoadEvent extends ImageViewBaseEvent {
  /**
    * Set to `image` when the image defined in the [image](Titanium.UI.ImageView.image)
    * property is loaded. Set to `images`, when the series of images defined in the
    * [images](Titanium.UI.ImageView.images) property are loaded.
    */
  var state: String = js.native
}

object ImageViewLoadEvent {
  @scala.inline
  def apply(source: ImageView, state: String): ImageViewLoadEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageViewLoadEvent]
  }
  @scala.inline
  implicit class ImageViewLoadEventOps[Self <: ImageViewLoadEvent] (val x: Self) extends AnyVal {
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
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

