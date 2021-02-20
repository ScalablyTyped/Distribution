package typings.wxJsSdkDt.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopSearchBeaconsConfig extends WxBaseRequestConfig {
  
  @JSName("complete")
  def complete_MStopSearchBeaconsConfig(res: js.Any): Unit = js.native
}
object StopSearchBeaconsConfig {
  
  @scala.inline
  def apply(complete: js.Any => Unit): StopSearchBeaconsConfig = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete))
    __obj.asInstanceOf[StopSearchBeaconsConfig]
  }
  
  @scala.inline
  implicit class StopSearchBeaconsConfigMutableBuilder[Self <: StopSearchBeaconsConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: js.Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
  }
}
