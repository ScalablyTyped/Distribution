package typings.svelteLeafletjs.anon

import typings.leaflet.mod.IconOptions
import typings.leaflet.mod.Icon_
import typings.leaflet.mod.LatLngExpression
import typings.leaflet.mod.MarkerOptions
import typings.leaflet.mod.Marker_
import typings.svelteLeafletjs.mod.MarkerEventKeys
import typings.svelteLeafletjs.svelteLeafletjsStrings.onadd
import typings.svelteLeafletjs.svelteLeafletjsStrings.onclick
import typings.svelteLeafletjs.svelteLeafletjsStrings.oncontextmenu
import typings.svelteLeafletjs.svelteLeafletjsStrings.ondblclick
import typings.svelteLeafletjs.svelteLeafletjsStrings.ondrag
import typings.svelteLeafletjs.svelteLeafletjsStrings.ondragend
import typings.svelteLeafletjs.svelteLeafletjsStrings.ondragstart
import typings.svelteLeafletjs.svelteLeafletjsStrings.onmousedown
import typings.svelteLeafletjs.svelteLeafletjsStrings.onmouseout
import typings.svelteLeafletjs.svelteLeafletjsStrings.onmouseover
import typings.svelteLeafletjs.svelteLeafletjsStrings.onmove
import typings.svelteLeafletjs.svelteLeafletjsStrings.onpopupclose
import typings.svelteLeafletjs.svelteLeafletjsStrings.onpopupopen
import typings.svelteLeafletjs.svelteLeafletjsStrings.onremove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMarker extends StObject {
  
  var events: js.UndefOr[MarkerEventKeys] = js.undefined
  
  var getMarker: js.UndefOr[js.Function0[Marker_[Any]]] = js.undefined
  
  var icon: js.UndefOr[Icon_[IconOptions]] = js.undefined
  
  var latLng: LatLngExpression
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var options: js.UndefOr[MarkerOptions] = js.undefined
  
  var zIndexOffset: js.UndefOr[Double] = js.undefined
}
object GetMarker {
  
  inline def apply(latLng: LatLngExpression): GetMarker = {
    val __obj = js.Dynamic.literal(latLng = latLng.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMarker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMarker] (val x: Self) extends AnyVal {
    
    inline def setEvents(value: MarkerEventKeys): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(
      value: (ondragstart | ondrag | ondblclick | oncontextmenu | onremove | onmouseout | onadd | onclick | onmove | onmouseover | ondragend | onpopupopen | onpopupclose | onmousedown)*
    ): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setGetMarker(value: () => Marker_[Any]): Self = StObject.set(x, "getMarker", js.Any.fromFunction0(value))
    
    inline def setGetMarkerUndefined: Self = StObject.set(x, "getMarker", js.undefined)
    
    inline def setIcon(value: Icon_[IconOptions]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLatLng(value: LatLngExpression): Self = StObject.set(x, "latLng", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOptions(value: MarkerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setZIndexOffset(value: Double): Self = StObject.set(x, "zIndexOffset", value.asInstanceOf[js.Any])
    
    inline def setZIndexOffsetUndefined: Self = StObject.set(x, "zIndexOffset", js.undefined)
  }
}
