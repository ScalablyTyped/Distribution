package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  tmplIds :std.ReadonlyArray<string>} & wegame-api.wx.types.CallbacksWithType2<{  errMsg :string, [TEMPLATE_ID: string] : 'accept' | 'reject' | 'ban' | string}, {  errMsg :string,   errCode :number}> */
@js.native
trait tmplIdsReadonlyArraystrin extends js.Object {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  
  var fail: js.UndefOr[js.Function1[/* res */ ErrCode, Unit]] = js.native
  
  var success: js.UndefOr[js.Function1[/* res */ DictTEMPLATEID, Unit]] = js.native
  
  /**
    * 需要订阅的消息模板的id的集合（注意：iOS客户端7.0.6版本、Android客户端7.0.7版本之后的一次订阅才支持多个模板消息，iOS客户端7.0.5版本、Android客户端7.0.6版本之前的一次订阅
    * 只支持一个模板消息）消息模板id在[微信公众平台(mp.weixin.qq.com)-功能-订阅消息]中配置
    */
  var tmplIds: js.Array[String] = js.native
}
object tmplIdsReadonlyArraystrin {
  
  @scala.inline
  def apply(tmplIds: js.Array[String]): tmplIdsReadonlyArraystrin = {
    val __obj = js.Dynamic.literal(tmplIds = tmplIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[tmplIdsReadonlyArraystrin]
  }
  
  @scala.inline
  implicit class tmplIdsReadonlyArraystrinOps[Self <: tmplIdsReadonlyArraystrin] (val x: Self) extends AnyVal {
    
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
    def setTmplIdsVarargs(value: String*): Self = this.set("tmplIds", js.Array(value :_*))
    
    @scala.inline
    def setTmplIds(value: js.Array[String]): Self = this.set("tmplIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ ErrCode => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ DictTEMPLATEID => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
