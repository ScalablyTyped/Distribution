package typings
package upngDashJsLib.upngDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageFrame extends js.Object {
  var blend: scala.Double
  var delay: scala.Double
  var dispose: scala.Double
  var rect: ImageFrameRect
}

object ImageFrame {
  @scala.inline
  def apply(blend: scala.Double, delay: scala.Double, dispose: scala.Double, rect: ImageFrameRect): ImageFrame = {
    val __obj = js.Dynamic.literal(blend = blend, delay = delay, dispose = dispose, rect = rect)
  
    __obj.asInstanceOf[ImageFrame]
  }
}

