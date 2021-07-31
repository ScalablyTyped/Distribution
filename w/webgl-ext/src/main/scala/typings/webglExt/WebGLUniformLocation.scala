package typings.webglExt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGLUniformLocation extends StObject {
  
  val __WebGLUniformLocation: Unit
}
object WebGLUniformLocation {
  
  @scala.inline
  def apply(__WebGLUniformLocation: Unit): WebGLUniformLocation = {
    val __obj = js.Dynamic.literal(__WebGLUniformLocation = __WebGLUniformLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLUniformLocation]
  }
  
  @scala.inline
  implicit class WebGLUniformLocationMutableBuilder[Self <: WebGLUniformLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set__WebGLUniformLocation(value: Unit): Self = StObject.set(x, "__WebGLUniformLocation", value.asInstanceOf[js.Any])
  }
}
