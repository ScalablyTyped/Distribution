package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetExtConfigRes extends js.Object {
  
  /**
    * 调用结果
    */
  var errMsg: js.UndefOr[String] = js.native
  
  /**
    * 第三方平台自定义的数据
    */
  var extConfig: js.UndefOr[js.Any] = js.native
}
object GetExtConfigRes {
  
  @scala.inline
  def apply(): GetExtConfigRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetExtConfigRes]
  }
  
  @scala.inline
  implicit class GetExtConfigResOps[Self <: GetExtConfigRes] (val x: Self) extends AnyVal {
    
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
    def setExtConfig(value: js.Any): Self = this.set("extConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtConfig: Self = this.set("extConfig", js.undefined)
  }
}
