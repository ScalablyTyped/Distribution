package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckInterval extends StObject {
  
  /**
    * How often to run resource timeout checks. (default=0, disabled)
    */
  val checkInterval: js.UndefOr[Double] = js.native
  
  /**
    * Idle timeout
    */
  val idleTimeout: js.UndefOr[Double] = js.native
  
  /**
    * Max number of connections.
    */
  val max: js.UndefOr[Double] = js.native
  
  /**
    * Maximum number of waiting requests allowed. (default=0, no limit).
    */
  val maxWaitingRequests: js.UndefOr[Double] = js.native
  
  /**
    * Minimum number of connections.
    */
  val min: js.UndefOr[Double] = js.native
  
  /**
    * Function handling errors thrown by drivers pool.
    * Defaults to logging error with `warn` level.
    */
  val poolErrorHandler: js.UndefOr[js.Function1[/* err */ js.Any, _]] = js.native
  
  /**
    * Max milliseconds a request will wait for a resource before timing out. (default=5000)
    */
  val requestTimeout: js.UndefOr[Double] = js.native
}
object CheckInterval {
  
  @scala.inline
  def apply(): CheckInterval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckInterval]
  }
  
  @scala.inline
  implicit class CheckIntervalMutableBuilder[Self <: CheckInterval] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckInterval(value: Double): Self = StObject.set(x, "checkInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckIntervalUndefined: Self = StObject.set(x, "checkInterval", js.undefined)
    
    @scala.inline
    def setIdleTimeout(value: Double): Self = StObject.set(x, "idleTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleTimeoutUndefined: Self = StObject.set(x, "idleTimeout", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMaxWaitingRequests(value: Double): Self = StObject.set(x, "maxWaitingRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWaitingRequestsUndefined: Self = StObject.set(x, "maxWaitingRequests", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setPoolErrorHandler(value: /* err */ js.Any => _): Self = StObject.set(x, "poolErrorHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPoolErrorHandlerUndefined: Self = StObject.set(x, "poolErrorHandler", js.undefined)
    
    @scala.inline
    def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
  }
}
