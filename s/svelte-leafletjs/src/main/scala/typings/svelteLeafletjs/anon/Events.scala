package typings.svelteLeafletjs.anon

import typings.leaflet.mod.MapOptions
import typings.leaflet.mod.Map_
import typings.svelteLeafletjs.mod.MapEventKeys
import typings.svelteLeafletjs.svelteLeafletjsStrings.onautopanstart
import typings.svelteLeafletjs.svelteLeafletjsStrings.onbaselayerchange
import typings.svelteLeafletjs.svelteLeafletjsStrings.onblur
import typings.svelteLeafletjs.svelteLeafletjsStrings.onclick
import typings.svelteLeafletjs.svelteLeafletjsStrings.oncontextmenu
import typings.svelteLeafletjs.svelteLeafletjsStrings.ondblclick
import typings.svelteLeafletjs.svelteLeafletjsStrings.ondrag
import typings.svelteLeafletjs.svelteLeafletjsStrings.ondragend
import typings.svelteLeafletjs.svelteLeafletjsStrings.ondragstart
import typings.svelteLeafletjs.svelteLeafletjsStrings.onfocus
import typings.svelteLeafletjs.svelteLeafletjsStrings.onlayeradd
import typings.svelteLeafletjs.svelteLeafletjsStrings.onlayerremove
import typings.svelteLeafletjs.svelteLeafletjsStrings.onload
import typings.svelteLeafletjs.svelteLeafletjsStrings.onlocationerror
import typings.svelteLeafletjs.svelteLeafletjsStrings.onlocationfound
import typings.svelteLeafletjs.svelteLeafletjsStrings.onmousedown
import typings.svelteLeafletjs.svelteLeafletjsStrings.onmousemove
import typings.svelteLeafletjs.svelteLeafletjsStrings.onmouseout
import typings.svelteLeafletjs.svelteLeafletjsStrings.onmouseover
import typings.svelteLeafletjs.svelteLeafletjsStrings.onmouseup
import typings.svelteLeafletjs.svelteLeafletjsStrings.onmove
import typings.svelteLeafletjs.svelteLeafletjsStrings.onmoveend
import typings.svelteLeafletjs.svelteLeafletjsStrings.onmovestart
import typings.svelteLeafletjs.svelteLeafletjsStrings.onoverlayadd
import typings.svelteLeafletjs.svelteLeafletjsStrings.onoverlayremove
import typings.svelteLeafletjs.svelteLeafletjsStrings.onpopupclose
import typings.svelteLeafletjs.svelteLeafletjsStrings.onpopupopen
import typings.svelteLeafletjs.svelteLeafletjsStrings.onpreclick
import typings.svelteLeafletjs.svelteLeafletjsStrings.onresize
import typings.svelteLeafletjs.svelteLeafletjsStrings.onunload
import typings.svelteLeafletjs.svelteLeafletjsStrings.onviewreset
import typings.svelteLeafletjs.svelteLeafletjsStrings.onzoom
import typings.svelteLeafletjs.svelteLeafletjsStrings.onzoomend
import typings.svelteLeafletjs.svelteLeafletjsStrings.onzoomlevelschange
import typings.svelteLeafletjs.svelteLeafletjsStrings.onzoomstart
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
      value: (onlocationfound | ondragstart | onzoomlevelschange | onzoom | ondrag | ondblclick | onbaselayerchange | oncontextmenu | onoverlayadd | onmouseout | onviewreset | onoverlayremove | onzoomstart | onlayerremove | onclick | onresize | onmovestart | onfocus | onmouseup | onmoveend | onmove | onmouseover | onpreclick | onzoomend | onautopanstart | onblur | onload | ondragend | onlocationerror | onpopupopen | onmousemove | onpopupclose | onunload | onlayeradd | onmousedown)*
    ): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setGetMap(value: () => Map_): Self = StObject.set(x, "getMap", js.Any.fromFunction0(value))
    
    inline def setGetMapUndefined: Self = StObject.set(x, "getMap", js.undefined)
    
    inline def setOptions(value: MapOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
