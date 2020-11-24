package typings.typeorm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckInterval extends js.Object {
  
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
  implicit class CheckIntervalOps[Self <: CheckInterval] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCheckInterval(value: Double): Self = this.set("checkInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckInterval: Self = this.set("checkInterval", js.undefined)
    
    @scala.inline
    def setIdleTimeout(value: Double): Self = this.set("idleTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdleTimeout: Self = this.set("idleTimeout", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMaxWaitingRequests(value: Double): Self = this.set("maxWaitingRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWaitingRequests: Self = this.set("maxWaitingRequests", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setPoolErrorHandler(value: /* err */ js.Any => _): Self = this.set("poolErrorHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePoolErrorHandler: Self = this.set("poolErrorHandler", js.undefined)
    
    @scala.inline
    def setRequestTimeout(value: Double): Self = this.set("requestTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestTimeout: Self = this.set("requestTimeout", js.undefined)
  }
}
