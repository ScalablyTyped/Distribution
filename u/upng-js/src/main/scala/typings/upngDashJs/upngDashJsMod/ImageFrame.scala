package typings.upngDashJs.upngDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageFrame extends js.Object {
  var blend: Double
  var delay: Double
  var dispose: Double
  var rect: ImageFrameRect
}

object ImageFrame {
  @scala.inline
  def apply(blend: Double, delay: Double, dispose: Double, rect: ImageFrameRect): ImageFrame = {
    val __obj = js.Dynamic.literal(blend = blend, delay = delay, dispose = dispose, rect = rect)
  
    __obj.asInstanceOf[ImageFrame]
  }
}

