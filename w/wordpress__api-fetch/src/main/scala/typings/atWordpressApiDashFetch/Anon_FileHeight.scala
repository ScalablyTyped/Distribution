package typings.atWordpressApiDashFetch

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FileHeight extends js.Object {
  var file: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var image_meta: js.UndefOr[Anon_Aperture] = js.undefined
  var sizes: Record[String, Anon_File]
  var width: js.UndefOr[Double] = js.undefined
}

object Anon_FileHeight {
  @scala.inline
  def apply(
    sizes: Record[String, Anon_File],
    file: String = null,
    height: Int | Double = null,
    image_meta: Anon_Aperture = null,
    width: Int | Double = null
  ): Anon_FileHeight = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (image_meta != null) __obj.updateDynamic("image_meta")(image_meta.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FileHeight]
  }
}

