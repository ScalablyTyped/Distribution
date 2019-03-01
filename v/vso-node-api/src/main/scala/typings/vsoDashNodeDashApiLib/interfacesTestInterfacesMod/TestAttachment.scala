package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestAttachment extends js.Object {
  var attachmentType: AttachmentType
  var comment: java.lang.String
  var createdDate: stdLib.Date
  var fileName: java.lang.String
  var id: scala.Double
  var url: java.lang.String
}

object TestAttachment {
  @scala.inline
  def apply(
    attachmentType: AttachmentType,
    comment: java.lang.String,
    createdDate: stdLib.Date,
    fileName: java.lang.String,
    id: scala.Double,
    url: java.lang.String
  ): TestAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attachmentType")(attachmentType)
    __obj.updateDynamic("comment")(comment)
    __obj.updateDynamic("createdDate")(createdDate)
    __obj.updateDynamic("fileName")(fileName)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[TestAttachment]
  }
}

