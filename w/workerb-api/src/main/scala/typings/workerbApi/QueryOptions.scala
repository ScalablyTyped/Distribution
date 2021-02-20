package typings.workerbApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryOptions extends StObject {
  
  /**
    *  A number number which specifies how many times the script runner will try to find the target element. The default value is 10.
    */
  var numberOfTries: js.UndefOr[Double] = js.native
  
  /**
    *  A number which specifies after how many milliseconds the runtime will try to find the target element. The default value is 200.
    */
  var retryDuration: js.UndefOr[Double] = js.native
}
object QueryOptions {
  
  @scala.inline
  def apply(): QueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryOptions]
  }
  
  @scala.inline
  implicit class QueryOptionsMutableBuilder[Self <: QueryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumberOfTries(value: Double): Self = StObject.set(x, "numberOfTries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfTriesUndefined: Self = StObject.set(x, "numberOfTries", js.undefined)
    
    @scala.inline
    def setRetryDuration(value: Double): Self = StObject.set(x, "retryDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryDurationUndefined: Self = StObject.set(x, "retryDuration", js.undefined)
  }
}
