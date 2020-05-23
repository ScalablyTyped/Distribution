package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when either the initial image and/or all of the images in an animation are loaded.
  */
trait ImageViewLoadEvent extends ImageViewBaseEvent {
  /**
    * Set to `image` when the image defined in the [image](Titanium.UI.ImageView.image)
    * property is loaded. Set to `images`, when the series of images defined in the
    * [images](Titanium.UI.ImageView.images) property are loaded.
    */
  var state: String
}

object ImageViewLoadEvent {
  @scala.inline
  def apply(source: ImageView, state: String): ImageViewLoadEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageViewLoadEvent]
  }
}

