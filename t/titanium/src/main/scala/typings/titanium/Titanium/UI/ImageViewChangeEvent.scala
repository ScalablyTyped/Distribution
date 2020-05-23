package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired for each frame change during an animation.
  */
trait ImageViewChangeEvent extends ImageViewBaseEvent {
  /**
    * Index of the image frame being displayed.
    */
  var index: Double
}

object ImageViewChangeEvent {
  @scala.inline
  def apply(index: Double, source: ImageView): ImageViewChangeEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageViewChangeEvent]
  }
}

