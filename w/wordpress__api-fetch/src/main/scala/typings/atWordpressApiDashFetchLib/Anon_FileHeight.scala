package typings
package atWordpressApiDashFetchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FileHeight extends js.Object {
  var file: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var image_meta: js.UndefOr[Anon_Aperture] = js.undefined
  var sizes: stdLib.Record[java.lang.String, Anon_File]
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_FileHeight {
  @scala.inline
  def apply(
    sizes: stdLib.Record[java.lang.String, Anon_File],
    file: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    image_meta: Anon_Aperture = null,
    width: scala.Int | scala.Double = null
  ): Anon_FileHeight = {
    val __obj = js.Dynamic.literal(sizes = sizes)
    if (file != null) __obj.updateDynamic("file")(file)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (image_meta != null) __obj.updateDynamic("image_meta")(image_meta)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FileHeight]
  }
}

