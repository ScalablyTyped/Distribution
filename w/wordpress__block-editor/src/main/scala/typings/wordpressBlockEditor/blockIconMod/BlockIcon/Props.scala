package typings.wordpressBlockEditor.blockIconMod.BlockIcon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var icon: /* import warning: importer.ImportType#apply Failed type conversion: @wordpress/components.@wordpress/components/icon.Icon.Props<any>['icon'] */ js.Any = js.native
  
  var showColors: js.UndefOr[Boolean] = js.native
}
object Props {
  
  @scala.inline
  def apply(
    icon: /* import warning: importer.ImportType#apply Failed type conversion: @wordpress/components.@wordpress/components/icon.Icon.Props<any>['icon'] */ js.Any
  ): Props = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
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
    def setIcon(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @wordpress/components.@wordpress/components/icon.Icon.Props<any>['icon'] */ js.Any
    ): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setShowColors(value: Boolean): Self = this.set("showColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowColors: Self = this.set("showColors", js.undefined)
  }
}
