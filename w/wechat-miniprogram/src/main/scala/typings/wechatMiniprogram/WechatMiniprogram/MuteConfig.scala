package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 静音设置 */
trait MuteConfig extends StObject {
  
  /** 是否静音耳机 */
  var muteEarphone: js.UndefOr[Boolean] = js.undefined
  
  /** 是否静音麦克风 */
  var muteMicrophone: js.UndefOr[Boolean] = js.undefined
}
object MuteConfig {
  
  inline def apply(): MuteConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MuteConfig]
  }
  
  extension [Self <: MuteConfig](x: Self) {
    
    inline def setMuteEarphone(value: Boolean): Self = StObject.set(x, "muteEarphone", value.asInstanceOf[js.Any])
    
    inline def setMuteEarphoneUndefined: Self = StObject.set(x, "muteEarphone", js.undefined)
    
    inline def setMuteMicrophone(value: Boolean): Self = StObject.set(x, "muteMicrophone", value.asInstanceOf[js.Any])
    
    inline def setMuteMicrophoneUndefined: Self = StObject.set(x, "muteMicrophone", js.undefined)
  }
}
