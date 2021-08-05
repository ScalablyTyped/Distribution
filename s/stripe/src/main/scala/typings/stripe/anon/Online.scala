package typings.stripe.anon

import typings.stripe.stripeStrings.accepted
import typings.stripe.stripeStrings.offline
import typings.stripe.stripeStrings.online
import typings.stripe.stripeStrings.refused
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Online extends StObject {
  
  var date: js.UndefOr[Double] = js.undefined
  
  var ip: js.UndefOr[String] = js.undefined
  
  var offline: js.UndefOr[Contactemail] = js.undefined
  
  var online: js.UndefOr[Useragent] = js.undefined
  
  var status: accepted | refused
  
  var `type`: online | offline
  
  var user_agent: js.UndefOr[String] = js.undefined
}
object Online {
  
  inline def apply(status: accepted | refused, `type`: online | offline): Online = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Online]
  }
  
  extension [Self <: Online](x: Self) {
    
    inline def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
    
    inline def setOffline(value: Contactemail): Self = StObject.set(x, "offline", value.asInstanceOf[js.Any])
    
    inline def setOfflineUndefined: Self = StObject.set(x, "offline", js.undefined)
    
    inline def setOnline(value: Useragent): Self = StObject.set(x, "online", value.asInstanceOf[js.Any])
    
    inline def setOnlineUndefined: Self = StObject.set(x, "online", js.undefined)
    
    inline def setStatus(value: accepted | refused): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: online | offline): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUser_agent(value: String): Self = StObject.set(x, "user_agent", value.asInstanceOf[js.Any])
    
    inline def setUser_agentUndefined: Self = StObject.set(x, "user_agent", js.undefined)
  }
}
