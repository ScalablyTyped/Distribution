package typings.uifabricMergeStyles.getVendorSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVendorSettings extends js.Object {
  
  var isMoz: js.UndefOr[Boolean] = js.native
  
  var isMs: js.UndefOr[Boolean] = js.native
  
  var isOpera: js.UndefOr[Boolean] = js.native
  
  var isWebkit: js.UndefOr[Boolean] = js.native
}
object IVendorSettings {
  
  @scala.inline
  def apply(): IVendorSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IVendorSettings]
  }
  
  @scala.inline
  implicit class IVendorSettingsOps[Self <: IVendorSettings] (val x: Self) extends AnyVal {
    
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
    def setIsMoz(value: Boolean): Self = this.set("isMoz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMoz: Self = this.set("isMoz", js.undefined)
    
    @scala.inline
    def setIsMs(value: Boolean): Self = this.set("isMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMs: Self = this.set("isMs", js.undefined)
    
    @scala.inline
    def setIsOpera(value: Boolean): Self = this.set("isOpera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOpera: Self = this.set("isOpera", js.undefined)
    
    @scala.inline
    def setIsWebkit(value: Boolean): Self = this.set("isWebkit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsWebkit: Self = this.set("isWebkit", js.undefined)
  }
}
