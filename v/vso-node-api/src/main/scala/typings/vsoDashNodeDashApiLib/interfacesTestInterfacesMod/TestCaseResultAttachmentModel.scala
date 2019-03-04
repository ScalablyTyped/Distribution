package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestCaseResultAttachmentModel extends js.Object {
  var id: scala.Double
  var iterationId: scala.Double
  var name: java.lang.String
  var size: scala.Double
  var url: java.lang.String
}

object TestCaseResultAttachmentModel {
  @scala.inline
  def apply(
    id: scala.Double,
    iterationId: scala.Double,
    name: java.lang.String,
    size: scala.Double,
    url: java.lang.String
  ): TestCaseResultAttachmentModel = {
    val __obj = js.Dynamic.literal(id = id, iterationId = iterationId, name = name, size = size, url = url)
  
    __obj.asInstanceOf[TestCaseResultAttachmentModel]
  }
}

