package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DashboardItemEventMap extends ProxyEventMap {
  
  var click: DashboardItemClickEvent = js.native
  
  var delete: DashboardItemDeleteEvent = js.native
  
  var move: DashboardItemMoveEvent = js.native
}
object DashboardItemEventMap {
  
  @scala.inline
  def apply(click: DashboardItemClickEvent, delete: DashboardItemDeleteEvent, move: DashboardItemMoveEvent): DashboardItemEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardItemEventMap]
  }
  
  @scala.inline
  implicit class DashboardItemEventMapMutableBuilder[Self <: DashboardItemEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: DashboardItemClickEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: DashboardItemDeleteEvent): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMove(value: DashboardItemMoveEvent): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
  }
}
