package typings.tablesorter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemTablesorterCacheMod {
  
  trait TablesorterCache extends StObject {
    
    /**
      * The maximal values of the columns.
      */
    var colMax: js.Array[Any]
    
    /**
      * The normalized data.
      */
    var normalized: js.Array[Any]
  }
  object TablesorterCache {
    
    inline def apply(colMax: js.Array[Any], normalized: js.Array[Any]): TablesorterCache = {
      val __obj = js.Dynamic.literal(colMax = colMax.asInstanceOf[js.Any], normalized = normalized.asInstanceOf[js.Any])
      __obj.asInstanceOf[TablesorterCache]
    }
    
    extension [Self <: TablesorterCache](x: Self) {
      
      inline def setColMax(value: js.Array[Any]): Self = StObject.set(x, "colMax", value.asInstanceOf[js.Any])
      
      inline def setColMaxVarargs(value: Any*): Self = StObject.set(x, "colMax", js.Array(value*))
      
      inline def setNormalized(value: js.Array[Any]): Self = StObject.set(x, "normalized", value.asInstanceOf[js.Any])
      
      inline def setNormalizedVarargs(value: Any*): Self = StObject.set(x, "normalized", js.Array(value*))
    }
  }
}
