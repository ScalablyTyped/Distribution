package typings.svelteLeafletjs.anon

import typings.leaflet.mod.MapOptions
import typings.leaflet.mod.Map_
import typings.svelteLeafletjs.mod.MapEventKeys
import typings.svelteLeafletjs.svelteLeafletjsStrings.autopanstart
import typings.svelteLeafletjs.svelteLeafletjsStrings.baselayerchange
import typings.svelteLeafletjs.svelteLeafletjsStrings.blur
import typings.svelteLeafletjs.svelteLeafletjsStrings.click
import typings.svelteLeafletjs.svelteLeafletjsStrings.contextmenu
import typings.svelteLeafletjs.svelteLeafletjsStrings.dblclick
import typings.svelteLeafletjs.svelteLeafletjsStrings.drag
import typings.svelteLeafletjs.svelteLeafletjsStrings.dragend
import typings.svelteLeafletjs.svelteLeafletjsStrings.dragstart
import typings.svelteLeafletjs.svelteLeafletjsStrings.focus
import typings.svelteLeafletjs.svelteLeafletjsStrings.layeradd
import typings.svelteLeafletjs.svelteLeafletjsStrings.layerremove
import typings.svelteLeafletjs.svelteLeafletjsStrings.load
import typings.svelteLeafletjs.svelteLeafletjsStrings.locationerror
import typings.svelteLeafletjs.svelteLeafletjsStrings.locationfound
import typings.svelteLeafletjs.svelteLeafletjsStrings.mousedown
import typings.svelteLeafletjs.svelteLeafletjsStrings.mousemove
import typings.svelteLeafletjs.svelteLeafletjsStrings.mouseout
import typings.svelteLeafletjs.svelteLeafletjsStrings.mouseover
import typings.svelteLeafletjs.svelteLeafletjsStrings.mouseup
import typings.svelteLeafletjs.svelteLeafletjsStrings.move
import typings.svelteLeafletjs.svelteLeafletjsStrings.moveend
import typings.svelteLeafletjs.svelteLeafletjsStrings.movestart
import typings.svelteLeafletjs.svelteLeafletjsStrings.overlayadd
import typings.svelteLeafletjs.svelteLeafletjsStrings.overlayremove
import typings.svelteLeafletjs.svelteLeafletjsStrings.popupclose
import typings.svelteLeafletjs.svelteLeafletjsStrings.popupopen
import typings.svelteLeafletjs.svelteLeafletjsStrings.preclick
import typings.svelteLeafletjs.svelteLeafletjsStrings.resize
import typings.svelteLeafletjs.svelteLeafletjsStrings.unload
import typings.svelteLeafletjs.svelteLeafletjsStrings.viewreset
import typings.svelteLeafletjs.svelteLeafletjsStrings.zoom
import typings.svelteLeafletjs.svelteLeafletjsStrings.zoomend
import typings.svelteLeafletjs.svelteLeafletjsStrings.zoomlevelschange
import typings.svelteLeafletjs.svelteLeafletjsStrings.zoomstart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Events extends StObject {
  
  var events: js.UndefOr[MapEventKeys] = js.undefined
  
  var getMap: js.UndefOr[js.Function0[Map_]] = js.undefined
  
  var options: js.UndefOr[MapOptions] = js.undefined
}
object Events {
  
  inline def apply(): Events = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Events]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Events] (val x: Self) extends AnyVal {
    
    inline def setEvents(value: MapEventKeys): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(
      value: (click | dblclick | mousedown | mouseup | mouseover | mouseout | mousemove | contextmenu | focus | blur | preclick | load | unload | viewreset | move | movestart | moveend | dragstart | drag | dragend | zoomstart | zoom | zoomend | zoomlevelschange | resize | autopanstart | layeradd | layerremove | baselayerchange | overlayadd | overlayremove | locationfound | locationerror | popupopen | popupclose)*
    ): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setGetMap(value: () => Map_): Self = StObject.set(x, "getMap", js.Any.fromFunction0(value))
    
    inline def setGetMapUndefined: Self = StObject.set(x, "getMap", js.undefined)
    
    inline def setOptions(value: MapOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
