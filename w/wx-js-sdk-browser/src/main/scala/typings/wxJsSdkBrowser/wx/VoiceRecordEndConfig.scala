package typings.wxJsSdkBrowser.wx

import typings.wxJsSdkBrowser.anon.LocalId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceRecordEndConfig
  extends StObject
     with WxBaseRequestConfig {
  
  @JSName("complete")
  def complete_MVoiceRecordEndConfig(res: LocalId): Unit
}
object VoiceRecordEndConfig {
  
  inline def apply(complete: LocalId => Unit): VoiceRecordEndConfig = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete))
    __obj.asInstanceOf[VoiceRecordEndConfig]
  }
  
  extension [Self <: VoiceRecordEndConfig](x: Self) {
    
    inline def setComplete(value: LocalId => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
  }
}
