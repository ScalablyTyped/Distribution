package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var error: String
  var id: String
  var status: String
  var url: String
}

object Response {
  @scala.inline
  def apply(error: String, id: String, status: String, url: String): Response = {
    val __obj = js.Dynamic.literal(error = error, id = id, status = status, url = url)
  
    __obj.asInstanceOf[Response]
  }
}

