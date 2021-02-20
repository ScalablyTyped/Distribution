package typings.tablesorter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tablesorterCacheMod {
  
  @js.native
  trait TablesorterCache extends StObject {
    
    /**
      * The maximal values of the columns.
      */
    var colMax: js.Array[_] = js.native
    
    /**
      * The normalized data.
      */
    var normalized: js.Array[_] = js.native
  }
  object TablesorterCache {
    
    @scala.inline
    def apply(colMax: js.Array[_], normalized: js.Array[_]): TablesorterCache = {
      val __obj = js.Dynamic.literal(colMax = colMax.asInstanceOf[js.Any], normalized = normalized.asInstanceOf[js.Any])
      __obj.asInstanceOf[TablesorterCache]
    }
    
    @scala.inline
    implicit class TablesorterCacheMutableBuilder[Self <: TablesorterCache] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColMax(value: js.Array[_]): Self = StObject.set(x, "colMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColMaxVarargs(value: js.Any*): Self = StObject.set(x, "colMax", js.Array(value :_*))
      
      @scala.inline
      def setNormalized(value: js.Array[_]): Self = StObject.set(x, "normalized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizedVarargs(value: js.Any*): Self = StObject.set(x, "normalized", js.Array(value :_*))
    }
  }
}
