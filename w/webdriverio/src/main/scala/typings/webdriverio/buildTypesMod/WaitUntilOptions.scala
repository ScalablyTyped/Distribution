package typings.webdriverio.buildTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaitUntilOptions extends StObject {
  
  var interval: js.UndefOr[Double] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var timeoutMsg: js.UndefOr[String] = js.undefined
}
object WaitUntilOptions {
  
  inline def apply(): WaitUntilOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaitUntilOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WaitUntilOptions] (val x: Self) extends AnyVal {
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutMsg(value: String): Self = StObject.set(x, "timeoutMsg", value.asInstanceOf[js.Any])
    
    inline def setTimeoutMsgUndefined: Self = StObject.set(x, "timeoutMsg", js.undefined)
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
