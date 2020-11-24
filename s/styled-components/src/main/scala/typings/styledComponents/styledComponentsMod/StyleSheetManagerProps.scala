package typings.styledComponents.styledComponentsMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleSheetManagerProps extends js.Object {
  
  var disableCSSOMInjection: js.UndefOr[Boolean] = js.native
  
  var disableVendorPrefixes: js.UndefOr[Boolean] = js.native
  
  var sheet: js.UndefOr[ServerStyleSheet] = js.native
  
  var stylisPlugins: js.UndefOr[js.Array[StylisPlugin]] = js.native
  
  var target: js.UndefOr[HTMLElement] = js.native
}
object StyleSheetManagerProps {
  
  @scala.inline
  def apply(): StyleSheetManagerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleSheetManagerProps]
  }
  
  @scala.inline
  implicit class StyleSheetManagerPropsOps[Self <: StyleSheetManagerProps] (val x: Self) extends AnyVal {
    
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
    def setDisableCSSOMInjection(value: Boolean): Self = this.set("disableCSSOMInjection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableCSSOMInjection: Self = this.set("disableCSSOMInjection", js.undefined)
    
    @scala.inline
    def setDisableVendorPrefixes(value: Boolean): Self = this.set("disableVendorPrefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableVendorPrefixes: Self = this.set("disableVendorPrefixes", js.undefined)
    
    @scala.inline
    def setSheet(value: ServerStyleSheet): Self = this.set("sheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheet: Self = this.set("sheet", js.undefined)
    
    @scala.inline
    def setStylisPluginsVarargs(value: StylisPlugin*): Self = this.set("stylisPlugins", js.Array(value :_*))
    
    @scala.inline
    def setStylisPlugins(value: js.Array[StylisPlugin]): Self = this.set("stylisPlugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStylisPlugins: Self = this.set("stylisPlugins", js.undefined)
    
    @scala.inline
    def setTarget(value: HTMLElement): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
