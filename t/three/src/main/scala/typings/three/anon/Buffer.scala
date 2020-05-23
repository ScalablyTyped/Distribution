package typings.three.anon

import typings.std.GLenum
import typings.std.WebGLBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buffer extends js.Object {
  var buffer: WebGLBuffer
  var bytesPerElement: Double
  var `type`: GLenum
  var version: Double
}

object Buffer {
  @scala.inline
  def apply(buffer: WebGLBuffer, bytesPerElement: Double, `type`: GLenum, version: Double): Buffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesPerElement = bytesPerElement.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer]
  }
}

