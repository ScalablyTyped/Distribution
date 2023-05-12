package typings.svelteLeafletjs.anon

import typings.geojson.mod.GeometryObject
import typings.leaflet.mod.GeoJSONOptions
import typings.leaflet.mod.GeoJSON__
import typings.svelteLeafletjs.mod.PathEventKeys
import typings.svelteLeafletjs.svelteLeafletjsStrings.add
import typings.svelteLeafletjs.svelteLeafletjsStrings.click
import typings.svelteLeafletjs.svelteLeafletjsStrings.contextmenu
import typings.svelteLeafletjs.svelteLeafletjsStrings.dblclick
import typings.svelteLeafletjs.svelteLeafletjsStrings.mousedown
import typings.svelteLeafletjs.svelteLeafletjsStrings.mouseout
import typings.svelteLeafletjs.svelteLeafletjsStrings.mouseover
import typings.svelteLeafletjs.svelteLeafletjsStrings.popupclose
import typings.svelteLeafletjs.svelteLeafletjsStrings.popupopen
import typings.svelteLeafletjs.svelteLeafletjsStrings.remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGeoJSON extends StObject {
  
  var events: js.UndefOr[PathEventKeys] = js.undefined
  
  var getGeoJSON: js.UndefOr[js.Function0[GeoJSON__[Any, GeometryObject]]] = js.undefined
  
  var options: js.UndefOr[GeoJSONOptions[Any, GeometryObject]] = js.undefined
  
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
      value: (click | dblclick | mousedown | mouseover | mouseout | contextmenu | add | remove | popupopen | popupclose)*
    ): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setGetGeoJSON(value: () => GeoJSON__[Any, GeometryObject]): Self = StObject.set(x, "getGeoJSON", js.Any.fromFunction0(value))
    
    inline def setGetGeoJSONUndefined: Self = StObject.set(x, "getGeoJSON", js.undefined)
    
    inline def setOptions(value: GeoJSONOptions[Any, GeometryObject]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
