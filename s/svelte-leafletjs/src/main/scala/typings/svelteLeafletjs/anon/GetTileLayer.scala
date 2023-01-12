package typings.svelteLeafletjs.anon

import typings.leaflet.mod.TileLayerOptions
import typings.svelteLeafletjs.mod.TileLayerEventKeys
import typings.svelteLeafletjs.svelteLeafletjsStrings.onload
import typings.svelteLeafletjs.svelteLeafletjsStrings.onloading
import typings.svelteLeafletjs.svelteLeafletjsStrings.ontileerror
import typings.svelteLeafletjs.svelteLeafletjsStrings.ontileload
import typings.svelteLeafletjs.svelteLeafletjsStrings.ontileloadstart
import typings.svelteLeafletjs.svelteLeafletjsStrings.ontileunload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTileLayer extends StObject {
  
  var events: js.UndefOr[TileLayerEventKeys] = js.undefined
  
  var getTileLayer: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var options: js.UndefOr[TileLayerOptions] = js.undefined
  
  var url: String
  
  var wms: js.UndefOr[Boolean] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object GetTileLayer {
  
  inline def apply(url: String): GetTileLayer = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTileLayer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTileLayer] (val x: Self) extends AnyVal {
    
    inline def setEvents(value: TileLayerEventKeys): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: (ontileloadstart | ontileerror | ontileload | onloading | onload | ontileunload)*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setGetTileLayer(value: () => GetTileLayer): Self = StObject.set(x, "getTileLayer", js.Any.fromFunction0(value))
    
    inline def setGetTileLayerUndefined: Self = StObject.set(x, "getTileLayer", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOptions(value: TileLayerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWms(value: Boolean): Self = StObject.set(x, "wms", value.asInstanceOf[js.Any])
    
    inline def setWmsUndefined: Self = StObject.set(x, "wms", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
