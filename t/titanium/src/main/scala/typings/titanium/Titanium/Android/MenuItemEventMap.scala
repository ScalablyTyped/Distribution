package typings.titanium.Titanium.Android

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuItemEventMap extends ProxyEventMap {
  
  var click: MenuItemClickEvent = js.native
  
  var collapse: MenuItemCollapseEvent = js.native
  
  var expand: MenuItemExpandEvent = js.native
}
object MenuItemEventMap {
  
  @scala.inline
  def apply(click: MenuItemClickEvent, collapse: MenuItemCollapseEvent, expand: MenuItemExpandEvent): MenuItemEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], collapse = collapse.asInstanceOf[js.Any], expand = expand.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemEventMap]
  }
  
  @scala.inline
  implicit class MenuItemEventMapOps[Self <: MenuItemEventMap] (val x: Self) extends AnyVal {
    
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
    def setClick(value: MenuItemClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapse(value: MenuItemCollapseEvent): Self = this.set("collapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpand(value: MenuItemExpandEvent): Self = this.set("expand", value.asInstanceOf[js.Any])
  }
}
