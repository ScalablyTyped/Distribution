package typings.webglExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EXTShaderTextureLod extends js.Object {
  
  val __EXT_shader_texture_lod: Unit = js.native
}
object EXTShaderTextureLod {
  
  @scala.inline
  def apply(__EXT_shader_texture_lod: Unit): EXTShaderTextureLod = {
    val __obj = js.Dynamic.literal(__EXT_shader_texture_lod = __EXT_shader_texture_lod.asInstanceOf[js.Any])
    __obj.asInstanceOf[EXTShaderTextureLod]
  }
  
  @scala.inline
  implicit class EXTShaderTextureLodOps[Self <: EXTShaderTextureLod] (val x: Self) extends AnyVal {
    
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
    def set__EXT_shader_texture_lod(value: Unit): Self = this.set("__EXT_shader_texture_lod", value.asInstanceOf[js.Any])
  }
}
