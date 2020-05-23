package typings.wordpressApiFetch.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Height extends js.Object {
  var file: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var image_meta: js.UndefOr[Aperture] = js.undefined
  var sizes: Record[String, File]
  var width: js.UndefOr[Double] = js.undefined
}

object Height {
  @scala.inline
  def apply(
    sizes: Record[String, File],
    file: String = null,
    height: js.UndefOr[Double] = js.undefined,
    image_meta: Aperture = null,
    width: js.UndefOr[Double] = js.undefined
  ): Height = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (image_meta != null) __obj.updateDynamic("image_meta")(image_meta.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
}

