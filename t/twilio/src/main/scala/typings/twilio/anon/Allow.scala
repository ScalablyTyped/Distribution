package typings.twilio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Allow extends StObject {
  
  var allow: Boolean
}
object Allow {
  
  inline def apply(allow: Boolean): Allow = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Allow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Allow] (val x: Self) extends AnyVal {
    
    inline def setAllow(value: Boolean): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
  }
}
