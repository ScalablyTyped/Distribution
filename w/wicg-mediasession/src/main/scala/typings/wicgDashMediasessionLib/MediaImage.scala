package typings
package wicgDashMediasessionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaImage extends js.Object {
  // Specify the MediaImage object’s sizes. It follows the spec of sizes attribute in HTML link element.
  var sizes: js.UndefOr[java.lang.String] = js.undefined
  // URL from which the user agent can fetch the image’s data.
  var src: java.lang.String
  // A hint as to the media type of the image.
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object MediaImage {
  @scala.inline
  def apply(src: java.lang.String, sizes: java.lang.String = null, `type`: java.lang.String = null): MediaImage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("src")(src)
    if (sizes != null) __obj.updateDynamic("sizes")(sizes)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MediaImage]
  }
}

