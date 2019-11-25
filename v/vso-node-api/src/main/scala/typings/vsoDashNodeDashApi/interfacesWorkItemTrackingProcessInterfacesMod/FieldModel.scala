package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldModel extends js.Object {
  var description: String
  var id: String
  var isIdentity: Boolean
  var name: String
  var `type`: FieldType
  var url: String
}

object FieldModel {
  @scala.inline
  def apply(description: String, id: String, isIdentity: Boolean, name: String, `type`: FieldType, url: String): FieldModel = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isIdentity = isIdentity.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldModel]
  }
}

