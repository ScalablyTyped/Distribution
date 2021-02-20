package typings.webglExt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGLTexture extends StObject {
  
  val __WebGLTexture: Unit = js.native
}
object WebGLTexture {
  
  @scala.inline
  def apply(__WebGLTexture: Unit): WebGLTexture = {
    val __obj = js.Dynamic.literal(__WebGLTexture = __WebGLTexture.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLTexture]
  }
  
  @scala.inline
  implicit class WebGLTextureMutableBuilder[Self <: WebGLTexture] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set__WebGLTexture(value: Unit): Self = StObject.set(x, "__WebGLTexture", value.asInstanceOf[js.Any])
  }
}
