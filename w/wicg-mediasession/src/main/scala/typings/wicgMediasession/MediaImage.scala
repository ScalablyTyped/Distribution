package typings.wicgMediasession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaImage extends js.Object {
  // Specify the MediaImage object’s sizes. It follows the spec of sizes attribute in HTML link element.
  var sizes: js.UndefOr[String] = js.undefined
  // URL from which the user agent can fetch the image’s data.
  var src: String
  // A hint as to the media type of the image.
  var `type`: js.UndefOr[String] = js.undefined
}

object MediaImage {
  @scala.inline
  def apply(src: String, sizes: String = null, `type`: String = null): MediaImage = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaImage]
  }
}

