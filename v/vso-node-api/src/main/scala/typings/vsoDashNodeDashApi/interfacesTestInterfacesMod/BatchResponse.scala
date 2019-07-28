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
    val __obj = js.Dynamic.literal(error = error, responses = responses, status = status)
  
    __obj.asInstanceOf[BatchResponse]
  }
}

