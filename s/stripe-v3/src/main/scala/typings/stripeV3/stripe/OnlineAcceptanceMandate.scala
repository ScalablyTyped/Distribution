package typings.stripeV3.stripe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnlineAcceptanceMandate extends StObject {
  
  var date: Double
  
  var ip: String
  
  var user_agent: String
}
object OnlineAcceptanceMandate {
  
  inline def apply(date: Double, ip: String, user_agent: String): OnlineAcceptanceMandate = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], user_agent = user_agent.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnlineAcceptanceMandate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnlineAcceptanceMandate] (val x: Self) extends AnyVal {
    
    inline def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setUser_agent(value: String): Self = StObject.set(x, "user_agent", value.asInstanceOf[js.Any])
  }
}
