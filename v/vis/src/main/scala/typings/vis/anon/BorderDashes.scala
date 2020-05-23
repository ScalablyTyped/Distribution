package typings.vis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderDashes extends js.Object {
  var borderDashes: js.UndefOr[Boolean | js.Array[Double]] = js.undefined
   // only for borders
  var borderRadius: js.UndefOr[Double] = js.undefined
       // only for box shape
  var interpolation: js.UndefOr[Boolean] = js.undefined
    // only for image and circularImage shapes
  var useBorderWithImage: js.UndefOr[Boolean] = js.undefined
    // only for image and circularImage shapes
  var useImageSize: js.UndefOr[Boolean] = js.undefined
}

object BorderDashes {
  @scala.inline
  def apply(
    borderDashes: Boolean | js.Array[Double] = null,
    borderRadius: js.UndefOr[Double] = js.undefined,
    interpolation: js.UndefOr[Boolean] = js.undefined,
    useBorderWithImage: js.UndefOr[Boolean] = js.undefined,
    useImageSize: js.UndefOr[Boolean] = js.undefined
  ): BorderDashes = {
    val __obj = js.Dynamic.literal()
    if (borderDashes != null) __obj.updateDynamic("borderDashes")(borderDashes.asInstanceOf[js.Any])
    if (!js.isUndefined(borderRadius)) __obj.updateDynamic("borderRadius")(borderRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(interpolation)) __obj.updateDynamic("interpolation")(interpolation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useBorderWithImage)) __obj.updateDynamic("useBorderWithImage")(useBorderWithImage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useImageSize)) __obj.updateDynamic("useImageSize")(useImageSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderDashes]
  }
}

