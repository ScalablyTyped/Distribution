package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FrameBuffer extends js.Object {
  var frameBuffer: stdLib.ArrayBuffer
  var isLastFrame: scala.Boolean
}

object Anon_FrameBuffer {
  @scala.inline
  def apply(frameBuffer: stdLib.ArrayBuffer, isLastFrame: scala.Boolean): Anon_FrameBuffer = {
    val __obj = js.Dynamic.literal(frameBuffer = frameBuffer, isLastFrame = isLastFrame)
  
    __obj.asInstanceOf[Anon_FrameBuffer]
  }
}

