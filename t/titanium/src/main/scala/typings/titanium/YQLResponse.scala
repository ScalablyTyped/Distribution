package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Properties passed to a yql callback to report a success or failure.
  */
@js.native
trait YQLResponse extends ErrorResponse {
  
  /**
    * The data payload received from the YQL.
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /**
    * Error message, if any returned. Use `error` instead
    * @deprecated
    */
  var message: js.UndefOr[String] = js.native
}
object YQLResponse {
  
  @scala.inline
  def apply(): YQLResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YQLResponse]
  }
  
  @scala.inline
  implicit class YQLResponseOps[Self <: YQLResponse] (val x: Self) extends AnyVal {
    
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
