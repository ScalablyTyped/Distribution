package typings.tabris.mod

import typings.tabris.Blob
import typings.tabris.tabrisStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageLikeObject extends _ImageValue {
  var height: js.UndefOr[Double | auto] = js.undefined
  var scale: js.UndefOr[Double | auto] = js.undefined
  var src: String | ImageBitmap | Blob
  var width: js.UndefOr[Double | auto] = js.undefined
}

object ImageLikeObject {
  @scala.inline
  def apply(
    src: String | ImageBitmap | Blob,
    height: Double | auto = null,
    scale: Double | auto = null,
    width: Double | auto = null
  ): ImageLikeObject = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageLikeObject]
  }
}

