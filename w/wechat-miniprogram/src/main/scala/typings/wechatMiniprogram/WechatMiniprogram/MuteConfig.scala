package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 静音设置 */
@js.native
trait MuteConfig extends js.Object {
  
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
  implicit class MuteConfigOps[Self <: MuteConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMuteEarphone(value: Boolean): Self = this.set("muteEarphone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMuteEarphone: Self = this.set("muteEarphone", js.undefined)
    
    @scala.inline
    def setMuteMicrophone(value: Boolean): Self = this.set("muteMicrophone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMuteMicrophone: Self = this.set("muteMicrophone", js.undefined)
  }
}
