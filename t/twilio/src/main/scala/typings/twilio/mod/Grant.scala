package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Grant extends StObject {
  
  def toPayload(): GrantPayload
}
object Grant {
  
  inline def apply(toPayload: () => GrantPayload): Grant = {
    val __obj = js.Dynamic.literal(toPayload = js.Any.fromFunction0(toPayload))
    __obj.asInstanceOf[Grant]
  }
  
  extension [Self <: Grant](x: Self) {
    
    inline def setToPayload(value: () => GrantPayload): Self = StObject.set(x, "toPayload", js.Any.fromFunction0(value))
  }
}
