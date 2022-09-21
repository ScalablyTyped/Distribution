package typings.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SheetOption extends StObject {
  
  /**
    * Name of Worksheet (for single-sheet formats)
    * @default ''
    */
  var sheet: js.UndefOr[String] = js.undefined
}
object SheetOption {
  
  inline def apply(): SheetOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetOption]
  }
  
  extension [Self <: SheetOption](x: Self) {
    
    inline def setSheet(value: String): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
    
    inline def setSheetUndefined: Self = StObject.set(x, "sheet", js.undefined)
  }
}
