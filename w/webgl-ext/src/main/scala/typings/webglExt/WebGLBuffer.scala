package typings.webglExt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGLBuffer extends StObject {
  
  val __WebGLBuffer: Unit
}
object WebGLBuffer {
  
  @scala.inline
  def apply(__WebGLBuffer: Unit): WebGLBuffer = {
    val __obj = js.Dynamic.literal(__WebGLBuffer = __WebGLBuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLBuffer]
  }
  
  @scala.inline
  implicit class WebGLBufferMutableBuilder[Self <: WebGLBuffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set__WebGLBuffer(value: Unit): Self = StObject.set(x, "__WebGLBuffer", value.asInstanceOf[js.Any])
  }
}
