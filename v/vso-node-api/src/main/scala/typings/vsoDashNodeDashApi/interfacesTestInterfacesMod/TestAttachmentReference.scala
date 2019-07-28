package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestAttachmentReference extends js.Object {
  var id: Double
  var url: String
}

object TestAttachmentReference {
  @scala.inline
  def apply(id: Double, url: String): TestAttachmentReference = {
    val __obj = js.Dynamic.literal(id = id, url = url)
  
    __obj.asInstanceOf[TestAttachmentReference]
  }
}

