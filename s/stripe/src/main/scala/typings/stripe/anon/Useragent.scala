package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Useragent extends StObject {
  
  var date: js.UndefOr[Double] = js.native
  
  var ip: js.UndefOr[String] = js.native
  
  var user_agent: js.UndefOr[String] = js.native
}
object Useragent {
  
  @scala.inline
  def apply(): Useragent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Useragent]
  }
  
  @scala.inline
  implicit class UseragentMutableBuilder[Self <: Useragent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
    
    @scala.inline
    def setUser_agent(value: String): Self = StObject.set(x, "user_agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_agentUndefined: Self = StObject.set(x, "user_agent", js.undefined)
  }
}
