package typings.vueCropperjs.mod

import typings.vueCropperjs.vueCropperjsStrings.high
import typings.vueCropperjs.vueCropperjsStrings.low
import typings.vueCropperjs.vueCropperjsStrings.medium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CroppedCanvasOptions extends js.Object {
  /**
    * a color to fill any alpha values in the output canvas, the default value is transparent.
    */
  var fillColor: js.UndefOr[String] = js.undefined
  /**
    *  the destination height of the output canvas.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * set to change if images are smoothed (true, default) or not (false).
    */
  var imageSmoothingEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * set the quality of image smoothing, one of "low" (default), "medium", or "high".
    */
  var imageSmoothingQuality: js.UndefOr[low | medium | high] = js.undefined
  /**
    * the maximum destination height of the output canvas, the default value is Infinity.
    */
  var maxHeight: js.UndefOr[Double] = js.undefined
  /**
    * the maximum destination width of the output canvas, the default value is Infinity.
    */
  var maxWidth: js.UndefOr[Double] = js.undefined
  /**
    * the minimum destination height of the output canvas, the default value is 0.
    */
  var minHeight: js.UndefOr[Double] = js.undefined
  /**
    * the minimum destination width of the output canvas, the default value is 0.
    */
  var minWidth: js.UndefOr[Double] = js.undefined
  /**
    * the destination width of the output canvas.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object CroppedCanvasOptions {
  @scala.inline
  def apply(
    fillColor: String = null,
    height: js.UndefOr[Double] = js.undefined,
    imageSmoothingEnabled: js.UndefOr[Boolean] = js.undefined,
    imageSmoothingQuality: low | medium | high = null,
    maxHeight: js.UndefOr[Double] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    minHeight: js.UndefOr[Double] = js.undefined,
    minWidth: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): CroppedCanvasOptions = {
    val __obj = js.Dynamic.literal()
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(imageSmoothingEnabled)) __obj.updateDynamic("imageSmoothingEnabled")(imageSmoothingEnabled.get.asInstanceOf[js.Any])
    if (imageSmoothingQuality != null) __obj.updateDynamic("imageSmoothingQuality")(imageSmoothingQuality.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minHeight)) __obj.updateDynamic("minHeight")(minHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CroppedCanvasOptions]
  }
}

