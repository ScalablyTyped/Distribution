package typings.three.anon

import typings.std.GLenum
import typings.std.WebGLBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BytesPerElement extends js.Object {
  var buffer: WebGLBuffer = js.native
  var bytesPerElement: Double = js.native
  var `type`: GLenum = js.native
  var version: Double = js.native
}

object BytesPerElement {
  @scala.inline
  def apply(buffer: WebGLBuffer, bytesPerElement: Double, `type`: GLenum, version: Double): BytesPerElement = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesPerElement = bytesPerElement.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesPerElement]
  }
  @scala.inline
  implicit class BytesPerElementOps[Self <: BytesPerElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBuffer(value: WebGLBuffer): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setBytesPerElement(value: Double): Self = this.set("bytesPerElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: GLenum): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

