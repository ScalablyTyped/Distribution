package typings.titanium

import typings.titanium.Titanium.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The parameter passed to the <Titanium.Media.takeScreenshot> callback.
  */
trait ScreenshotResult extends js.Object {
  /**
    * The screenshot image.
    */
  var media: js.UndefOr[Blob] = js.undefined
}

object ScreenshotResult {
  @scala.inline
  def apply(media: Blob = null): ScreenshotResult = {
    val __obj = js.Dynamic.literal()
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenshotResult]
  }
}

