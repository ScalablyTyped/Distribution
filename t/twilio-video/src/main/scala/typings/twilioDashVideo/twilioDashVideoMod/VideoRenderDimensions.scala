package typings.twilioDashVideo.twilioDashVideoMod

import typings.twilioDashVideo.twilioDashVideoMod.VideoTrack.Dimensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoRenderDimensions extends js.Object {
  var high: js.UndefOr[Dimensions] = js.undefined
  var low: js.UndefOr[Dimensions] = js.undefined
  var standard: js.UndefOr[Dimensions] = js.undefined
}

object VideoRenderDimensions {
  @scala.inline
  def apply(high: Dimensions = null, low: Dimensions = null, standard: Dimensions = null): VideoRenderDimensions = {
    val __obj = js.Dynamic.literal()
    if (high != null) __obj.updateDynamic("high")(high)
    if (low != null) __obj.updateDynamic("low")(low)
    if (standard != null) __obj.updateDynamic("standard")(standard)
    __obj.asInstanceOf[VideoRenderDimensions]
  }
}

