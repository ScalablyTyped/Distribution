package typings.three

import typings.std.GLenum
import typings.std.WebGLBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBuffer extends js.Object {
  var buffer: WebGLBuffer
  var bytesPerElement: Double
  var `type`: GLenum
  var version: Double
}

object AnonBuffer {
  @scala.inline
  def apply(buffer: WebGLBuffer, bytesPerElement: Double, `type`: GLenum, version: Double): AnonBuffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesPerElement = bytesPerElement.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBuffer]
  }
}

