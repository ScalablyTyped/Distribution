package typings
package winrtLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebAuthenticationResult extends js.Object {
  var responseData: java.lang.String
  var responseErrorDetail: scala.Double
  var responseStatus: WebAuthenticationStatus
}

object IWebAuthenticationResult {
  @scala.inline
  def apply(
    responseData: java.lang.String,
    responseErrorDetail: scala.Double,
    responseStatus: WebAuthenticationStatus
  ): IWebAuthenticationResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("responseData")(responseData)
    __obj.updateDynamic("responseErrorDetail")(responseErrorDetail)
    __obj.updateDynamic("responseStatus")(responseStatus)
    __obj.asInstanceOf[IWebAuthenticationResult]
  }
}

