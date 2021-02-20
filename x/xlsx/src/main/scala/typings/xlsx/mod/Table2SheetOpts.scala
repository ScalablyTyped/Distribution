package typings.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Table2SheetOpts
  extends CommonOptions
     with DateNFOption {
  
  /** If true, hidden rows and cells will not be parsed */
  var display: js.UndefOr[Boolean] = js.native
  
  /** If true, plaintext parsing will not parse values */
  var raw: js.UndefOr[Boolean] = js.native
  
  /**
    * If >0, read the first sheetRows rows
    * @default 0
    */
  var sheetRows: js.UndefOr[Double] = js.native
}
object Table2SheetOpts {
  
  @scala.inline
  def apply(): Table2SheetOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Table2SheetOpts]
  }
  
  @scala.inline
  implicit class Table2SheetOptsMutableBuilder[Self <: Table2SheetOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    @scala.inline
    def setSheetRows(value: Double): Self = StObject.set(x, "sheetRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetRowsUndefined: Self = StObject.set(x, "sheetRows", js.undefined)
  }
}
