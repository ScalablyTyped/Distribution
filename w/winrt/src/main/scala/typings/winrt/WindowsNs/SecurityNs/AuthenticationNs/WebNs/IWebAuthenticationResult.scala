package typings.winrt.WindowsNs.SecurityNs.AuthenticationNs.WebNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebAuthenticationResult extends js.Object {
  var responseData: String
  var responseErrorDetail: Double
  var responseStatus: WebAuthenticationStatus
}

object IWebAuthenticationResult {
  @scala.inline
  def apply(responseData: String, responseErrorDetail: Double, responseStatus: WebAuthenticationStatus): IWebAuthenticationResult = {
    val __obj = js.Dynamic.literal(responseData = responseData, responseErrorDetail = responseErrorDetail, responseStatus = responseStatus)
  
    __obj.asInstanceOf[IWebAuthenticationResult]
  }
}

