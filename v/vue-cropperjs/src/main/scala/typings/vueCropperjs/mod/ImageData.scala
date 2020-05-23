package typings.vueCropperjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageData extends js.Object {
  /**
    * the aspect ratio of the image
    */
  var aspectRatio: Double
  /**
    * the height of the image
    */
  var height: Double
  /**
    * the offset left of the image
    */
  var left: Double
  /**
    * the natural height of the image
    */
  var naturalHeight: Double
  /**
    * the natural width of the image
    */
  var naturalWidth: Double
  /**
    * the rotated degrees of the image if rotated
    */
  var rotate: Double
  /**
    * the scaling factor to apply on the abscissa of the image if scaled
    */
  var scaleX: Double
  /**
    * the scaling factor to apply on the ordinate of the image if scaled
    */
  var scaleY: Double
  /**
    * the offset top of the image
    */
  var top: Double
  /**
    * the width of the image
    */
  var width: Double
}

object ImageData {
  @scala.inline
  def apply(
    aspectRatio: Double,
    height: Double,
    left: Double,
    naturalHeight: Double,
    naturalWidth: Double,
    rotate: Double,
    scaleX: Double,
    scaleY: Double,
    top: Double,
    width: Double
  ): ImageData = {
    val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], naturalHeight = naturalHeight.asInstanceOf[js.Any], naturalWidth = naturalWidth.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageData]
  }
}

