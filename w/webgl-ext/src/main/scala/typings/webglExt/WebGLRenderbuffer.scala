package typings.webglExt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGLRenderbuffer extends StObject {
  
  val __WebGLRenderbuffer: Unit = js.native
}
object WebGLRenderbuffer {
  
  @scala.inline
  def apply(__WebGLRenderbuffer: Unit): WebGLRenderbuffer = {
    val __obj = js.Dynamic.literal(__WebGLRenderbuffer = __WebGLRenderbuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLRenderbuffer]
  }
  
  @scala.inline
  implicit class WebGLRenderbufferMutableBuilder[Self <: WebGLRenderbuffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set__WebGLRenderbuffer(value: Unit): Self = StObject.set(x, "__WebGLRenderbuffer", value.asInstanceOf[js.Any])
  }
}
