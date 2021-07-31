package typings.web3CoreHelpers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReconnectOptions extends StObject {
  
  var auto: js.UndefOr[Boolean] = js.undefined
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var maxAttempts: js.UndefOr[Double] = js.undefined
  
  var onTimeout: js.UndefOr[Boolean] = js.undefined
}
object ReconnectOptions {
  
  @scala.inline
  def apply(): ReconnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReconnectOptions]
  }
  
  @scala.inline
  implicit class ReconnectOptionsMutableBuilder[Self <: ReconnectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setMaxAttempts(value: Double): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAttemptsUndefined: Self = StObject.set(x, "maxAttempts", js.undefined)
    
    @scala.inline
    def setOnTimeout(value: Boolean): Self = StObject.set(x, "onTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTimeoutUndefined: Self = StObject.set(x, "onTimeout", js.undefined)
  }
}
