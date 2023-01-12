package typings.tileReduce

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TileReduce {
  
  type BBox = js.Tuple4[Double, Double, Double, Double]
  
  trait Source extends StObject {
    
    var layers: js.UndefOr[js.Array[String]] = js.undefined
    
    var maxrate: js.UndefOr[Double] = js.undefined
    
    var mbtiles: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var raw: js.UndefOr[Boolean] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Source {
    
    inline def apply(name: String): Source = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Source]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
      
      inline def setLayers(value: js.Array[String]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(value: String*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setMaxrate(value: Double): Self = StObject.set(x, "maxrate", value.asInstanceOf[js.Any])
      
      inline def setMaxrateUndefined: Self = StObject.set(x, "maxrate", js.undefined)
      
      inline def setMbtiles(value: String): Self = StObject.set(x, "mbtiles", value.asInstanceOf[js.Any])
      
      inline def setMbtilesUndefined: Self = StObject.set(x, "mbtiles", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  type Tile = js.Tuple3[Double, Double, Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.tileReduce.tileReduceStrings.start
    - typings.tileReduce.tileReduceStrings.map
    - typings.tileReduce.tileReduceStrings.reduce
    - typings.tileReduce.tileReduceStrings.end
  */
  trait Types extends StObject
  object Types {
    
    inline def end: typings.tileReduce.tileReduceStrings.end = "end".asInstanceOf[typings.tileReduce.tileReduceStrings.end]
    
    inline def map: typings.tileReduce.tileReduceStrings.map = "map".asInstanceOf[typings.tileReduce.tileReduceStrings.map]
    
    inline def reduce: typings.tileReduce.tileReduceStrings.reduce = "reduce".asInstanceOf[typings.tileReduce.tileReduceStrings.reduce]
    
    inline def start: typings.tileReduce.tileReduceStrings.start = "start".asInstanceOf[typings.tileReduce.tileReduceStrings.start]
  }
}
