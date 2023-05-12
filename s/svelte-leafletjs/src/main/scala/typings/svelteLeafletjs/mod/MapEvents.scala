package typings.svelteLeafletjs.mod

import typings.leaflet.mod.DragEndEvent
import typings.leaflet.mod.ErrorEvent
import typings.leaflet.mod.LayerEvent
import typings.leaflet.mod.LayersControlEvent
import typings.leaflet.mod.LeafletEvent
import typings.leaflet.mod.LeafletMouseEvent
import typings.leaflet.mod.LocationEvent
import typings.leaflet.mod.PopupEvent
import typings.leaflet.mod.ResizeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapEvents extends StObject {
  
  var autopanstart: LeafletEvent
  
  var baselayerchange: LayersControlEvent
  
  var blur: LeafletEvent
  
  var click: LeafletMouseEvent
  
  var contextmenu: LeafletMouseEvent
  
  var dblclick: LeafletMouseEvent
  
  var drag: LeafletEvent
  
  var dragend: DragEndEvent
  
  var dragstart: LeafletEvent
  
  var focus: LeafletEvent
  
  var layeradd: LayerEvent
  
  var layerremove: LayerEvent
  
  var load: LeafletEvent
  
  var locationerror: ErrorEvent
  
  var locationfound: LocationEvent
  
  var mousedown: LeafletMouseEvent
  
  var mousemove: LeafletMouseEvent
  
  var mouseout: LeafletMouseEvent
  
  var mouseover: LeafletMouseEvent
  
  var mouseup: LeafletMouseEvent
  
  var move: LeafletEvent
  
  var moveend: LeafletEvent
  
  var movestart: LeafletEvent
  
  var overlayadd: LayersControlEvent
  
  var overlayremove: LayersControlEvent
  
  var popupclose: PopupEvent
  
  var popupopen: PopupEvent
  
  var preclick: LeafletMouseEvent
  
  var resize: ResizeEvent
  
  var unload: LeafletEvent
  
  var viewreset: LeafletEvent
  
  var zoom: LeafletEvent
  
  var zoomend: LeafletEvent
  
  var zoomlevelschange: LeafletEvent
  
  var zoomstart: LeafletEvent
}
object MapEvents {
  
  inline def apply(
    autopanstart: LeafletEvent,
    baselayerchange: LayersControlEvent,
    blur: LeafletEvent,
    click: LeafletMouseEvent,
    contextmenu: LeafletMouseEvent,
    dblclick: LeafletMouseEvent,
    drag: LeafletEvent,
    dragend: DragEndEvent,
    dragstart: LeafletEvent,
    focus: LeafletEvent,
    layeradd: LayerEvent,
    layerremove: LayerEvent,
    load: LeafletEvent,
    locationerror: ErrorEvent,
    locationfound: LocationEvent,
    mousedown: LeafletMouseEvent,
    mousemove: LeafletMouseEvent,
    mouseout: LeafletMouseEvent,
    mouseover: LeafletMouseEvent,
    mouseup: LeafletMouseEvent,
    move: LeafletEvent,
    moveend: LeafletEvent,
    movestart: LeafletEvent,
    overlayadd: LayersControlEvent,
    overlayremove: LayersControlEvent,
    popupclose: PopupEvent,
    popupopen: PopupEvent,
    preclick: LeafletMouseEvent,
    resize: ResizeEvent,
    unload: LeafletEvent,
    viewreset: LeafletEvent,
    zoom: LeafletEvent,
    zoomend: LeafletEvent,
    zoomlevelschange: LeafletEvent,
    zoomstart: LeafletEvent
  ): MapEvents = {
    val __obj = js.Dynamic.literal(autopanstart = autopanstart.asInstanceOf[js.Any], baselayerchange = baselayerchange.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], layeradd = layeradd.asInstanceOf[js.Any], layerremove = layerremove.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], locationerror = locationerror.asInstanceOf[js.Any], locationfound = locationfound.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any], moveend = moveend.asInstanceOf[js.Any], movestart = movestart.asInstanceOf[js.Any], overlayadd = overlayadd.asInstanceOf[js.Any], overlayremove = overlayremove.asInstanceOf[js.Any], popupclose = popupclose.asInstanceOf[js.Any], popupopen = popupopen.asInstanceOf[js.Any], preclick = preclick.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], unload = unload.asInstanceOf[js.Any], viewreset = viewreset.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any], zoomend = zoomend.asInstanceOf[js.Any], zoomlevelschange = zoomlevelschange.asInstanceOf[js.Any], zoomstart = zoomstart.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapEvents] (val x: Self) extends AnyVal {
    
    inline def setAutopanstart(value: LeafletEvent): Self = StObject.set(x, "autopanstart", value.asInstanceOf[js.Any])
    
    inline def setBaselayerchange(value: LayersControlEvent): Self = StObject.set(x, "baselayerchange", value.asInstanceOf[js.Any])
    
    inline def setBlur(value: LeafletEvent): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
    
    inline def setClick(value: LeafletMouseEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def setContextmenu(value: LeafletMouseEvent): Self = StObject.set(x, "contextmenu", value.asInstanceOf[js.Any])
    
    inline def setDblclick(value: LeafletMouseEvent): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
    
    inline def setDrag(value: LeafletEvent): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    inline def setDragend(value: DragEndEvent): Self = StObject.set(x, "dragend", value.asInstanceOf[js.Any])
    
    inline def setDragstart(value: LeafletEvent): Self = StObject.set(x, "dragstart", value.asInstanceOf[js.Any])
    
    inline def setFocus(value: LeafletEvent): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setLayeradd(value: LayerEvent): Self = StObject.set(x, "layeradd", value.asInstanceOf[js.Any])
    
    inline def setLayerremove(value: LayerEvent): Self = StObject.set(x, "layerremove", value.asInstanceOf[js.Any])
    
    inline def setLoad(value: LeafletEvent): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    inline def setLocationerror(value: ErrorEvent): Self = StObject.set(x, "locationerror", value.asInstanceOf[js.Any])
    
    inline def setLocationfound(value: LocationEvent): Self = StObject.set(x, "locationfound", value.asInstanceOf[js.Any])
    
    inline def setMousedown(value: LeafletMouseEvent): Self = StObject.set(x, "mousedown", value.asInstanceOf[js.Any])
    
    inline def setMousemove(value: LeafletMouseEvent): Self = StObject.set(x, "mousemove", value.asInstanceOf[js.Any])
    
    inline def setMouseout(value: LeafletMouseEvent): Self = StObject.set(x, "mouseout", value.asInstanceOf[js.Any])
    
    inline def setMouseover(value: LeafletMouseEvent): Self = StObject.set(x, "mouseover", value.asInstanceOf[js.Any])
    
    inline def setMouseup(value: LeafletMouseEvent): Self = StObject.set(x, "mouseup", value.asInstanceOf[js.Any])
    
    inline def setMove(value: LeafletEvent): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    inline def setMoveend(value: LeafletEvent): Self = StObject.set(x, "moveend", value.asInstanceOf[js.Any])
    
    inline def setMovestart(value: LeafletEvent): Self = StObject.set(x, "movestart", value.asInstanceOf[js.Any])
    
    inline def setOverlayadd(value: LayersControlEvent): Self = StObject.set(x, "overlayadd", value.asInstanceOf[js.Any])
    
    inline def setOverlayremove(value: LayersControlEvent): Self = StObject.set(x, "overlayremove", value.asInstanceOf[js.Any])
    
    inline def setPopupclose(value: PopupEvent): Self = StObject.set(x, "popupclose", value.asInstanceOf[js.Any])
    
    inline def setPopupopen(value: PopupEvent): Self = StObject.set(x, "popupopen", value.asInstanceOf[js.Any])
    
    inline def setPreclick(value: LeafletMouseEvent): Self = StObject.set(x, "preclick", value.asInstanceOf[js.Any])
    
    inline def setResize(value: ResizeEvent): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    inline def setUnload(value: LeafletEvent): Self = StObject.set(x, "unload", value.asInstanceOf[js.Any])
    
    inline def setViewreset(value: LeafletEvent): Self = StObject.set(x, "viewreset", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: LeafletEvent): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomend(value: LeafletEvent): Self = StObject.set(x, "zoomend", value.asInstanceOf[js.Any])
    
    inline def setZoomlevelschange(value: LeafletEvent): Self = StObject.set(x, "zoomlevelschange", value.asInstanceOf[js.Any])
    
    inline def setZoomstart(value: LeafletEvent): Self = StObject.set(x, "zoomstart", value.asInstanceOf[js.Any])
  }
}
