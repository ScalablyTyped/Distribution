package typings.wepy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NonceStr extends js.Object {
  
  @JSName("package")
  var _package: String = js.native
  
  var nonceStr: String = js.native
  
  var paySign: String = js.native
  
  var signType: String = js.native
  
  var timeStamp: String = js.native
}
object NonceStr {
  
  @scala.inline
  def apply(_package: String, nonceStr: String, paySign: String, signType: String, timeStamp: String): NonceStr = {
    val __obj = js.Dynamic.literal(nonceStr = nonceStr.asInstanceOf[js.Any], paySign = paySign.asInstanceOf[js.Any], signType = signType.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonceStr]
  }
  
  @scala.inline
  implicit class NonceStrOps[Self <: NonceStr] (val x: Self) extends AnyVal {
    
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
    def set_package(value: String): Self = this.set("package", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonceStr(value: String): Self = this.set("nonceStr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaySign(value: String): Self = this.set("paySign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignType(value: String): Self = this.set("signType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStamp(value: String): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
  }
}
