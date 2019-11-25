package typings.titanium

import typings.titanium.Titanium.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options passed to <Titanium.Media.previewImage>.
  */
trait PreviewImageOptions extends js.Object {
  /**
  	 * Function called back if the preview fails. Check the `message` property of passed back parameter.
  	 */
  var error: js.UndefOr[js.Function1[/* param0 */ PreviewImageError, _]] = js.undefined
  /**
  	 * The image to preview. Must be a blob based on a file, such as from <Titanium.Filesystem.File.read>.
  	 */
  var image: js.UndefOr[Blob] = js.undefined
  /**
  	 * Function to be called back if the preview succeeds. No info is passed.
  	 */
  var success: js.UndefOr[js.Function1[/* param0 */ js.Any, _]] = js.undefined
}

object PreviewImageOptions {
  @scala.inline
  def apply(
    error: /* param0 */ PreviewImageError => _ = null,
    image: Blob = null,
    success: /* param0 */ js.Any => _ = null
  ): PreviewImageOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[PreviewImageOptions]
  }
}

