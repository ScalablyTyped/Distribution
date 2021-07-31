package typings.tablesorter

import typings.tablesorter.mod.global.HTMLElement
import typings.tablesorter.mod.global.JQuery
import typings.tablesorter.pagerOutputProcessorMod.PagerOutputProcessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pagerDataPartMod {
  
  trait PagerDataPart[TElement] extends StObject {
    
    /**
      * The number of filtered rows.
      */
    var filteredRows: js.UndefOr[Double] = js.undefined
    
    /**
      * The column-names of the table.
      */
    var headers: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The output to display in the output-area.
      *
      * Following portions of text are substituted:
      *
      * | Tag                | Replacement                                  |
      * |--------------------|----------------------------------------------|
      * | `{size}`           | The current page size.                       |
      * | `{page}`           | The current page.                            |
      * | `{page:input}`     | The page inputted by the user.               |
      * | `{totalPages}`     | The total amount of pages.                   |
      * | `{filteredPages}`  | The filtered number of pages.                |
      * | `{startRow}`       | The number of the first row being displayed. |
      * | `{startRow:input}` | The start-row inputted by the user.          |
      * | `{endRow}`         | The number of the last row being displayed.  |
      * | `{filteredRows}`   | The amount of filtered rows.                 |
      * | `{totalRows}`      | The total amount of rows.                    |
      */
    var output: js.UndefOr[String | PagerOutputProcessor[TElement]] = js.undefined
    
    /**
      * The data to show.
      */
    var rows: js.UndefOr[js.Array[js.Array[js.Any]] | JQuery[HTMLElement]] = js.undefined
    
    /**
      * The number of total rows.
      */
    var total: Double
  }
  object PagerDataPart {
    
    @scala.inline
    def apply[TElement](total: Double): PagerDataPart[TElement] = {
      val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[PagerDataPart[TElement]]
    }
    
    @scala.inline
    implicit class PagerDataPartMutableBuilder[Self <: PagerDataPart[?], TElement] (val x: Self & PagerDataPart[TElement]) extends AnyVal {
      
      @scala.inline
      def setFilteredRows(value: Double): Self = StObject.set(x, "filteredRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilteredRowsUndefined: Self = StObject.set(x, "filteredRows", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setOutput(value: String | PagerOutputProcessor[TElement]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputFunction2(value: (TElement, /* pager */ js.Any) => String): Self = StObject.set(x, "output", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      @scala.inline
      def setRows(value: js.Array[js.Array[js.Any]] | JQuery[HTMLElement]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setRowsVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "rows", js.Array(value :_*))
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
}
