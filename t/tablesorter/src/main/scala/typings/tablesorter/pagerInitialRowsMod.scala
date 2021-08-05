package typings.tablesorter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pagerInitialRowsMod {
  
  trait PagerInitialRows extends StObject {
    
    /**
      * The filtered number of rows.
      */
    var filtered: js.UndefOr[Double] = js.undefined
    
    /**
      * The total number of rows.
      */
    var total: js.UndefOr[Double] = js.undefined
  }
  object PagerInitialRows {
    
    inline def apply(): PagerInitialRows = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PagerInitialRows]
    }
    
    extension [Self <: PagerInitialRows](x: Self) {
      
      inline def setFiltered(value: Double): Self = StObject.set(x, "filtered", value.asInstanceOf[js.Any])
      
      inline def setFilteredUndefined: Self = StObject.set(x, "filtered", js.undefined)
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
}
