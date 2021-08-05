package typings.wxJsSdkDt.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopSearchBeaconsConfig
  extends StObject
     with WxBaseRequestConfig {
  
  @JSName("complete")
  def complete_MStopSearchBeaconsConfig(res: js.Any): Unit
}
object StopSearchBeaconsConfig {
  
  inline def apply(complete: js.Any => Unit): StopSearchBeaconsConfig = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete))
    __obj.asInstanceOf[StopSearchBeaconsConfig]
  }
  
  extension [Self <: StopSearchBeaconsConfig](x: Self) {
    
    inline def setComplete(value: js.Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
  }
}
