package typings
package visLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderDashes extends js.Object {
  var borderDashes: js.UndefOr[scala.Boolean | js.Array[scala.Double]] = js.undefined
   // only for borders
  var borderRadius: js.UndefOr[scala.Double] = js.undefined
       // only for box shape
  var interpolation: js.UndefOr[scala.Boolean] = js.undefined
    // only for image and circularImage shapes
  var useBorderWithImage: js.UndefOr[scala.Boolean] = js.undefined
    // only for image and circularImage shapes
  var useImageSize: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_BorderDashes {
  @scala.inline
  def apply(
    borderDashes: scala.Boolean | js.Array[scala.Double] = null,
    borderRadius: scala.Int | scala.Double = null,
    interpolation: js.UndefOr[scala.Boolean] = js.undefined,
    useBorderWithImage: js.UndefOr[scala.Boolean] = js.undefined,
    useImageSize: js.UndefOr[scala.Boolean] = js.undefined
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

