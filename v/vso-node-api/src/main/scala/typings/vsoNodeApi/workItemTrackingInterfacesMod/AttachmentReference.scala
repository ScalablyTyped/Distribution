package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentReference extends js.Object {
  var id: String
  var url: String
}

object AttachmentReference {
  @scala.inline
  def apply(id: String, url: String): AttachmentReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentReference]
  }
}

