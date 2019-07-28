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
    val __obj = js.Dynamic.literal(description = description, id = id, isIdentity = isIdentity, name = name, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FieldModel]
  }
}

