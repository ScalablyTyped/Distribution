package typings.vis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderDashes extends js.Object {
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

object Anon_BorderDashes {
  @scala.inline
  def apply(
    borderDashes: Boolean | js.Array[Double] = null,
    borderRadius: Int | Double = null,
    interpolation: js.UndefOr[Boolean] = js.undefined,
    useBorderWithImage: js.UndefOr[Boolean] = js.undefined,
    useImageSize: js.UndefOr[Boolean] = js.undefined
  ): Anon_BorderDashes = {
    val __obj = js.Dynamic.literal()
    if (borderDashes != null) __obj.updateDynamic("borderDashes")(borderDashes.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (!js.isUndefined(interpolation)) __obj.updateDynamic("interpolation")(interpolation)
    if (!js.isUndefined(useBorderWithImage)) __obj.updateDynamic("useBorderWithImage")(useBorderWithImage)
    if (!js.isUndefined(useImageSize)) __obj.updateDynamic("useImageSize")(useImageSize)
    __obj.asInstanceOf[Anon_BorderDashes]
  }
}

