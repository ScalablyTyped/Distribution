package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestCaseResultAttachmentModel extends js.Object {
  var id: Double
  var iterationId: Double
  var name: String
  var size: Double
  var url: String
}

object TestCaseResultAttachmentModel {
  @scala.inline
  def apply(id: Double, iterationId: Double, name: String, size: Double, url: String): TestCaseResultAttachmentModel = {
    val __obj = js.Dynamic.literal(id = id, iterationId = iterationId, name = name, size = size, url = url)
  
    __obj.asInstanceOf[TestCaseResultAttachmentModel]
  }
}

