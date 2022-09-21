package typings.twilio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Closed extends StObject {
  
  var closed: js.UndefOr[String] = js.undefined
  
  var inactive: js.UndefOr[String] = js.undefined
}
object Closed {
  
  inline def apply(): Closed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Closed]
  }
  
  extension [Self <: Closed](x: Self) {
    
    inline def setClosed(value: String): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    
    inline def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
    
    inline def setInactive(value: String): Self = StObject.set(x, "inactive", value.asInstanceOf[js.Any])
    
    inline def setInactiveUndefined: Self = StObject.set(x, "inactive", js.undefined)
  }
}
