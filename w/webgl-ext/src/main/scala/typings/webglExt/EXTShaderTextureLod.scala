package typings.webglExt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EXTShaderTextureLod extends StObject {
  
  val __EXT_shader_texture_lod: Unit = js.native
}
object EXTShaderTextureLod {
  
  @scala.inline
  def apply(__EXT_shader_texture_lod: Unit): EXTShaderTextureLod = {
    val __obj = js.Dynamic.literal(__EXT_shader_texture_lod = __EXT_shader_texture_lod.asInstanceOf[js.Any])
    __obj.asInstanceOf[EXTShaderTextureLod]
  }
  
  @scala.inline
  implicit class EXTShaderTextureLodMutableBuilder[Self <: EXTShaderTextureLod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set__EXT_shader_texture_lod(value: Unit): Self = StObject.set(x, "__EXT_shader_texture_lod", value.asInstanceOf[js.Any])
  }
}
