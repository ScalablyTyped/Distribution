package typings.winrt.Windows.Security.Authentication.Web

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
    val __obj = js.Dynamic.literal(responseData = responseData.asInstanceOf[js.Any], responseErrorDetail = responseErrorDetail.asInstanceOf[js.Any], responseStatus = responseStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebAuthenticationResult]
  }
}

