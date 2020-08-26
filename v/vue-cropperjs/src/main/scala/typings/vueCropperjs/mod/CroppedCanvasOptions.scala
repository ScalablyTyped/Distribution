package typings.vueCropperjs.mod

import typings.vueCropperjs.vueCropperjsStrings.high
import typings.vueCropperjs.vueCropperjsStrings.low
import typings.vueCropperjs.vueCropperjsStrings.medium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CroppedCanvasOptions extends js.Object {
  /**
    * a color to fill any alpha values in the output canvas, the default value is transparent.
    */
  var fillColor: js.UndefOr[String] = js.native
  /**
    *  the destination height of the output canvas.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * set to change if images are smoothed (true, default) or not (false).
    */
  var imageSmoothingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * set the quality of image smoothing, one of "low" (default), "medium", or "high".
    */
  var imageSmoothingQuality: js.UndefOr[low | medium | high] = js.native
  /**
    * the maximum destination height of the output canvas, the default value is Infinity.
    */
  var maxHeight: js.UndefOr[Double] = js.native
  /**
    * the maximum destination width of the output canvas, the default value is Infinity.
    */
  var maxWidth: js.UndefOr[Double] = js.native
  /**
    * the minimum destination height of the output canvas, the default value is 0.
    */
  var minHeight: js.UndefOr[Double] = js.native
  /**
    * the minimum destination width of the output canvas, the default value is 0.
    */
  var minWidth: js.UndefOr[Double] = js.native
  /**
    * the destination width of the output canvas.
    */
  var width: js.UndefOr[Double] = js.native
}

object CroppedCanvasOptions {
  @scala.inline
  def apply(): CroppedCanvasOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CroppedCanvasOptions]
  }
  @scala.inline
  implicit class CroppedCanvasOptionsOps[Self <: CroppedCanvasOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setImageSmoothingEnabled(value: Boolean): Self = this.set("imageSmoothingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageSmoothingEnabled: Self = this.set("imageSmoothingEnabled", js.undefined)
    @scala.inline
    def setImageSmoothingQuality(value: low | medium | high): Self = this.set("imageSmoothingQuality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageSmoothingQuality: Self = this.set("imageSmoothingQuality", js.undefined)
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

