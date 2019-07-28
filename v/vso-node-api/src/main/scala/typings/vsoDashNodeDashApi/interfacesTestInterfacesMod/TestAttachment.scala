package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestAttachment extends js.Object {
  var attachmentType: AttachmentType
  var comment: String
  var createdDate: Date
  var fileName: String
  var id: Double
  var url: String
}

object TestAttachment {
  @scala.inline
  def apply(
    attachmentType: AttachmentType,
    comment: String,
    createdDate: Date,
    fileName: String,
    id: Double,
    url: String
  ): TestAttachment = {
    val __obj = js.Dynamic.literal(attachmentType = attachmentType, comment = comment, createdDate = createdDate, fileName = fileName, id = id, url = url)
  
    __obj.asInstanceOf[TestAttachment]
  }
}

