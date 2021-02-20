package typings.titanium.Titanium.Android

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
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
  implicit class MenuItemEventMapMutableBuilder[Self <: MenuItemEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: MenuItemClickEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapse(value: MenuItemCollapseEvent): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpand(value: MenuItemExpandEvent): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
  }
}
