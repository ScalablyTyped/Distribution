package typings.tabulatorTables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowSelectionParams
  extends StObject
     with _FormatterParams {
  
  var rowRange: js.UndefOr[RowRangeLookup] = js.undefined
}
object RowSelectionParams {
  
  inline def apply(): RowSelectionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowSelectionParams]
  }
  
  extension [Self <: RowSelectionParams](x: Self) {
    
    inline def setRowRange(value: RowRangeLookup): Self = StObject.set(x, "rowRange", value.asInstanceOf[js.Any])
    
    inline def setRowRangeUndefined: Self = StObject.set(x, "rowRange", js.undefined)
  }
}
