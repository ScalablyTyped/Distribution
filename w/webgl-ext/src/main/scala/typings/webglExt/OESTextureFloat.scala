package typings.webglExt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OESTextureFloat extends StObject {
  
  val __OES_texture_float: Unit
}
object OESTextureFloat {
  
  @scala.inline
  def apply(__OES_texture_float: Unit): OESTextureFloat = {
    val __obj = js.Dynamic.literal(__OES_texture_float = __OES_texture_float.asInstanceOf[js.Any])
    __obj.asInstanceOf[OESTextureFloat]
  }
  
  @scala.inline
  implicit class OESTextureFloatMutableBuilder[Self <: OESTextureFloat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set__OES_texture_float(value: Unit): Self = StObject.set(x, "__OES_texture_float", value.asInstanceOf[js.Any])
  }
}
