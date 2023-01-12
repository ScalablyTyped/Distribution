package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined wegame-api.wx.types.CallbacksWithType<{  openIdList :std.ReadonlyArray<string>,   errCode :number,   errMsg :string}> & {  signature :string,   nonceStr :string,   timeStamp :number,   groupId :string,   muteConfig :{  muteMicrophone :boolean | undefined,   muteEarphone :boolean | undefined} | undefined} */
trait CallbacksWithTypeopenIdLi extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 小游戏内此房间/群聊的 ID。同一时刻传入相同 groupId 的用户会进入到同个实时语音房间。
    */
  var groupId: String
  
  /**
    * 静音设置
    */
  var muteConfig: js.UndefOr[MuteEarphone] = js.undefined
  
  /**
    * 验证所需的随机字符串
    */
  var nonceStr: String
  
  /**
    * 签名，用于验证小游戏的身份
    */
  var signature: String
  
  var success: js.UndefOr[js.Function1[/* res */ OpenIdList, Unit]] = js.undefined
  
  /**
    * 验证所需的时间戳
    */
  var timeStamp: Double
}
object CallbacksWithTypeopenIdLi {
  
  inline def apply(groupId: String, nonceStr: String, signature: String, timeStamp: Double): CallbacksWithTypeopenIdLi = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any], nonceStr = nonceStr.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbacksWithTypeopenIdLi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CallbacksWithTypeopenIdLi] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setMuteConfig(value: MuteEarphone): Self = StObject.set(x, "muteConfig", value.asInstanceOf[js.Any])
    
    inline def setMuteConfigUndefined: Self = StObject.set(x, "muteConfig", js.undefined)
    
    inline def setNonceStr(value: String): Self = StObject.set(x, "nonceStr", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ OpenIdList => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
  }
}
