package typings.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignMessageParams extends CommonParams {
  
  var coin: js.UndefOr[String] = js.native
  
  var message: String = js.native
  
  var path: String | js.Array[Double] = js.native
}
object SignMessageParams {
  
  @scala.inline
  def apply(message: String, path: String | js.Array[Double]): SignMessageParams = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignMessageParams]
  }
  
  @scala.inline
  implicit class SignMessageParamsOps[Self <: SignMessageParams] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: Double*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: String | js.Array[Double]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoin(value: String): Self = this.set("coin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoin: Self = this.set("coin", js.undefined)
  }
}
