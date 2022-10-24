package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromTo extends StObject {
  
  var from: js.UndefOr[String | js.Date] = js.undefined
  
  var to: js.UndefOr[String | js.Date] = js.undefined
}
object FromTo {
  
  inline def apply(): FromTo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FromTo]
  }
  
  extension [Self <: FromTo](x: Self) {
    
    inline def setFrom(value: String | js.Date): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setTo(value: String | js.Date): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
