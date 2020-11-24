package typings.underscore.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * underscore.js template settings, set templateSettings or pass as an argument
  * to 'template()' to override defaults.
  **/
@js.native
trait TemplateSettings extends js.Object {
  
  /**
    * Default value is '/<%-([\s\S]+?)%>/g'.
    **/
  var escape: js.UndefOr[RegExp] = js.native
  
  /**
    * Default value is '/<%([\s\S]+?)%>/g'.
    **/
  var evaluate: js.UndefOr[RegExp] = js.native
  
  /**
    * Default value is '/<%=([\s\S]+?)%>/g'.
    **/
  var interpolate: js.UndefOr[RegExp] = js.native
  
  /**
    * By default, 'template()' places the values from your data in the local scope via the 'with' statement.
    * However, you can specify a single variable name with this setting.
    **/
  var variable: js.UndefOr[String] = js.native
}
object TemplateSettings {
  
  @scala.inline
  def apply(): TemplateSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateSettings]
  }
  
  @scala.inline
  implicit class TemplateSettingsOps[Self <: TemplateSettings] (val x: Self) extends AnyVal {
    
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
    def setEscape(value: RegExp): Self = this.set("escape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscape: Self = this.set("escape", js.undefined)
    
    @scala.inline
    def setEvaluate(value: RegExp): Self = this.set("evaluate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvaluate: Self = this.set("evaluate", js.undefined)
    
    @scala.inline
    def setInterpolate(value: RegExp): Self = this.set("interpolate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterpolate: Self = this.set("interpolate", js.undefined)
    
    @scala.inline
    def setVariable(value: String): Self = this.set("variable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariable: Self = this.set("variable", js.undefined)
  }
}
