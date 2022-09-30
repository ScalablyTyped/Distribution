package typings.webdriverio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<webdriverio.webdriverio/build/types.WaitUntilOptions> */
trait PartialWaitUntilOptions extends StObject {
  
  var interval: js.UndefOr[Double] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var timeoutMsg: js.UndefOr[String] = js.undefined
}
object PartialWaitUntilOptions {
  
  inline def apply(): PartialWaitUntilOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWaitUntilOptions]
  }
  
  extension [Self <: PartialWaitUntilOptions](x: Self) {
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutMsg(value: String): Self = StObject.set(x, "timeoutMsg", value.asInstanceOf[js.Any])
    
    inline def setTimeoutMsgUndefined: Self = StObject.set(x, "timeoutMsg", js.undefined)
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
