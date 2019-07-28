package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemReference extends js.Object {
  var id: String
  var name: String
  var `type`: String
  var url: String
  var webUrl: String
}

object WorkItemReference {
  @scala.inline
  def apply(id: String, name: String, `type`: String, url: String, webUrl: String): WorkItemReference = {
    val __obj = js.Dynamic.literal(id = id, name = name, url = url, webUrl = webUrl)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WorkItemReference]
  }
}

