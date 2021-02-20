package typings.webglExt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// WebGL 1 Type Branding
@js.native
trait WebGLObject extends StObject {
  
  val __WebGLObject: Unit = js.native
}
object WebGLObject {
  
  @scala.inline
  def apply(__WebGLObject: Unit): WebGLObject = {
    val __obj = js.Dynamic.literal(__WebGLObject = __WebGLObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLObject]
  }
  
  @scala.inline
  implicit class WebGLObjectMutableBuilder[Self <: WebGLObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set__WebGLObject(value: Unit): Self = StObject.set(x, "__WebGLObject", value.asInstanceOf[js.Any])
  }
}
