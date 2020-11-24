package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FogColor extends js.Object {
  
  var fogColor: IUniform = js.native
  
  var fogDensity: IUniform = js.native
  
  var fogFar: IUniform = js.native
  
  var fogNear: IUniform = js.native
}
object FogColor {
  
  @scala.inline
  def apply(fogColor: IUniform, fogDensity: IUniform, fogFar: IUniform, fogNear: IUniform): FogColor = {
    val __obj = js.Dynamic.literal(fogColor = fogColor.asInstanceOf[js.Any], fogDensity = fogDensity.asInstanceOf[js.Any], fogFar = fogFar.asInstanceOf[js.Any], fogNear = fogNear.asInstanceOf[js.Any])
    __obj.asInstanceOf[FogColor]
  }
  
  @scala.inline
  implicit class FogColorOps[Self <: FogColor] (val x: Self) extends AnyVal {
    
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
    def setFogColor(value: IUniform): Self = this.set("fogColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFogDensity(value: IUniform): Self = this.set("fogDensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFogFar(value: IUniform): Self = this.set("fogFar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFogNear(value: IUniform): Self = this.set("fogNear", value.asInstanceOf[js.Any])
  }
}
