package typings.wxJsSdkBrowser.wx

import typings.wxJsSdkBrowser.anon.LocalId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopRecordConfig
  extends StObject
     with WxBaseRequestConfig {
  
  @JSName("success")
  def success_MStopRecordConfig(res: LocalId): Unit
}
object StopRecordConfig {
  
  inline def apply(success: LocalId => Unit): StopRecordConfig = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[StopRecordConfig]
  }
  
  extension [Self <: StopRecordConfig](x: Self) {
    
    inline def setSuccess(value: LocalId => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
