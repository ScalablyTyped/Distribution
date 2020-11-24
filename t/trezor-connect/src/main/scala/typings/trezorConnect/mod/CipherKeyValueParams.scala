package typings.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CipherKeyValueParams extends CommonParams {
  
  var askOnDecrypt: js.UndefOr[Boolean] = js.native
  
  var askOnEncrypt: js.UndefOr[Boolean] = js.native
  
  var iv: js.UndefOr[String] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var path: String | js.Array[Double] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object CipherKeyValueParams {
  
  @scala.inline
  def apply(path: String | js.Array[Double]): CipherKeyValueParams = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[CipherKeyValueParams]
  }
  
  @scala.inline
  implicit class CipherKeyValueParamsOps[Self <: CipherKeyValueParams] (val x: Self) extends AnyVal {
    
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
    def setPathVarargs(value: Double*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: String | js.Array[Double]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAskOnDecrypt(value: Boolean): Self = this.set("askOnDecrypt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAskOnDecrypt: Self = this.set("askOnDecrypt", js.undefined)
    
    @scala.inline
    def setAskOnEncrypt(value: Boolean): Self = this.set("askOnEncrypt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAskOnEncrypt: Self = this.set("askOnEncrypt", js.undefined)
    
    @scala.inline
    def setIv(value: String): Self = this.set("iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIv: Self = this.set("iv", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
