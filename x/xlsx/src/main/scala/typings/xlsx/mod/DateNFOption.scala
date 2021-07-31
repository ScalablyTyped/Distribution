package typings.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateNFOption extends StObject {
  
  /** Use specified date format */
  var dateNF: js.UndefOr[NumberFormat] = js.undefined
}
object DateNFOption {
  
  @scala.inline
  def apply(): DateNFOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateNFOption]
  }
  
  @scala.inline
  implicit class DateNFOptionMutableBuilder[Self <: DateNFOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateNF(value: NumberFormat): Self = StObject.set(x, "dateNF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateNFUndefined: Self = StObject.set(x, "dateNF", js.undefined)
  }
}
