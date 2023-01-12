package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The contents of the tables extracted from a document. */
trait Tables extends StObject {
  
  /** An array of cells that are neither table header nor column header nor row header cells, of the current table with corresponding row and column header associations. */
  var body_cells: js.UndefOr[js.Array[BodyCells]] = js.undefined
  
  /** An array of column-level cells, each applicable as a header to other cells in the same column as itself, of the current table. */
  var column_headers: js.UndefOr[js.Array[ColumnHeaders]] = js.undefined
  
  /** An array of key-value pairs identified in the current table. */
  var key_value_pairs: js.UndefOr[js.Array[KeyValuePair]] = js.undefined
  
  /** The numeric location of the identified element in the document, represented with two integers labeled `begin` and `end`. */
  var location: js.UndefOr[Location] = js.undefined
  
  /** An array of row-level cells, each applicable as a header to other cells in the same row as itself, of the current table. */
  var row_headers: js.UndefOr[js.Array[RowHeaders]] = js.undefined
  
  /** The table's section title, if identified. */
  var section_title: js.UndefOr[SectionTitle] = js.undefined
  
  /** An array of table-level cells that apply as headers to all the other cells in the current table. */
  var table_headers: js.UndefOr[js.Array[TableHeaders]] = js.undefined
  
  /** The textual contents of the current table from the input document without associated markup content. */
  var text: js.UndefOr[String] = js.undefined
}
object Tables {
  
  inline def apply(): Tables = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tables]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tables] (val x: Self) extends AnyVal {
    
    inline def setBody_cells(value: js.Array[BodyCells]): Self = StObject.set(x, "body_cells", value.asInstanceOf[js.Any])
    
    inline def setBody_cellsUndefined: Self = StObject.set(x, "body_cells", js.undefined)
    
    inline def setBody_cellsVarargs(value: BodyCells*): Self = StObject.set(x, "body_cells", js.Array(value*))
    
    inline def setColumn_headers(value: js.Array[ColumnHeaders]): Self = StObject.set(x, "column_headers", value.asInstanceOf[js.Any])
    
    inline def setColumn_headersUndefined: Self = StObject.set(x, "column_headers", js.undefined)
    
    inline def setColumn_headersVarargs(value: ColumnHeaders*): Self = StObject.set(x, "column_headers", js.Array(value*))
    
    inline def setKey_value_pairs(value: js.Array[KeyValuePair]): Self = StObject.set(x, "key_value_pairs", value.asInstanceOf[js.Any])
    
    inline def setKey_value_pairsUndefined: Self = StObject.set(x, "key_value_pairs", js.undefined)
    
    inline def setKey_value_pairsVarargs(value: KeyValuePair*): Self = StObject.set(x, "key_value_pairs", js.Array(value*))
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setRow_headers(value: js.Array[RowHeaders]): Self = StObject.set(x, "row_headers", value.asInstanceOf[js.Any])
    
    inline def setRow_headersUndefined: Self = StObject.set(x, "row_headers", js.undefined)
    
    inline def setRow_headersVarargs(value: RowHeaders*): Self = StObject.set(x, "row_headers", js.Array(value*))
    
    inline def setSection_title(value: SectionTitle): Self = StObject.set(x, "section_title", value.asInstanceOf[js.Any])
    
    inline def setSection_titleUndefined: Self = StObject.set(x, "section_title", js.undefined)
    
    inline def setTable_headers(value: js.Array[TableHeaders]): Self = StObject.set(x, "table_headers", value.asInstanceOf[js.Any])
    
    inline def setTable_headersUndefined: Self = StObject.set(x, "table_headers", js.undefined)
    
    inline def setTable_headersVarargs(value: TableHeaders*): Self = StObject.set(x, "table_headers", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
