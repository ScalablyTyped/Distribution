package typings.twilio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait To extends StObject {
  
  var to: js.UndefOr[String] = js.undefined
}
object To {
  
  inline def apply(): To = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[To]
  }
  
  extension [Self <: To](x: Self) {
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
