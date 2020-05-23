package typings.wepy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DestHeight extends js.Object {
  var canvasId: String
  var destHeight: Double
  var destWidth: Double
  var height: Double
  var width: Double
  var x: Double
  var y: Double
}

object DestHeight {
  @scala.inline
  def apply(
    canvasId: String,
    destHeight: Double,
    destWidth: Double,
    height: Double,
    width: Double,
    x: Double,
    y: Double
  ): DestHeight = {
    val __obj = js.Dynamic.literal(canvasId = canvasId.asInstanceOf[js.Any], destHeight = destHeight.asInstanceOf[js.Any], destWidth = destWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestHeight]
  }
}

