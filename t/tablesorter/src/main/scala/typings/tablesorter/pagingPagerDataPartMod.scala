package typings.tablesorter

import typings.tablesorter.mod.global.HTMLElement
import typings.tablesorter.mod.global.JQuery
import typings.tablesorter.pagingPagerOutputProcessorMod.PagerOutputProcessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pagingPagerDataPartMod {
  
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
    var rows: js.UndefOr[js.Array[js.Array[Any]] | JQuery[HTMLElement]] = js.undefined
    
    /**
      * The number of total rows.
      */
    var total: Double
  }
  object PagerDataPart {
    
    inline def apply[TElement](total: Double): PagerDataPart[TElement] = {
      val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[PagerDataPart[TElement]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PagerDataPart[?], TElement] (val x: Self & PagerDataPart[TElement]) extends AnyVal {
      
      inline def setFilteredRows(value: Double): Self = StObject.set(x, "filteredRows", value.asInstanceOf[js.Any])
      
      inline def setFilteredRowsUndefined: Self = StObject.set(x, "filteredRows", js.undefined)
      
      inline def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setOutput(value: String | PagerOutputProcessor[TElement]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputFunction2(value: (TElement, /* pager */ Any) => String): Self = StObject.set(x, "output", js.Any.fromFunction2(value))
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setRows(value: js.Array[js.Array[Any]] | JQuery[HTMLElement]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setRowsVarargs(value: js.Array[Any]*): Self = StObject.set(x, "rows", js.Array(value*))
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
}
