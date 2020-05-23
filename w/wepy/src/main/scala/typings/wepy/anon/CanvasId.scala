package typings.wepy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasId extends js.Object {
  var canvasId: String
  var height: Double
  var width: Double
  var x: Double
  var y: Double
}

object CanvasId {
  @scala.inline
  def apply(canvasId: String, height: Double, width: Double, x: Double, y: Double): CanvasId = {
    val __obj = js.Dynamic.literal(canvasId = canvasId.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasId]
  }
}

