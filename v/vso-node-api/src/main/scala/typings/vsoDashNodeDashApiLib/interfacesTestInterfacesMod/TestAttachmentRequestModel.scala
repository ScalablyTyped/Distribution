package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestAttachmentRequestModel extends js.Object {
  var attachmentType: java.lang.String
  var comment: java.lang.String
  var fileName: java.lang.String
  var stream: java.lang.String
}

object TestAttachmentRequestModel {
  @scala.inline
  def apply(
    attachmentType: java.lang.String,
    comment: java.lang.String,
    fileName: java.lang.String,
    stream: java.lang.String
  ): TestAttachmentRequestModel = {
    val __obj = js.Dynamic.literal(attachmentType = attachmentType, comment = comment, fileName = fileName, stream = stream)
  
    __obj.asInstanceOf[TestAttachmentRequestModel]
  }
}

