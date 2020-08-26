package typings.vueCropperjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CropperData extends js.Object {
  /**
    * the height of the cropped area
    */
  var height: Double = js.native
  /**
    * the rotated degrees of the image
    */
  var rotate: Double = js.native
  /**
    * the scaling factor to apply on the abscissa of the image
    */
  var scaleX: Double = js.native
  /**
    * the scaling factor to apply on the ordinate of the image
    */
  var scaleY: Double = js.native
  /**
    * the width of the cropped area
    */
  var width: Double = js.native
  /**
    * the offset left of the cropped area
    */
  var x: Double = js.native
  /**
    * the offset top of the cropped area
    */
  var y: Double = js.native
}

object CropperData {
  @scala.inline
  def apply(
    height: Double,
    rotate: Double,
    scaleX: Double,
    scaleY: Double,
    width: Double,
    x: Double,
    y: Double
  ): CropperData = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CropperData]
  }
  @scala.inline
  implicit class CropperDataOps[Self <: CropperData] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotate(value: Double): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def setScaleX(value: Double): Self = this.set("scaleX", value.asInstanceOf[js.Any])
    @scala.inline
    def setScaleY(value: Double): Self = this.set("scaleY", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

