package typings.wonderJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlpha extends js.Object {
  var alpha: Boolean
  var antialias: Boolean
  var depth: Boolean
  var premultipliedAlpha: Boolean
  var preserveDrawingBuffer: Boolean
  var stencil: Boolean
}

object AnonAlpha {
  @scala.inline
  def apply(
    alpha: Boolean,
    antialias: Boolean,
    depth: Boolean,
    premultipliedAlpha: Boolean,
    preserveDrawingBuffer: Boolean,
    stencil: Boolean
  ): AnonAlpha = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], antialias = antialias.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], premultipliedAlpha = premultipliedAlpha.asInstanceOf[js.Any], preserveDrawingBuffer = preserveDrawingBuffer.asInstanceOf[js.Any], stencil = stencil.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAlpha]
  }
}

