package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceEndpointRequestResult extends js.Object {
  var errorMessage: java.lang.String
  var result: js.Any
  var statusCode: java.lang.String
}

object ServiceEndpointRequestResult {
  @scala.inline
  def apply(errorMessage: java.lang.String, result: js.Any, statusCode: java.lang.String): ServiceEndpointRequestResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errorMessage")(errorMessage)
    __obj.updateDynamic("result")(result)
    __obj.updateDynamic("statusCode")(statusCode)
    __obj.asInstanceOf[ServiceEndpointRequestResult]
  }
}

