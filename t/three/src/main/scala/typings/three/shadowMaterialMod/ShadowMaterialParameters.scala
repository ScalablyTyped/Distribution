package typings.three.shadowMaterialMod

import typings.three.colorMod.Color
import typings.three.materialMod.MaterialParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShadowMaterialParameters extends MaterialParameters {
  
  var color: js.UndefOr[Color | String | Double] = js.native
}
object ShadowMaterialParameters {
  
  @scala.inline
  def apply(): ShadowMaterialParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShadowMaterialParameters]
  }
  
  @scala.inline
  implicit class ShadowMaterialParametersOps[Self <: ShadowMaterialParameters] (val x: Self) extends AnyVal {
    
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
    def setColor(value: Color | String | Double): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
  }
}
