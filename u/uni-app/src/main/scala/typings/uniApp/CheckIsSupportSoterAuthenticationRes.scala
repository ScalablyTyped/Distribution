package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckIsSupportSoterAuthenticationRes extends js.Object {
  
  /**
    * 接口调用结果
    */
  var errMsg: js.UndefOr[String] = js.native
  
  /**
    * 接口调用成功的回调函数
    */
  var supportMode: js.UndefOr[js.Array[_]] = js.native
}
object CheckIsSupportSoterAuthenticationRes {
  
  @scala.inline
  def apply(): CheckIsSupportSoterAuthenticationRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckIsSupportSoterAuthenticationRes]
  }
  
  @scala.inline
  implicit class CheckIsSupportSoterAuthenticationResOps[Self <: CheckIsSupportSoterAuthenticationRes] (val x: Self) extends AnyVal {
    
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
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrMsg: Self = this.set("errMsg", js.undefined)
    
    @scala.inline
    def setSupportModeVarargs(value: js.Any*): Self = this.set("supportMode", js.Array(value :_*))
    
    @scala.inline
    def setSupportMode(value: js.Array[_]): Self = this.set("supportMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportMode: Self = this.set("supportMode", js.undefined)
  }
}
