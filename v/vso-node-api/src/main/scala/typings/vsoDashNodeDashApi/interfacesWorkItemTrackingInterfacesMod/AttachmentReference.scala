package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

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
    val __obj = js.Dynamic.literal(id = id, url = url)
  
    __obj.asInstanceOf[AttachmentReference]
  }
}

