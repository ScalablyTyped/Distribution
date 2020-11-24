package typings.uifabricFoundation.themeProviderMod

import typings.fluentuiTheme.ischemeMod.ISchemeNames
import typings.fluentuiTheme.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IThemeProviderProps extends js.Object {
  
  var scheme: js.UndefOr[ISchemeNames] = js.native
  
  var theme: js.UndefOr[ITheme] = js.native
}
object IThemeProviderProps {
  
  @scala.inline
  def apply(): IThemeProviderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IThemeProviderProps]
  }
  
  @scala.inline
  implicit class IThemeProviderPropsOps[Self <: IThemeProviderProps] (val x: Self) extends AnyVal {
    
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
    def setScheme(value: ISchemeNames): Self = this.set("scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheme: Self = this.set("scheme", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
