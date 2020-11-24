package typings.vkOpenapi.vk.OpenAPI.Widgets

import typings.vkOpenapi.vk.OpenAPI.NumericBoolean
import typings.vkOpenapi.vkOpenapiNumbers.`1`
import typings.vkOpenapi.vkOpenapiNumbers.`3`
import typings.vkOpenapi.vkOpenapiNumbers.`4`
import typings.vkOpenapi.vkOpenapiStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupOptions extends js.Object {
  
  var color1: js.UndefOr[String] = js.native
  
  var color2: js.UndefOr[String] = js.native
  
  var color3: js.UndefOr[String] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var mode: js.UndefOr[`1` | `3` | `4`] = js.native
  
  var no_cover: js.UndefOr[NumericBoolean] = js.native
  
  var wide: js.UndefOr[NumericBoolean] = js.native
  
  var width: js.UndefOr[Double | auto] = js.native
}
object GroupOptions {
  
  @scala.inline
  def apply(): GroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupOptions]
  }
  
  @scala.inline
  implicit class GroupOptionsOps[Self <: GroupOptions] (val x: Self) extends AnyVal {
    
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
    def setColor1(value: String): Self = this.set("color1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor1: Self = this.set("color1", js.undefined)
    
    @scala.inline
    def setColor2(value: String): Self = this.set("color2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor2: Self = this.set("color2", js.undefined)
    
    @scala.inline
    def setColor3(value: String): Self = this.set("color3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor3: Self = this.set("color3", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setMode(value: `1` | `3` | `4`): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setNo_cover(value: NumericBoolean): Self = this.set("no_cover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNo_cover: Self = this.set("no_cover", js.undefined)
    
    @scala.inline
    def setWide(value: NumericBoolean): Self = this.set("wide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWide: Self = this.set("wide", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | auto): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
