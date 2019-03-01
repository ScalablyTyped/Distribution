package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentReference extends js.Object {
  var id: java.lang.String
  var url: java.lang.String
}

object AttachmentReference {
  @scala.inline
  def apply(id: java.lang.String, url: java.lang.String): AttachmentReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[AttachmentReference]
  }
}

