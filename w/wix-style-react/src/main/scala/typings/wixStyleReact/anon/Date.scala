package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Date extends StObject {
  
  var date: js.Date
  
  var isSelected: Boolean
}
object Date {
  
  inline def apply(date: js.Date, isSelected: Boolean): Date = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
  
  extension [Self <: Date](x: Self) {
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
  }
}
