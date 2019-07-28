package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResultPayload extends js.Object {
  var comment: String
  var name: String
  var stream: String
}

object TestResultPayload {
  @scala.inline
  def apply(comment: String, name: String, stream: String): TestResultPayload = {
    val __obj = js.Dynamic.literal(comment = comment, name = name, stream = stream)
  
    __obj.asInstanceOf[TestResultPayload]
  }
}

