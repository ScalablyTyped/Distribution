package typings.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateNFOption extends StObject {
  
  /** Use specified date format */
  var dateNF: js.UndefOr[NumberFormat] = js.undefined
}
object DateNFOption {
  
  inline def apply(): DateNFOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateNFOption]
  }
  
  extension [Self <: DateNFOption](x: Self) {
    
    inline def setDateNF(value: NumberFormat): Self = StObject.set(x, "dateNF", value.asInstanceOf[js.Any])
    
    inline def setDateNFUndefined: Self = StObject.set(x, "dateNF", js.undefined)
  }
}
