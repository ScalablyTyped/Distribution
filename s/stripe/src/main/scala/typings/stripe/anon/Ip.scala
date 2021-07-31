package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ip extends StObject {
  
  var date: Double
  
  var ip: String
  
  var user_agent: String
}
object Ip {
  
  @scala.inline
  def apply(date: Double, ip: String, user_agent: String): Ip = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], user_agent = user_agent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ip]
  }
  
  @scala.inline
  implicit class IpMutableBuilder[Self <: Ip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_agent(value: String): Self = StObject.set(x, "user_agent", value.asInstanceOf[js.Any])
  }
}
