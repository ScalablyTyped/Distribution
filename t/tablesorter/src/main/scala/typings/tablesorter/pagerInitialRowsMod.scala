package typings.tablesorter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pagerInitialRowsMod {
  
  @js.native
  trait PagerInitialRows extends StObject {
    
    /**
      * The filtered number of rows.
      */
    var filtered: js.UndefOr[Double] = js.native
    
    /**
      * The total number of rows.
      */
    var total: js.UndefOr[Double] = js.native
  }
  object PagerInitialRows {
    
    @scala.inline
    def apply(): PagerInitialRows = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PagerInitialRows]
    }
    
    @scala.inline
    implicit class PagerInitialRowsMutableBuilder[Self <: PagerInitialRows] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFiltered(value: Double): Self = StObject.set(x, "filtered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilteredUndefined: Self = StObject.set(x, "filtered", js.undefined)
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
}
