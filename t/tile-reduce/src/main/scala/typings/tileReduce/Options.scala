package typings.tileReduce

import typings.tileReduce.TileReduce.BBox
import typings.tileReduce.TileReduce.Source
import typings.tileReduce.TileReduce.Tile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var bbox: js.UndefOr[BBox] = js.undefined
  
  var geojson: js.UndefOr[Any] = js.undefined
  
  var log: js.UndefOr[Boolean] = js.undefined
  
  var map: String
  
  var mapOptions: js.UndefOr[Any] = js.undefined
  
  var maxWorkers: js.UndefOr[Double] = js.undefined
  
  var output: js.UndefOr[Any] = js.undefined
  
  var sourceCover: js.UndefOr[String] = js.undefined
  
  var sources: js.Array[Source]
  
  var tileStream: js.UndefOr[Any] = js.undefined
  
  var tiles: js.UndefOr[js.Array[Tile]] = js.undefined
  
  var zoom: Double
}
object Options {
  
  inline def apply(map: String, sources: js.Array[Source], zoom: Double): Options = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setBbox(value: BBox): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
    
    inline def setBboxUndefined: Self = StObject.set(x, "bbox", js.undefined)
    
    inline def setGeojson(value: Any): Self = StObject.set(x, "geojson", value.asInstanceOf[js.Any])
    
    inline def setGeojsonUndefined: Self = StObject.set(x, "geojson", js.undefined)
    
    inline def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    inline def setMap(value: String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapOptions(value: Any): Self = StObject.set(x, "mapOptions", value.asInstanceOf[js.Any])
    
    inline def setMapOptionsUndefined: Self = StObject.set(x, "mapOptions", js.undefined)
    
    inline def setMaxWorkers(value: Double): Self = StObject.set(x, "maxWorkers", value.asInstanceOf[js.Any])
    
    inline def setMaxWorkersUndefined: Self = StObject.set(x, "maxWorkers", js.undefined)
    
    inline def setOutput(value: Any): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    inline def setSourceCover(value: String): Self = StObject.set(x, "sourceCover", value.asInstanceOf[js.Any])
    
    inline def setSourceCoverUndefined: Self = StObject.set(x, "sourceCover", js.undefined)
    
    inline def setSources(value: js.Array[Source]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesVarargs(value: Source*): Self = StObject.set(x, "sources", js.Array(value*))
    
    inline def setTileStream(value: Any): Self = StObject.set(x, "tileStream", value.asInstanceOf[js.Any])
    
    inline def setTileStreamUndefined: Self = StObject.set(x, "tileStream", js.undefined)
    
    inline def setTiles(value: js.Array[Tile]): Self = StObject.set(x, "tiles", value.asInstanceOf[js.Any])
    
    inline def setTilesUndefined: Self = StObject.set(x, "tiles", js.undefined)
    
    inline def setTilesVarargs(value: Tile*): Self = StObject.set(x, "tiles", js.Array(value*))
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
