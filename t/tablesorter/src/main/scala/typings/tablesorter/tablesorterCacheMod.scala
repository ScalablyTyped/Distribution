package typings.tablesorter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tablesorterCacheMod {
  
  trait TablesorterCache extends StObject {
    
    /**
      * The maximal values of the columns.
      */
    var colMax: js.Array[js.Any]
    
    /**
      * The normalized data.
      */
    var normalized: js.Array[js.Any]
  }
  object TablesorterCache {
    
    inline def apply(colMax: js.Array[js.Any], normalized: js.Array[js.Any]): TablesorterCache = {
      val __obj = js.Dynamic.literal(colMax = colMax.asInstanceOf[js.Any], normalized = normalized.asInstanceOf[js.Any])
      __obj.asInstanceOf[TablesorterCache]
    }
    
    extension [Self <: TablesorterCache](x: Self) {
      
      inline def setColMax(value: js.Array[js.Any]): Self = StObject.set(x, "colMax", value.asInstanceOf[js.Any])
      
      inline def setColMaxVarargs(value: js.Any*): Self = StObject.set(x, "colMax", js.Array(value :_*))
      
      inline def setNormalized(value: js.Array[js.Any]): Self = StObject.set(x, "normalized", value.asInstanceOf[js.Any])
      
      inline def setNormalizedVarargs(value: js.Any*): Self = StObject.set(x, "normalized", js.Array(value :_*))
    }
  }
}
