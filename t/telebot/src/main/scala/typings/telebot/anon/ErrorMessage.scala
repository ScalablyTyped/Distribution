package typings.telebot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorMessage extends js.Object {
  
  var errorMessage: js.UndefOr[String] = js.native
  
  var shippingOptions: js.UndefOr[js.Array[_]] = js.native
}
object ErrorMessage {
  
  @scala.inline
  def apply(): ErrorMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorMessage]
  }
  
  @scala.inline
  implicit class ErrorMessageOps[Self <: ErrorMessage] (val x: Self) extends AnyVal {
    
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
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    
    @scala.inline
    def setShippingOptionsVarargs(value: js.Any*): Self = this.set("shippingOptions", js.Array(value :_*))
    
    @scala.inline
    def setShippingOptions(value: js.Array[_]): Self = this.set("shippingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingOptions: Self = this.set("shippingOptions", js.undefined)
  }
}
