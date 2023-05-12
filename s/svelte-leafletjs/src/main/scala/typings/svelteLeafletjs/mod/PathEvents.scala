package typings.svelteLeafletjs.mod

import typings.leaflet.mod.LeafletEvent
import typings.leaflet.mod.LeafletMouseEvent
import typings.leaflet.mod.PopupEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEvents extends StObject {
  
  var add: LeafletEvent
  
  var click: LeafletMouseEvent
  
  var contextmenu: LeafletMouseEvent
  
  var dblclick: LeafletMouseEvent
  
  var mousedown: LeafletMouseEvent
  
  var mouseout: LeafletMouseEvent
  
  var mouseover: LeafletMouseEvent
  
  var popupclose: PopupEvent
  
  var popupopen: PopupEvent
  
  var remove: LeafletEvent
}
object PathEvents {
  
  inline def apply(
    add: LeafletEvent,
    click: LeafletMouseEvent,
    contextmenu: LeafletMouseEvent,
    dblclick: LeafletMouseEvent,
    mousedown: LeafletMouseEvent,
    mouseout: LeafletMouseEvent,
    mouseover: LeafletMouseEvent,
    popupclose: PopupEvent,
    popupopen: PopupEvent,
    remove: LeafletEvent
  ): PathEvents = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], popupclose = popupclose.asInstanceOf[js.Any], popupopen = popupopen.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathEvents] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: LeafletEvent): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setClick(value: LeafletMouseEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def setContextmenu(value: LeafletMouseEvent): Self = StObject.set(x, "contextmenu", value.asInstanceOf[js.Any])
    
    inline def setDblclick(value: LeafletMouseEvent): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
    
    inline def setMousedown(value: LeafletMouseEvent): Self = StObject.set(x, "mousedown", value.asInstanceOf[js.Any])
    
    inline def setMouseout(value: LeafletMouseEvent): Self = StObject.set(x, "mouseout", value.asInstanceOf[js.Any])
    
    inline def setMouseover(value: LeafletMouseEvent): Self = StObject.set(x, "mouseover", value.asInstanceOf[js.Any])
    
    inline def setPopupclose(value: PopupEvent): Self = StObject.set(x, "popupclose", value.asInstanceOf[js.Any])
    
    inline def setPopupopen(value: PopupEvent): Self = StObject.set(x, "popupopen", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: LeafletEvent): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
  }
}
