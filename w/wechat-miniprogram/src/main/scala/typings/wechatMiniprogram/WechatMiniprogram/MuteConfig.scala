package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 静音设置 */
@js.native
trait MuteConfig extends StObject {
  
  /** 是否静音耳机 */
  var muteEarphone: js.UndefOr[Boolean] = js.native
  
  /** 是否静音麦克风 */
  var muteMicrophone: js.UndefOr[Boolean] = js.native
}
object MuteConfig {
  
  @scala.inline
  def apply(): MuteConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MuteConfig]
  }
  
  @scala.inline
  implicit class MuteConfigMutableBuilder[Self <: MuteConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMuteEarphone(value: Boolean): Self = StObject.set(x, "muteEarphone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMuteEarphoneUndefined: Self = StObject.set(x, "muteEarphone", js.undefined)
    
    @scala.inline
    def setMuteMicrophone(value: Boolean): Self = StObject.set(x, "muteMicrophone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMuteMicrophoneUndefined: Self = StObject.set(x, "muteMicrophone", js.undefined)
  }
}
