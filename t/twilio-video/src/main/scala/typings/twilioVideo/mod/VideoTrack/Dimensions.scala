package typings.twilioVideo.mod.VideoTrack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dimensions extends js.Object {
  var height: Double | Null
  var width: Double | Null
}

object Dimensions {
  @scala.inline
  def apply(height: Int | Double = null, width: Int | Double = null): Dimensions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dimensions]
  }
}

