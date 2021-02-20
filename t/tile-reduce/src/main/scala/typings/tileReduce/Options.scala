package typings.tileReduce

import typings.tileReduce.TileReduce.BBox
import typings.tileReduce.TileReduce.Source
import typings.tileReduce.TileReduce.Tile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends StObject {
  
  var bbox: js.UndefOr[BBox] = js.native
  
  var geojson: js.UndefOr[js.Any] = js.native
  
  var log: js.UndefOr[Boolean] = js.native
  
  var map: String = js.native
  
  var mapOptions: js.UndefOr[js.Any] = js.native
  
  var maxWorkers: js.UndefOr[Double] = js.native
  
  var output: js.UndefOr[js.Any] = js.native
  
  var sourceCover: js.UndefOr[String] = js.native
  
  var sources: js.Array[Source] = js.native
  
  var tileStream: js.UndefOr[js.Any] = js.native
  
  var tiles: js.UndefOr[js.Array[Tile]] = js.native
  
  var zoom: Double = js.native
}
object Options {
  
  @scala.inline
  def apply(map: String, sources: js.Array[Source], zoom: Double): Options = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBbox(value: BBox): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBboxUndefined: Self = StObject.set(x, "bbox", js.undefined)
    
    @scala.inline
    def setGeojson(value: js.Any): Self = StObject.set(x, "geojson", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeojsonUndefined: Self = StObject.set(x, "geojson", js.undefined)
    
    @scala.inline
    def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    @scala.inline
    def setMap(value: String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapOptions(value: js.Any): Self = StObject.set(x, "mapOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapOptionsUndefined: Self = StObject.set(x, "mapOptions", js.undefined)
    
    @scala.inline
    def setMaxWorkers(value: Double): Self = StObject.set(x, "maxWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWorkersUndefined: Self = StObject.set(x, "maxWorkers", js.undefined)
    
    @scala.inline
    def setOutput(value: js.Any): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    @scala.inline
    def setSourceCover(value: String): Self = StObject.set(x, "sourceCover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCoverUndefined: Self = StObject.set(x, "sourceCover", js.undefined)
    
    @scala.inline
    def setSources(value: js.Array[Source]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesVarargs(value: Source*): Self = StObject.set(x, "sources", js.Array(value :_*))
    
    @scala.inline
    def setTileStream(value: js.Any): Self = StObject.set(x, "tileStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileStreamUndefined: Self = StObject.set(x, "tileStream", js.undefined)
    
    @scala.inline
    def setTiles(value: js.Array[Tile]): Self = StObject.set(x, "tiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTilesUndefined: Self = StObject.set(x, "tiles", js.undefined)
    
    @scala.inline
    def setTilesVarargs(value: Tile*): Self = StObject.set(x, "tiles", js.Array(value :_*))
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
