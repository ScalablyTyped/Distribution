package typings.wxJsSdkBrowser.wx

import typings.wxJsSdkBrowser.anon.LocalId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoicePlayEndConfig
  extends StObject
     with WxBaseRequestConfig {
  
  @JSName("success")
  def success_MVoicePlayEndConfig(res: LocalId): Unit
}
object VoicePlayEndConfig {
  
  inline def apply(success: LocalId => Unit): VoicePlayEndConfig = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[VoicePlayEndConfig]
  }
  
  extension [Self <: VoicePlayEndConfig](x: Self) {
    
    inline def setSuccess(value: LocalId => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
