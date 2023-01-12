package typings.trimblemapsTrimblemapsJs.mod

import typings.std.MouseEvent
import typings.std.TouchEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapEventType extends StObject {
  
  var boxzoomcancel: MapBoxZoomEvent
  
  var boxzoomend: MapBoxZoomEvent
  
  var boxzoomstart: MapBoxZoomEvent
  
  var click: MapMouseEvent
  
  var contextmenu: MapMouseEvent
  
  var data: MapDataEvent
  
  var dataloading: MapDataEvent
  
  var dblclick: MapMouseEvent
  
  var drag: MapEvent[js.UndefOr[MouseEvent | TouchEvent]]
  
  var dragend: MapEvent[js.UndefOr[MouseEvent | TouchEvent]]
  
  var dragstart: MapEvent[js.UndefOr[MouseEvent | TouchEvent]]
  
  var error: ErrorEvent
  
  var idle: MapEvent[Unit]
  
  var load: MapEvent[Unit]
  
  var mousedown: MapMouseEvent
  
  var mousemove: MapMouseEvent
  
  var mouseout: MapMouseEvent
  
  var mouseover: MapMouseEvent
  
  var mouseup: MapMouseEvent
  
  var move: MapEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]
  
  var moveend: MapEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]
  
  var movestart: MapEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]
  
  var pitch: MapEvent[js.UndefOr[MouseEvent | TouchEvent]]
  
  var pitchend: MapEvent[js.UndefOr[MouseEvent | TouchEvent]]
  
  var pitchstart: MapEvent[js.UndefOr[MouseEvent | TouchEvent]]
  
  var remove: MapEvent[Unit]
  
  var render: MapEvent[Unit]
  
  var resize: MapEvent[Unit]
  
  var rotate: MapEvent[js.UndefOr[MouseEvent | TouchEvent]]
  
  var rotateend: MapEvent[js.UndefOr[MouseEvent | TouchEvent]]
  
  var rotatestart: MapEvent[js.UndefOr[MouseEvent | TouchEvent]]
  
  var sourcedata: MapSourceDataEvent
  
  var sourcedataloading: MapSourceDataEvent
  
  var styledata: MapStyleDataEvent
  
  var styledataloading: MapStyleDataEvent
  
  var tiledataloading: MapDataEvent
  
  var touchcancel: MapTouchEvent
  
  var touchend: MapTouchEvent
  
  var touchmove: MapTouchEvent
  
  var touchstart: MapTouchEvent
  
  var webglcontextlost: MapContextEvent
  
  var webglcontextrestored: MapContextEvent
  
  var wheel: MapWheelEvent
  
  var zoom: MapEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]
  
  var zoomend: MapEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]
  
  var zoomstart: MapEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]
}
object MapEventType {
  
  inline def apply(
    boxzoomcancel: MapBoxZoomEvent,
    boxzoomend: MapBoxZoomEvent,
    boxzoomstart: MapBoxZoomEvent,
    click: MapMouseEvent,
    contextmenu: MapMouseEvent,
    data: MapDataEvent,
    dataloading: MapDataEvent,
    dblclick: MapMouseEvent,
    drag: MapEvent[js.UndefOr[MouseEvent | TouchEvent]],
    dragend: MapEvent[js.UndefOr[MouseEvent | TouchEvent]],
    dragstart: MapEvent[js.UndefOr[MouseEvent | TouchEvent]],
    error: ErrorEvent,
    idle: MapEvent[Unit],
    load: MapEvent[Unit],
    mousedown: MapMouseEvent,
    mousemove: MapMouseEvent,
    mouseout: MapMouseEvent,
    mouseover: MapMouseEvent,
    mouseup: MapMouseEvent,
    move: MapEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]],
    moveend: MapEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]],
    movestart: MapEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]],
    pitch: MapEvent[js.UndefOr[MouseEvent | TouchEvent]],
    pitchend: MapEvent[js.UndefOr[MouseEvent | TouchEvent]],
    pitchstart: MapEvent[js.UndefOr[MouseEvent | TouchEvent]],
    remove: MapEvent[Unit],
    render: MapEvent[Unit],
    resize: MapEvent[Unit],
    rotate: MapEvent[js.UndefOr[MouseEvent | TouchEvent]],
    rotateend: MapEvent[js.UndefOr[MouseEvent | TouchEvent]],
    rotatestart: MapEvent[js.UndefOr[MouseEvent | TouchEvent]],
    sourcedata: MapSourceDataEvent,
    sourcedataloading: MapSourceDataEvent,
    styledata: MapStyleDataEvent,
    styledataloading: MapStyleDataEvent,
    tiledataloading: MapDataEvent,
    touchcancel: MapTouchEvent,
    touchend: MapTouchEvent,
    touchmove: MapTouchEvent,
    touchstart: MapTouchEvent,
    webglcontextlost: MapContextEvent,
    webglcontextrestored: MapContextEvent,
    wheel: MapWheelEvent,
    zoom: MapEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]],
    zoomend: MapEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]],
    zoomstart: MapEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]
  ): MapEventType = {
    val __obj = js.Dynamic.literal(boxzoomcancel = boxzoomcancel.asInstanceOf[js.Any], boxzoomend = boxzoomend.asInstanceOf[js.Any], boxzoomstart = boxzoomstart.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dataloading = dataloading.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], idle = idle.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any], moveend = moveend.asInstanceOf[js.Any], movestart = movestart.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any], pitchend = pitchend.asInstanceOf[js.Any], pitchstart = pitchstart.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], rotateend = rotateend.asInstanceOf[js.Any], rotatestart = rotatestart.asInstanceOf[js.Any], sourcedata = sourcedata.asInstanceOf[js.Any], sourcedataloading = sourcedataloading.asInstanceOf[js.Any], styledata = styledata.asInstanceOf[js.Any], styledataloading = styledataloading.asInstanceOf[js.Any], tiledataloading = tiledataloading.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], webglcontextlost = webglcontextlost.asInstanceOf[js.Any], webglcontextrestored = webglcontextrestored.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any], zoomend = zoomend.asInstanceOf[js.Any], zoomstart = zoomstart.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapEventType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapEventType] (val x: Self) extends AnyVal {
    
    inline def setBoxzoomcancel(value: MapBoxZoomEvent): Self = StObject.set(x, "boxzoomcancel", value.asInstanceOf[js.Any])
    
    inline def setBoxzoomend(value: MapBoxZoomEvent): Self = StObject.set(x, "boxzoomend", value.asInstanceOf[js.Any])
    
    inline def setBoxzoomstart(value: MapBoxZoomEvent): Self = StObject.set(x, "boxzoomstart", value.asInstanceOf[js.Any])
    
    inline def setClick(value: MapMouseEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def setContextmenu(value: MapMouseEvent): Self = StObject.set(x, "contextmenu", value.asInstanceOf[js.Any])
    
    inline def setData(value: MapDataEvent): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataloading(value: MapDataEvent): Self = StObject.set(x, "dataloading", value.asInstanceOf[js.Any])
    
    inline def setDblclick(value: MapMouseEvent): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
    
    inline def setDrag(value: MapEvent[js.UndefOr[MouseEvent | TouchEvent]]): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    inline def setDragend(value: MapEvent[js.UndefOr[MouseEvent | TouchEvent]]): Self = StObject.set(x, "dragend", value.asInstanceOf[js.Any])
    
    inline def setDragstart(value: MapEvent[js.UndefOr[MouseEvent | TouchEvent]]): Self = StObject.set(x, "dragstart", value.asInstanceOf[js.Any])
    
    inline def setError(value: ErrorEvent): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setIdle(value: MapEvent[Unit]): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
    
    inline def setLoad(value: MapEvent[Unit]): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    inline def setMousedown(value: MapMouseEvent): Self = StObject.set(x, "mousedown", value.asInstanceOf[js.Any])
    
    inline def setMousemove(value: MapMouseEvent): Self = StObject.set(x, "mousemove", value.asInstanceOf[js.Any])
    
    inline def setMouseout(value: MapMouseEvent): Self = StObject.set(x, "mouseout", value.asInstanceOf[js.Any])
    
    inline def setMouseover(value: MapMouseEvent): Self = StObject.set(x, "mouseover", value.asInstanceOf[js.Any])
    
    inline def setMouseup(value: MapMouseEvent): Self = StObject.set(x, "mouseup", value.asInstanceOf[js.Any])
    
    inline def setMove(value: MapEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    inline def setMoveend(value: MapEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]): Self = StObject.set(x, "moveend", value.asInstanceOf[js.Any])
    
    inline def setMovestart(value: MapEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]): Self = StObject.set(x, "movestart", value.asInstanceOf[js.Any])
    
    inline def setPitch(value: MapEvent[js.UndefOr[MouseEvent | TouchEvent]]): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    inline def setPitchend(value: MapEvent[js.UndefOr[MouseEvent | TouchEvent]]): Self = StObject.set(x, "pitchend", value.asInstanceOf[js.Any])
    
    inline def setPitchstart(value: MapEvent[js.UndefOr[MouseEvent | TouchEvent]]): Self = StObject.set(x, "pitchstart", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: MapEvent[Unit]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRender(value: MapEvent[Unit]): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    inline def setResize(value: MapEvent[Unit]): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    inline def setRotate(value: MapEvent[js.UndefOr[MouseEvent | TouchEvent]]): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setRotateend(value: MapEvent[js.UndefOr[MouseEvent | TouchEvent]]): Self = StObject.set(x, "rotateend", value.asInstanceOf[js.Any])
    
    inline def setRotatestart(value: MapEvent[js.UndefOr[MouseEvent | TouchEvent]]): Self = StObject.set(x, "rotatestart", value.asInstanceOf[js.Any])
    
    inline def setSourcedata(value: MapSourceDataEvent): Self = StObject.set(x, "sourcedata", value.asInstanceOf[js.Any])
    
    inline def setSourcedataloading(value: MapSourceDataEvent): Self = StObject.set(x, "sourcedataloading", value.asInstanceOf[js.Any])
    
    inline def setStyledata(value: MapStyleDataEvent): Self = StObject.set(x, "styledata", value.asInstanceOf[js.Any])
    
    inline def setStyledataloading(value: MapStyleDataEvent): Self = StObject.set(x, "styledataloading", value.asInstanceOf[js.Any])
    
    inline def setTiledataloading(value: MapDataEvent): Self = StObject.set(x, "tiledataloading", value.asInstanceOf[js.Any])
    
    inline def setTouchcancel(value: MapTouchEvent): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
    
    inline def setTouchend(value: MapTouchEvent): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
    
    inline def setTouchmove(value: MapTouchEvent): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
    
    inline def setTouchstart(value: MapTouchEvent): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
    
    inline def setWebglcontextlost(value: MapContextEvent): Self = StObject.set(x, "webglcontextlost", value.asInstanceOf[js.Any])
    
    inline def setWebglcontextrestored(value: MapContextEvent): Self = StObject.set(x, "webglcontextrestored", value.asInstanceOf[js.Any])
    
    inline def setWheel(value: MapWheelEvent): Self = StObject.set(x, "wheel", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: MapEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomend(value: MapEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]): Self = StObject.set(x, "zoomend", value.asInstanceOf[js.Any])
    
    inline def setZoomstart(value: MapEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]): Self = StObject.set(x, "zoomstart", value.asInstanceOf[js.Any])
  }
}
