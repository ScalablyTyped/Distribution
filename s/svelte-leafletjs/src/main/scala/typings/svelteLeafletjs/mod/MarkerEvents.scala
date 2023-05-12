package typings.svelteLeafletjs.mod

import typings.leaflet.mod.DragEndEvent
import typings.leaflet.mod.LeafletEvent
import typings.leaflet.mod.LeafletMouseEvent
import typings.leaflet.mod.PopupEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerEvents extends StObject {
  
  var add: LeafletEvent
  
  var click: LeafletMouseEvent
  
  var contextmenu: LeafletMouseEvent
  
  var dblclick: LeafletMouseEvent
  
  var drag: LeafletEvent
  
  var dragend: DragEndEvent
  
  var dragstart: LeafletEvent
  
  var mousedown: LeafletMouseEvent
  
  var mouseout: LeafletMouseEvent
  
  var mouseover: LeafletMouseEvent
  
  var move: LeafletEvent
  
  var popupclose: PopupEvent
  
  var popupopen: PopupEvent
  
  var remove: LeafletEvent
}
object MarkerEvents {
  
  inline def apply(
    add: LeafletEvent,
    click: LeafletMouseEvent,
    contextmenu: LeafletMouseEvent,
    dblclick: LeafletMouseEvent,
    drag: LeafletEvent,
    dragend: DragEndEvent,
    dragstart: LeafletEvent,
    mousedown: LeafletMouseEvent,
    mouseout: LeafletMouseEvent,
    mouseover: LeafletMouseEvent,
    move: LeafletEvent,
    popupclose: PopupEvent,
    popupopen: PopupEvent,
    remove: LeafletEvent
  ): MarkerEvents = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any], popupclose = popupclose.asInstanceOf[js.Any], popupopen = popupopen.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarkerEvents] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: LeafletEvent): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setClick(value: LeafletMouseEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def setContextmenu(value: LeafletMouseEvent): Self = StObject.set(x, "contextmenu", value.asInstanceOf[js.Any])
    
    inline def setDblclick(value: LeafletMouseEvent): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
    
    inline def setDrag(value: LeafletEvent): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    inline def setDragend(value: DragEndEvent): Self = StObject.set(x, "dragend", value.asInstanceOf[js.Any])
    
    inline def setDragstart(value: LeafletEvent): Self = StObject.set(x, "dragstart", value.asInstanceOf[js.Any])
    
    inline def setMousedown(value: LeafletMouseEvent): Self = StObject.set(x, "mousedown", value.asInstanceOf[js.Any])
    
    inline def setMouseout(value: LeafletMouseEvent): Self = StObject.set(x, "mouseout", value.asInstanceOf[js.Any])
    
    inline def setMouseover(value: LeafletMouseEvent): Self = StObject.set(x, "mouseover", value.asInstanceOf[js.Any])
    
    inline def setMove(value: LeafletEvent): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    inline def setPopupclose(value: PopupEvent): Self = StObject.set(x, "popupclose", value.asInstanceOf[js.Any])
    
    inline def setPopupopen(value: PopupEvent): Self = StObject.set(x, "popupopen", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: LeafletEvent): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
  }
}
