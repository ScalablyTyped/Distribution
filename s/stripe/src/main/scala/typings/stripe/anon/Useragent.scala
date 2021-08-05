package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Useragent extends StObject {
  
  var date: js.UndefOr[Double] = js.undefined
  
  var ip: js.UndefOr[String] = js.undefined
  
  var user_agent: js.UndefOr[String] = js.undefined
}
object Useragent {
  
  inline def apply(): Useragent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Useragent]
  }
  
  extension [Self <: Useragent](x: Self) {
    
    inline def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
    
    inline def setUser_agent(value: String): Self = StObject.set(x, "user_agent", value.asInstanceOf[js.Any])
    
    inline def setUser_agentUndefined: Self = StObject.set(x, "user_agent", js.undefined)
  }
}
