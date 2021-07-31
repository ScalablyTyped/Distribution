package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaitForOptions extends StObject {
  
  var interval: js.UndefOr[Double] = js.undefined
  
  var reverse: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var timeoutMsg: js.UndefOr[String] = js.undefined
}
object WaitForOptions {
  
  @scala.inline
  def apply(): WaitForOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaitForOptions]
  }
  
  @scala.inline
  implicit class WaitForOptionsMutableBuilder[Self <: WaitForOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutMsg(value: String): Self = StObject.set(x, "timeoutMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutMsgUndefined: Self = StObject.set(x, "timeoutMsg", js.undefined)
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
