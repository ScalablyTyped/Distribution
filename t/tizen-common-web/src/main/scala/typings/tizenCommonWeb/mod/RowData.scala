package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowData extends StObject {
  
  /**
    * An attribute to hold column names to select, update, and insert.
    */
  var columns: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * An attribute to hold values of columns to select, update, and insert.
    */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object RowData {
  
  inline def apply(): RowData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowData]
  }
  
  extension [Self <: RowData](x: Self) {
    
    inline def setColumns(value: js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
