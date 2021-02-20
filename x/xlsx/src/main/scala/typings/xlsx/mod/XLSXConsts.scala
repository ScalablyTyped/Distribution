package typings.xlsx.mod

import typings.xlsx.xlsxNumbers.`0`
import typings.xlsx.xlsxNumbers.`1`
import typings.xlsx.xlsxNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XLSXConsts extends StObject {
  
  /** Visibility: Hidden */
  var SHEET_HIDDEN: `1` = js.native
  
  /** Visibility: Very Hidden */
  var SHEET_VERYHIDDEN: `2` = js.native
  
  /* --- Sheet Visibility --- */
  /** Visibility: Visible */
  var SHEET_VISIBLE: `0` = js.native
}
object XLSXConsts {
  
  @scala.inline
  def apply(SHEET_HIDDEN: `1`, SHEET_VERYHIDDEN: `2`, SHEET_VISIBLE: `0`): XLSXConsts = {
    val __obj = js.Dynamic.literal(SHEET_HIDDEN = SHEET_HIDDEN.asInstanceOf[js.Any], SHEET_VERYHIDDEN = SHEET_VERYHIDDEN.asInstanceOf[js.Any], SHEET_VISIBLE = SHEET_VISIBLE.asInstanceOf[js.Any])
    __obj.asInstanceOf[XLSXConsts]
  }
  
  @scala.inline
  implicit class XLSXConstsMutableBuilder[Self <: XLSXConsts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSHEET_HIDDEN(value: `1`): Self = StObject.set(x, "SHEET_HIDDEN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHEET_VERYHIDDEN(value: `2`): Self = StObject.set(x, "SHEET_VERYHIDDEN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHEET_VISIBLE(value: `0`): Self = StObject.set(x, "SHEET_VISIBLE", value.asInstanceOf[js.Any])
  }
}
