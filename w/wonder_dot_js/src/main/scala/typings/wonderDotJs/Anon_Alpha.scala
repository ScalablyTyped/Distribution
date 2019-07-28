package typings.wonderDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alpha extends js.Object {
  var alpha: Boolean
  var antialias: Boolean
  var depth: Boolean
  var premultipliedAlpha: Boolean
  var preserveDrawingBuffer: Boolean
  var stencil: Boolean
}

object Anon_Alpha {
  @scala.inline
  def apply(
    alpha: Boolean,
    antialias: Boolean,
    depth: Boolean,
    premultipliedAlpha: Boolean,
    preserveDrawingBuffer: Boolean,
    stencil: Boolean
  ): Anon_Alpha = {
    val __obj = js.Dynamic.literal(alpha = alpha, antialias = antialias, depth = depth, premultipliedAlpha = premultipliedAlpha, preserveDrawingBuffer = preserveDrawingBuffer, stencil = stencil)
  
    __obj.asInstanceOf[Anon_Alpha]
  }
}

