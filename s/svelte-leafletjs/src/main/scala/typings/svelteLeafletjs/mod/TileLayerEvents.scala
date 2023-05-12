package typings.svelteLeafletjs.mod

import typings.leaflet.mod.LeafletEvent
import typings.leaflet.mod.TileEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileLayerEvents extends StObject {
  
  var load: LeafletEvent
  
  var loading: LeafletEvent
  
  var tileerror: TileEvent
  
  var tileload: TileEvent
  
  var tileloadstart: TileEvent
  
  var tileunload: TileEvent
}
object TileLayerEvents {
  
  inline def apply(
    load: LeafletEvent,
    loading: LeafletEvent,
    tileerror: TileEvent,
    tileload: TileEvent,
    tileloadstart: TileEvent,
    tileunload: TileEvent
  ): TileLayerEvents = {
    val __obj = js.Dynamic.literal(load = load.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], tileerror = tileerror.asInstanceOf[js.Any], tileload = tileload.asInstanceOf[js.Any], tileloadstart = tileloadstart.asInstanceOf[js.Any], tileunload = tileunload.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileLayerEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TileLayerEvents] (val x: Self) extends AnyVal {
    
    inline def setLoad(value: LeafletEvent): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    inline def setLoading(value: LeafletEvent): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setTileerror(value: TileEvent): Self = StObject.set(x, "tileerror", value.asInstanceOf[js.Any])
    
    inline def setTileload(value: TileEvent): Self = StObject.set(x, "tileload", value.asInstanceOf[js.Any])
    
    inline def setTileloadstart(value: TileEvent): Self = StObject.set(x, "tileloadstart", value.asInstanceOf[js.Any])
    
    inline def setTileunload(value: TileEvent): Self = StObject.set(x, "tileunload", value.asInstanceOf[js.Any])
  }
}
