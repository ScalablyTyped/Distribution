package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined wegame-api.wx.types.Callbacks & {  muteConfig :{  muteMicrophone :boolean | undefined,   muteEarphone :boolean | undefined}} */
trait CallbacksmuteConfigmuteMi extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 静音设置
    */
  var muteConfig: MuteEarphone
  
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object CallbacksmuteConfigmuteMi {
  
  inline def apply(muteConfig: MuteEarphone): CallbacksmuteConfigmuteMi = {
    val __obj = js.Dynamic.literal(muteConfig = muteConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbacksmuteConfigmuteMi]
  }
  
  extension [Self <: CallbacksmuteConfigmuteMi](x: Self) {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setMuteConfig(value: MuteEarphone): Self = StObject.set(x, "muteConfig", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
