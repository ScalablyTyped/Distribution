package typings.twilioChat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberLinks extends StObject {
  
  var self: String
}
object MemberLinks {
  
  inline def apply(self: String): MemberLinks = {
    val __obj = js.Dynamic.literal(self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberLinks]
  }
  
  extension [Self <: MemberLinks](x: Self) {
    
    inline def setSelf(value: String): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
  }
}
