package typings.surveyKnockout.mod

import typings.surveyKnockout.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPropertyDecoratorOptions extends js.Object {
  
  var defaultSource: js.UndefOr[String] = js.native
  
  var defaultValue: js.UndefOr[js.Any] = js.native
  
  var localizable: js.UndefOr[Name | Boolean] = js.native
}
object IPropertyDecoratorOptions {
  
  @scala.inline
  def apply(): IPropertyDecoratorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPropertyDecoratorOptions]
  }
  
  @scala.inline
  implicit class IPropertyDecoratorOptionsOps[Self <: IPropertyDecoratorOptions] (val x: Self) extends AnyVal {
    
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
    def setDefaultSource(value: String): Self = this.set("defaultSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSource: Self = this.set("defaultSource", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setLocalizable(value: Name | Boolean): Self = this.set("localizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalizable: Self = this.set("localizable", js.undefined)
  }
}
