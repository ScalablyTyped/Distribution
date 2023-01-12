package typings.webglExt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// WebGL 1 Type Branding
trait WebGLObject extends StObject {
  
  val __WebGLObject: Unit
}
object WebGLObject {
  
  inline def apply(__WebGLObject: Unit): WebGLObject = {
    val __obj = js.Dynamic.literal(__WebGLObject = __WebGLObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebGLObject] (val x: Self) extends AnyVal {
    
    inline def set__WebGLObject(value: Unit): Self = StObject.set(x, "__WebGLObject", value.asInstanceOf[js.Any])
  }
}
