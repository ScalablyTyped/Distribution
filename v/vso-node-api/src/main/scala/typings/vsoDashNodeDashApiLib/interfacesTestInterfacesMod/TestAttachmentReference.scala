package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestAttachmentReference extends js.Object {
  var id: scala.Double
  var url: java.lang.String
}

object TestAttachmentReference {
  @scala.inline
  def apply(id: scala.Double, url: java.lang.String): TestAttachmentReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[TestAttachmentReference]
  }
}

