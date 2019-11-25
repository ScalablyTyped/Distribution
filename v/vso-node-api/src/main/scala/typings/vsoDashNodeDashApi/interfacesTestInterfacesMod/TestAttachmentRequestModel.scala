package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestAttachmentRequestModel extends js.Object {
  var attachmentType: String
  var comment: String
  var fileName: String
  var stream: String
}

object TestAttachmentRequestModel {
  @scala.inline
  def apply(attachmentType: String, comment: String, fileName: String, stream: String): TestAttachmentRequestModel = {
    val __obj = js.Dynamic.literal(attachmentType = attachmentType.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestAttachmentRequestModel]
  }
}

