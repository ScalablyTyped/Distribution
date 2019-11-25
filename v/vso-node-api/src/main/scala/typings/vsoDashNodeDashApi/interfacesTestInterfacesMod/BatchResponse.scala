package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchResponse extends js.Object {
  var error: String
  var responses: js.Array[Response]
  var status: String
}

object BatchResponse {
  @scala.inline
  def apply(error: String, responses: js.Array[Response], status: String): BatchResponse = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchResponse]
  }
}

