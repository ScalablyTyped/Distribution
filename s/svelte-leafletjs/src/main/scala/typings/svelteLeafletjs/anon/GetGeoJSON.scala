package typings.svelteLeafletjs.anon

import typings.leaflet.mod.GeoJSONOptions
import typings.leaflet.mod.GeoJSON__
import typings.svelteLeafletjs.mod.PathEventKeys
import typings.svelteLeafletjs.svelteLeafletjsStrings.onadd
import typings.svelteLeafletjs.svelteLeafletjsStrings.onclick
import typings.svelteLeafletjs.svelteLeafletjsStrings.oncontextmenu
import typings.svelteLeafletjs.svelteLeafletjsStrings.ondblclick
import typings.svelteLeafletjs.svelteLeafletjsStrings.onmousedown
import typings.svelteLeafletjs.svelteLeafletjsStrings.onmouseout
import typings.svelteLeafletjs.svelteLeafletjsStrings.onmouseover
import typings.svelteLeafletjs.svelteLeafletjsStrings.onpopupclose
import typings.svelteLeafletjs.svelteLeafletjsStrings.onpopupopen
import typings.svelteLeafletjs.svelteLeafletjsStrings.onremove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGeoJSON extends StObject {
  
  var events: js.UndefOr[PathEventKeys] = js.undefined
  
  var getGeoJSON: js.UndefOr[js.Function0[GeoJSON__[Any]]] = js.undefined
  
  var options: js.UndefOr[GeoJSONOptions[Any]] = js.undefined
  
  var url: String
}
object GetGeoJSON {
  
  inline def apply(url: String): GetGeoJSON = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGeoJSON]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetGeoJSON] (val x: Self) extends AnyVal {
    
    inline def setEvents(value: PathEventKeys): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(
      value: (ondblclick | oncontextmenu | onremove | onmouseout | onadd | onclick | onmouseover | onpopupopen | onpopupclose | onmousedown)*
    ): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setGetGeoJSON(value: () => GeoJSON__[Any]): Self = StObject.set(x, "getGeoJSON", js.Any.fromFunction0(value))
    
    inline def setGetGeoJSONUndefined: Self = StObject.set(x, "getGeoJSON", js.undefined)
    
    inline def setOptions(value: GeoJSONOptions[Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
