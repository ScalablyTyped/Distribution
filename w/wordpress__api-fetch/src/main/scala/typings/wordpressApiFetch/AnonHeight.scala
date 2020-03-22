package typings.wordpressApiFetch

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeight extends js.Object {
  var file: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var image_meta: js.UndefOr[AnonAperture] = js.undefined
  var sizes: Record[String, AnonFile]
  var width: js.UndefOr[Double] = js.undefined
}

object AnonHeight {
  @scala.inline
  def apply(
    sizes: Record[String, AnonFile],
    file: String = null,
    height: Int | Double = null,
    image_meta: AnonAperture = null,
    width: Int | Double = null
  ): AnonHeight = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (image_meta != null) __obj.updateDynamic("image_meta")(image_meta.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeight]
  }
}

