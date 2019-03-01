package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchResponse extends js.Object {
  var error: java.lang.String
  var responses: js.Array[Response]
  var status: java.lang.String
}

object BatchResponse {
  @scala.inline
  def apply(error: java.lang.String, responses: js.Array[Response], status: java.lang.String): BatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("responses")(responses)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[BatchResponse]
  }
}

