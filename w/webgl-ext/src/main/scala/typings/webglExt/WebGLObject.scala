package typings.webglExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// WebGL 1 Type Branding
trait WebGLObject extends js.Object {
  val __WebGLObject: Unit
}

object WebGLObject {
  @scala.inline
  def apply(__WebGLObject: Unit): WebGLObject = {
    val __obj = js.Dynamic.literal(__WebGLObject = __WebGLObject.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebGLObject]
  }
}

