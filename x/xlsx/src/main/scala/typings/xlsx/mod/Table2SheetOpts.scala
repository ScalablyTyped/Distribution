package typings.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Table2SheetOpts
  extends StObject
     with CommonOptions
     with DateNFOption
     with OriginOption
     with SheetOption {
  
  /** If true, hidden rows and cells will not be parsed */
  var display: js.UndefOr[Boolean] = js.undefined
  
  /** If true, plaintext parsing will not parse values */
  var raw: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If >0, read the first sheetRows rows
    * @default 0
    */
  var sheetRows: js.UndefOr[Double] = js.undefined
}
object Table2SheetOpts {
  
  inline def apply(): Table2SheetOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Table2SheetOpts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Table2SheetOpts] (val x: Self) extends AnyVal {
    
    inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setSheetRows(value: Double): Self = StObject.set(x, "sheetRows", value.asInstanceOf[js.Any])
    
    inline def setSheetRowsUndefined: Self = StObject.set(x, "sheetRows", js.undefined)
  }
}
