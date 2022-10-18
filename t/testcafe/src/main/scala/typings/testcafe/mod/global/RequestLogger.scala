package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestLogger
  extends StObject
     with RequestHook {
  
  /**
    * Clears all logged requests.
    */
  def clear(): Unit
  
  /**
    * Returns whether the logger contains a request that matches the predicate.
    * @param predicate - The predicate
    */
  def contains(predicate: js.Function1[/* request */ LoggedRequest, Boolean]): js.Promise[Boolean]
  
  /**
    * Returns the number of requests that match the predicate.
    * @param predicate - The predicate
    */
  def count(predicate: js.Function1[/* request */ LoggedRequest, Boolean]): js.Promise[Double]
  
  /**
    * Returns an array of logged requests.
    */
  var requests: js.Array[LoggedRequest]
}
object RequestLogger {
  
  @JSGlobal("RequestLogger")
  @js.native
  val ^ : RequestLoggerFactory = js.native
  
  extension [Self <: RequestLogger](x: Self) {
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setContains(value: js.Function1[/* request */ LoggedRequest, Boolean] => js.Promise[Boolean]): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    inline def setCount(value: js.Function1[/* request */ LoggedRequest, Boolean] => js.Promise[Double]): Self = StObject.set(x, "count", js.Any.fromFunction1(value))
    
    inline def setRequests(value: js.Array[LoggedRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsVarargs(value: LoggedRequest*): Self = StObject.set(x, "requests", js.Array(value*))
  }
}
