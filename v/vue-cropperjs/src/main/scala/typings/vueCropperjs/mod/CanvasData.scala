package typings.vueCropperjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasData extends js.Object {
  /**
    * the height of the canvas
    */
  var height: Double
  /**
    * the offset left of the canvas
    */
  var left: Double
  /**
    * the natural height of the canvas (read only)
    */
  var naturalHeight: Double
  /**
    * the natural width of the canvas (read only)
    */
  var naturalWidth: Double
  /**
    * the offset top of the canvas
    */
  var top: Double
  /**
    * the width of the canvas
    */
  var width: Double
}

object CanvasData {
  @scala.inline
  def apply(
    height: Double,
    left: Double,
    naturalHeight: Double,
    naturalWidth: Double,
    top: Double,
    width: Double
  ): CanvasData = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], naturalHeight = naturalHeight.asInstanceOf[js.Any], naturalWidth = naturalWidth.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasData]
  }
}

