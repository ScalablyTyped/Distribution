package typings.upngJs.mod

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
    val __obj = js.Dynamic.literal(blend = blend.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], dispose = dispose.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ImageFrame]
  }
}

