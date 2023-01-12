package typings.tabulatorTables.mod

import typings.tabulatorTables.tabulatorTablesStrings.avg
import typings.tabulatorTables.tabulatorTablesStrings.bottom
import typings.tabulatorTables.tabulatorTablesStrings.length
import typings.tabulatorTables.tabulatorTablesStrings.max
import typings.tabulatorTables.tabulatorTablesStrings.min
import typings.tabulatorTables.tabulatorTablesStrings.sum
import typings.tabulatorTables.tabulatorTablesStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnDefinitionSorterParams extends StObject {
  
  var alignEmptyValues: js.UndefOr[top | bottom] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var locale: js.UndefOr[String | Boolean] = js.undefined
  
  var `type`: js.UndefOr[length | sum | max | min | avg] = js.undefined
}
object ColumnDefinitionSorterParams {
  
  inline def apply(): ColumnDefinitionSorterParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnDefinitionSorterParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnDefinitionSorterParams] (val x: Self) extends AnyVal {
    
    inline def setAlignEmptyValues(value: top | bottom): Self = StObject.set(x, "alignEmptyValues", value.asInstanceOf[js.Any])
    
    inline def setAlignEmptyValuesUndefined: Self = StObject.set(x, "alignEmptyValues", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setLocale(value: String | Boolean): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setType(value: length | sum | max | min | avg): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
