package typings.vsoNodeApi.testInterfacesMod

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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], iterationId = iterationId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestCaseResultAttachmentModel]
  }
}

