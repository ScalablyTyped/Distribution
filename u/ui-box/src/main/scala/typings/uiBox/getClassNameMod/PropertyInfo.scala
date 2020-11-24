package typings.uiBox.getClassNameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyInfo extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var complexValue: js.UndefOr[Boolean] = js.native
  
  var cssName: js.UndefOr[String] = js.native
  
  var defaultUnit: js.UndefOr[String] = js.native
  
  var isPrefixed: js.UndefOr[Boolean] = js.native
  
  var jsName: js.UndefOr[String] = js.native
  
  var safeValue: js.UndefOr[Boolean] = js.native
}
object PropertyInfo {
  
  @scala.inline
  def apply(): PropertyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyInfo]
  }
  
  @scala.inline
  implicit class PropertyInfoOps[Self <: PropertyInfo] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setComplexValue(value: Boolean): Self = this.set("complexValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplexValue: Self = this.set("complexValue", js.undefined)
    
    @scala.inline
    def setCssName(value: String): Self = this.set("cssName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssName: Self = this.set("cssName", js.undefined)
    
    @scala.inline
    def setDefaultUnit(value: String): Self = this.set("defaultUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultUnit: Self = this.set("defaultUnit", js.undefined)
    
    @scala.inline
    def setIsPrefixed(value: Boolean): Self = this.set("isPrefixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPrefixed: Self = this.set("isPrefixed", js.undefined)
    
    @scala.inline
    def setJsName(value: String): Self = this.set("jsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsName: Self = this.set("jsName", js.undefined)
    
    @scala.inline
    def setSafeValue(value: Boolean): Self = this.set("safeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSafeValue: Self = this.set("safeValue", js.undefined)
  }
}
