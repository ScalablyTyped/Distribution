package typings.stripeV3.stripe

import typings.stripeV3.stripeV3Strings.accepted
import typings.stripeV3.stripeV3Strings.offline
import typings.stripeV3.stripeV3Strings.online
import typings.stripeV3.stripeV3Strings.refused
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceMandateAcceptance extends StObject {
  
  var date: Double
  
  var ip: js.UndefOr[String] = js.undefined
  
  var offline: js.UndefOr[OfflineAcceptanceMandate] = js.undefined
  
  var online: js.UndefOr[OnlineAcceptanceMandate] = js.undefined
  
  var status: accepted | refused
  
  var `type`: js.UndefOr[online | offline] = js.undefined
  
  var user_agent: js.UndefOr[String] = js.undefined
}
object SourceMandateAcceptance {
  
  @scala.inline
  def apply(date: Double, status: accepted | refused): SourceMandateAcceptance = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMandateAcceptance]
  }
  
  @scala.inline
  implicit class SourceMandateAcceptanceMutableBuilder[Self <: SourceMandateAcceptance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
    
    @scala.inline
    def setOffline(value: OfflineAcceptanceMandate): Self = StObject.set(x, "offline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfflineUndefined: Self = StObject.set(x, "offline", js.undefined)
    
    @scala.inline
    def setOnline(value: OnlineAcceptanceMandate): Self = StObject.set(x, "online", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlineUndefined: Self = StObject.set(x, "online", js.undefined)
    
    @scala.inline
    def setStatus(value: accepted | refused): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: online | offline): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUser_agent(value: String): Self = StObject.set(x, "user_agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_agentUndefined: Self = StObject.set(x, "user_agent", js.undefined)
  }
}
