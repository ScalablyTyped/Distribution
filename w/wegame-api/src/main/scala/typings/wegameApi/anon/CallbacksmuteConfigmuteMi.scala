package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined wegame-api.wx.types.Callbacks & {  muteConfig :{  muteMicrophone :boolean | undefined,   muteEarphone :boolean | undefined}} */
@js.native
trait CallbacksmuteConfigmuteMi extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 静音设置
    */
  var muteConfig: MuteEarphone = js.native
  
  var success: js.UndefOr[js.Function0[Unit]] = js.native
}
object CallbacksmuteConfigmuteMi {
  
  @scala.inline
  def apply(muteConfig: MuteEarphone): CallbacksmuteConfigmuteMi = {
    val __obj = js.Dynamic.literal(muteConfig = muteConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbacksmuteConfigmuteMi]
  }
  
  @scala.inline
  implicit class CallbacksmuteConfigmuteMiMutableBuilder[Self <: CallbacksmuteConfigmuteMi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setMuteConfig(value: MuteEarphone): Self = StObject.set(x, "muteConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
