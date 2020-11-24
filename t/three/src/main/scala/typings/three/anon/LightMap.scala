package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LightMap extends js.Object {
  
  var lightMap: IUniform = js.native
  
  var lightMapIntensity: IUniform = js.native
}
object LightMap {
  
  @scala.inline
  def apply(lightMap: IUniform, lightMapIntensity: IUniform): LightMap = {
    val __obj = js.Dynamic.literal(lightMap = lightMap.asInstanceOf[js.Any], lightMapIntensity = lightMapIntensity.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightMap]
  }
  
  @scala.inline
  implicit class LightMapOps[Self <: LightMap] (val x: Self) extends AnyVal {
    
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
    def setLightMap(value: IUniform): Self = this.set("lightMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightMapIntensity(value: IUniform): Self = this.set("lightMapIntensity", value.asInstanceOf[js.Any])
  }
}
