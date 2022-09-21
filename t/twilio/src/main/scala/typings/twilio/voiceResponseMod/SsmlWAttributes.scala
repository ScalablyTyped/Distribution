package typings.twilio.voiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SsmlWAttributes extends StObject {
  
  var role: js.UndefOr[String] = js.undefined
}
object SsmlWAttributes {
  
  inline def apply(): SsmlWAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SsmlWAttributes]
  }
  
  extension [Self <: SsmlWAttributes](x: Self) {
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
