package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  tmplIds :std.ReadonlyArray<string>} & wegame-api.wx.types.CallbacksWithType2<{  errMsg :string, [TEMPLATE_ID: string] : 'accept' | 'reject' | 'ban' | string}, {  errMsg :string,   errCode :number}> */
trait tmplIdsReadonlyArraystrin extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var fail: js.UndefOr[js.Function1[/* res */ ErrCode, Unit]] = js.undefined
  
  var success: js.UndefOr[js.Function1[/* res */ DictTEMPLATEID, Unit]] = js.undefined
  
  /**
    * 需要订阅的消息模板的id的集合（注意：iOS客户端7.0.6版本、Android客户端7.0.7版本之后的一次订阅才支持多个模板消息，iOS客户端7.0.5版本、Android客户端7.0.6版本之前的一次订阅
    * 只支持一个模板消息）消息模板id在[微信公众平台(mp.weixin.qq.com)-功能-订阅消息]中配置
    */
  var tmplIds: js.Array[String]
}
object tmplIdsReadonlyArraystrin {
  
  inline def apply(tmplIds: js.Array[String]): tmplIdsReadonlyArraystrin = {
    val __obj = js.Dynamic.literal(tmplIds = tmplIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[tmplIdsReadonlyArraystrin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: tmplIdsReadonlyArraystrin] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ ErrCode => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: /* res */ DictTEMPLATEID => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTmplIds(value: js.Array[String]): Self = StObject.set(x, "tmplIds", value.asInstanceOf[js.Any])
    
    inline def setTmplIdsVarargs(value: String*): Self = StObject.set(x, "tmplIds", js.Array(value*))
  }
}
