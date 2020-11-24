package typings.webglExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OESTextureFloatLinear extends js.Object {
  
  val __OES_texture_float_linear: Unit = js.native
}
object OESTextureFloatLinear {
  
  @scala.inline
  def apply(__OES_texture_float_linear: Unit): OESTextureFloatLinear = {
    val __obj = js.Dynamic.literal(__OES_texture_float_linear = __OES_texture_float_linear.asInstanceOf[js.Any])
    __obj.asInstanceOf[OESTextureFloatLinear]
  }
  
  @scala.inline
  implicit class OESTextureFloatLinearOps[Self <: OESTextureFloatLinear] (val x: Self) extends AnyVal {
    
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
    def set__OES_texture_float_linear(value: Unit): Self = this.set("__OES_texture_float_linear", value.asInstanceOf[js.Any])
  }
}
