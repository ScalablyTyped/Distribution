package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateVal extends StObject {
  
  var dateVal: Any
}
object DateVal {
  
  inline def apply(dateVal: Any): DateVal = {
    val __obj = js.Dynamic.literal(dateVal = dateVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateVal]
  }
  
  extension [Self <: DateVal](x: Self) {
    
    inline def setDateVal(value: Any): Self = StObject.set(x, "dateVal", value.asInstanceOf[js.Any])
  }
}
