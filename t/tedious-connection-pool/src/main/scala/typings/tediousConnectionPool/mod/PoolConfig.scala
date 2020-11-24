package typings.tediousConnectionPool.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *  Pool Configuration interface
  */
@js.native
trait PoolConfig extends js.Object {
  
  /**
    * Acquire timeout
    */
  var acquireTimeout: js.UndefOr[Double] = js.native
  
  /**
    * Idle timeout
    */
  var idleTimeout: js.UndefOr[Double] = js.native
  
  /**
    * Defines if logging is activated
    */
  var log: js.UndefOr[Boolean] = js.native
  
  /**
    * Maximum concurrent connections
    */
  var max: js.UndefOr[Double] = js.native
  
  /**
    * Minimum concurrent connections
    */
  var min: js.UndefOr[Double] = js.native
  
  /**
    * Retry delay
    */
  var retryDelay: js.UndefOr[Double] = js.native
}
object PoolConfig {
  
  @scala.inline
  def apply(): PoolConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoolConfig]
  }
  
  @scala.inline
  implicit class PoolConfigOps[Self <: PoolConfig] (val x: Self) extends AnyVal {
    
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
    def setAcquireTimeout(value: Double): Self = this.set("acquireTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcquireTimeout: Self = this.set("acquireTimeout", js.undefined)
    
    @scala.inline
    def setIdleTimeout(value: Double): Self = this.set("idleTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdleTimeout: Self = this.set("idleTimeout", js.undefined)
    
    @scala.inline
    def setLog(value: Boolean): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setRetryDelay(value: Double): Self = this.set("retryDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryDelay: Self = this.set("retryDelay", js.undefined)
  }
}
