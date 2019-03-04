package typings
package wonderDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alpha extends js.Object {
  var alpha: scala.Boolean
  var antialias: scala.Boolean
  var depth: scala.Boolean
  var premultipliedAlpha: scala.Boolean
  var preserveDrawingBuffer: scala.Boolean
  var stencil: scala.Boolean
}

object Anon_Alpha {
  @scala.inline
  def apply(
    alpha: scala.Boolean,
    antialias: scala.Boolean,
    depth: scala.Boolean,
    premultipliedAlpha: scala.Boolean,
    preserveDrawingBuffer: scala.Boolean,
    stencil: scala.Boolean
  ): Anon_Alpha = {
    val __obj = js.Dynamic.literal(alpha = alpha, antialias = antialias, depth = depth, premultipliedAlpha = premultipliedAlpha, preserveDrawingBuffer = preserveDrawingBuffer, stencil = stencil)
  
    __obj.asInstanceOf[Anon_Alpha]
  }
}

