package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckInterval extends StObject {
  
  /**
    * How often to run resource timeout checks. (default=0, disabled)
    */
  val checkInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * Idle timeout
    */
  val idleTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Max number of connections.
    */
  val max: js.UndefOr[Double] = js.undefined
  
  /**
    * Maximum number of waiting requests allowed. (default=0, no limit).
    */
  val maxWaitingRequests: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimum number of connections.
    */
  val min: js.UndefOr[Double] = js.undefined
  
  /**
    * Function handling errors thrown by drivers pool.
    * Defaults to logging error with `warn` level.
    */
  val poolErrorHandler: js.UndefOr[js.Function1[/* err */ js.Any, js.Any]] = js.undefined
  
  /**
    * Max milliseconds a request will wait for a resource before timing out. (default=5000)
    */
  val requestTimeout: js.UndefOr[Double] = js.undefined
}
object CheckInterval {
  
  inline def apply(): CheckInterval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckInterval]
  }
  
  extension [Self <: CheckInterval](x: Self) {
    
    inline def setCheckInterval(value: Double): Self = StObject.set(x, "checkInterval", value.asInstanceOf[js.Any])
    
    inline def setCheckIntervalUndefined: Self = StObject.set(x, "checkInterval", js.undefined)
    
    inline def setIdleTimeout(value: Double): Self = StObject.set(x, "idleTimeout", value.asInstanceOf[js.Any])
    
    inline def setIdleTimeoutUndefined: Self = StObject.set(x, "idleTimeout", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMaxWaitingRequests(value: Double): Self = StObject.set(x, "maxWaitingRequests", value.asInstanceOf[js.Any])
    
    inline def setMaxWaitingRequestsUndefined: Self = StObject.set(x, "maxWaitingRequests", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setPoolErrorHandler(value: /* err */ js.Any => js.Any): Self = StObject.set(x, "poolErrorHandler", js.Any.fromFunction1(value))
    
    inline def setPoolErrorHandlerUndefined: Self = StObject.set(x, "poolErrorHandler", js.undefined)
    
    inline def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
    
    inline def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
  }
}
