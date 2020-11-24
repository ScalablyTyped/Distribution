package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  keyList :std.Array<string>} & wegame-api.wx.types.CallbacksWithType2<{  encryptedData :string,   cloudID :string}, {  errMsg :string,   errCode :number}> */
@js.native
trait keyListArraystringCallbac extends js.Object {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  
  var fail: js.UndefOr[js.Function1[/* res */ ErrCode, Unit]] = js.native
  
  /**
    * 要获取的 key 列表
    */
  var keyList: js.Array[String] = js.native
  
  var success: js.UndefOr[js.Function1[/* res */ CloudID, Unit]] = js.native
}
object keyListArraystringCallbac {
  
  @scala.inline
  def apply(keyList: js.Array[String]): keyListArraystringCallbac = {
    val __obj = js.Dynamic.literal(keyList = keyList.asInstanceOf[js.Any])
    __obj.asInstanceOf[keyListArraystringCallbac]
  }
  
  @scala.inline
  implicit class keyListArraystringCallbacOps[Self <: keyListArraystringCallbac] (val x: Self) extends AnyVal {
    
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
    def setKeyListVarargs(value: String*): Self = this.set("keyList", js.Array(value :_*))
    
    @scala.inline
    def setKeyList(value: js.Array[String]): Self = this.set("keyList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ ErrCode => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ CloudID => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
