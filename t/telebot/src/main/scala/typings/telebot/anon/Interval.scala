package typings.telebot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interval extends StObject {
  
  // Optional. Use polling.
  var interval: js.UndefOr[Double] = js.undefined
  
  // Optional. Update polling timeout (0 - short polling).
  var limit: js.UndefOr[Double] = js.undefined
  
  // Optional. Reconnecting timeout (in ms).
  var proxy: js.UndefOr[String] = js.undefined
  
  // Optional. Limits the number of updates to be retrieved.
  var retryTimeout: js.UndefOr[Double] = js.undefined
  
  // Optional. How often check updates (in ms).
  var timeout: js.UndefOr[Double] = js.undefined
}
object Interval {
  
  @scala.inline
  def apply(): Interval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Interval]
  }
  
  @scala.inline
  implicit class IntervalMutableBuilder[Self <: Interval] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    @scala.inline
    def setRetryTimeout(value: Double): Self = StObject.set(x, "retryTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryTimeoutUndefined: Self = StObject.set(x, "retryTimeout", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
