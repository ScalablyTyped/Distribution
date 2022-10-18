package typings.twilioChat.mod

import typings.twilioChat.anon.Conversations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Configuration extends StObject {
  
  val backoffConfiguration: BackoffConfiguration
  
  val consumptionReportInterval: Double
  
  val httpCacheInterval: Double
  
  val links: Conversations
  
  val myConversations: String
  
  val productId: js.UndefOr[String] = js.undefined
  
  val reachabilityEnabled: Boolean
  
  val retryWhenThrottled: Boolean
  
  val typingIndicatorTimeoutDefault: Double
  
  val typingIndicatorTimeoutOverride: js.UndefOr[Double] = js.undefined
  
  val userIdentity: String
  
  val userInfo: String
  
  val userInfosToSubscribe: Double
}
object Configuration {
  
  inline def apply(
    backoffConfiguration: BackoffConfiguration,
    consumptionReportInterval: Double,
    httpCacheInterval: Double,
    links: Conversations,
    myConversations: String,
    reachabilityEnabled: Boolean,
    retryWhenThrottled: Boolean,
    typingIndicatorTimeoutDefault: Double,
    userIdentity: String,
    userInfo: String,
    userInfosToSubscribe: Double
  ): Configuration = {
    val __obj = js.Dynamic.literal(backoffConfiguration = backoffConfiguration.asInstanceOf[js.Any], consumptionReportInterval = consumptionReportInterval.asInstanceOf[js.Any], httpCacheInterval = httpCacheInterval.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], myConversations = myConversations.asInstanceOf[js.Any], reachabilityEnabled = reachabilityEnabled.asInstanceOf[js.Any], retryWhenThrottled = retryWhenThrottled.asInstanceOf[js.Any], typingIndicatorTimeoutDefault = typingIndicatorTimeoutDefault.asInstanceOf[js.Any], userIdentity = userIdentity.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any], userInfosToSubscribe = userInfosToSubscribe.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  
  extension [Self <: Configuration](x: Self) {
    
    inline def setBackoffConfiguration(value: BackoffConfiguration): Self = StObject.set(x, "backoffConfiguration", value.asInstanceOf[js.Any])
    
    inline def setConsumptionReportInterval(value: Double): Self = StObject.set(x, "consumptionReportInterval", value.asInstanceOf[js.Any])
    
    inline def setHttpCacheInterval(value: Double): Self = StObject.set(x, "httpCacheInterval", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: Conversations): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMyConversations(value: String): Self = StObject.set(x, "myConversations", value.asInstanceOf[js.Any])
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setReachabilityEnabled(value: Boolean): Self = StObject.set(x, "reachabilityEnabled", value.asInstanceOf[js.Any])
    
    inline def setRetryWhenThrottled(value: Boolean): Self = StObject.set(x, "retryWhenThrottled", value.asInstanceOf[js.Any])
    
    inline def setTypingIndicatorTimeoutDefault(value: Double): Self = StObject.set(x, "typingIndicatorTimeoutDefault", value.asInstanceOf[js.Any])
    
    inline def setTypingIndicatorTimeoutOverride(value: Double): Self = StObject.set(x, "typingIndicatorTimeoutOverride", value.asInstanceOf[js.Any])
    
    inline def setTypingIndicatorTimeoutOverrideUndefined: Self = StObject.set(x, "typingIndicatorTimeoutOverride", js.undefined)
    
    inline def setUserIdentity(value: String): Self = StObject.set(x, "userIdentity", value.asInstanceOf[js.Any])
    
    inline def setUserInfo(value: String): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
    
    inline def setUserInfosToSubscribe(value: Double): Self = StObject.set(x, "userInfosToSubscribe", value.asInstanceOf[js.Any])
  }
}
