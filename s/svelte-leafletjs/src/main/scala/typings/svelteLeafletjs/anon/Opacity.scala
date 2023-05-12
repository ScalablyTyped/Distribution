package typings.svelteLeafletjs.anon

import typings.leaflet.mod.TileLayerOptions
import typings.leaflet.mod.TileLayer_
import typings.svelteLeafletjs.mod.TileLayerEventKeys
import typings.svelteLeafletjs.svelteLeafletjsStrings.load
import typings.svelteLeafletjs.svelteLeafletjsStrings.loading
import typings.svelteLeafletjs.svelteLeafletjsStrings.tileerror
import typings.svelteLeafletjs.svelteLeafletjsStrings.tileload
import typings.svelteLeafletjs.svelteLeafletjsStrings.tileloadstart
import typings.svelteLeafletjs.svelteLeafletjsStrings.tileunload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Opacity extends StObject {
  
  var events: js.UndefOr[TileLayerEventKeys] = js.undefined
  
  var getTileLayer: js.UndefOr[js.Function0[TileLayer_]] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var options: js.UndefOr[TileLayerOptions] = js.undefined
  
  var url: String
  
  var wms: js.UndefOr[Boolean] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object Opacity {
  
  inline def apply(url: String): Opacity = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opacity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Opacity] (val x: Self) extends AnyVal {
    
    inline def setEvents(value: TileLayerEventKeys): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: (loading | load | tileloadstart | tileload | tileunload | tileerror)*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setGetTileLayer(value: () => TileLayer_): Self = StObject.set(x, "getTileLayer", js.Any.fromFunction0(value))
    
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
