package typings.twilioChat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-chat/lib/configuration", JSImport.Namespace)
@js.native
object configurationMod extends js.Object {
  
  @js.native
  class Configuration protected () extends js.Object {
    def this(options: js.Any) = this()
    
    def backoffConfigDefault: js.Any = js.native
    
    val backoffConfigOverride: js.UndefOr[js.Any] = js.native
    
    var baseUrl: js.Any = js.native
    
    def consumptionReportIntervalDefault: String = js.native
    
    val consumptionReportIntervalOverride: js.UndefOr[Double] = js.native
    
    def httpCacheIntervalDefault: String = js.native
    
    val httpCacheIntervalOverride: js.UndefOr[String] = js.native
    
    var region: js.Any = js.native
    
    def retryWhenThrottledDefault: Boolean = js.native
    
    val retryWhenThrottledOverride: js.UndefOr[Boolean] = js.native
    
    var token: String = js.native
    
    def typingIndicatorTimeoutDefault: Double = js.native
    
    val typingIndicatorTimeoutOverride: js.UndefOr[Double] = js.native
    
    val typingIndicatorUri: String = js.native
    
    def userInfosToSubscribeDefault: Double = js.native
    
    val userInfosToSubscribeOverride: js.UndefOr[Double] = js.native
  }
}
