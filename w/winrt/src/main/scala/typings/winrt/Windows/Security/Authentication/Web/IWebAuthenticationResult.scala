package typings.winrt.Windows.Security.Authentication.Web

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebAuthenticationResult extends js.Object {
  
  var responseData: String = js.native
  
  var responseErrorDetail: Double = js.native
  
  var responseStatus: WebAuthenticationStatus = js.native
}
object IWebAuthenticationResult {
  
  @scala.inline
  def apply(responseData: String, responseErrorDetail: Double, responseStatus: WebAuthenticationStatus): IWebAuthenticationResult = {
    val __obj = js.Dynamic.literal(responseData = responseData.asInstanceOf[js.Any], responseErrorDetail = responseErrorDetail.asInstanceOf[js.Any], responseStatus = responseStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebAuthenticationResult]
  }
  
  @scala.inline
  implicit class IWebAuthenticationResultOps[Self <: IWebAuthenticationResult] (val x: Self) extends AnyVal {
    
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
    def setResponseData(value: String): Self = this.set("responseData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseErrorDetail(value: Double): Self = this.set("responseErrorDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseStatus(value: WebAuthenticationStatus): Self = this.set("responseStatus", value.asInstanceOf[js.Any])
  }
}
