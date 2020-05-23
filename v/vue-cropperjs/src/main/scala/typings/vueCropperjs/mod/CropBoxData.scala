package typings.vueCropperjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CropBoxData extends js.Object {
  /**
    * the height of the crop box
    */
  var height: Double
  /**
    * the offset left of the crop box
    */
  var left: Double
  /**
    * the offset top of the crop box
    */
  var top: Double
  /**
    * the width of the crop box
    */
  var width: Double
}

object CropBoxData {
  @scala.inline
  def apply(height: Double, left: Double, top: Double, width: Double): CropBoxData = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CropBoxData]
  }
}

