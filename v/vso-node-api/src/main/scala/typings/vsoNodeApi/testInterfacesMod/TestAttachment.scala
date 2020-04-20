package typings.vsoNodeApi.testInterfacesMod

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
    val __obj = js.Dynamic.literal(attachmentType = attachmentType.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestAttachment]
  }
}

