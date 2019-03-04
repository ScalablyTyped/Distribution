package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldModel extends js.Object {
  var description: java.lang.String
  var id: java.lang.String
  var isIdentity: scala.Boolean
  var name: java.lang.String
  var `type`: FieldType
  var url: java.lang.String
}

object FieldModel {
  @scala.inline
  def apply(
    description: java.lang.String,
    id: java.lang.String,
    isIdentity: scala.Boolean,
    name: java.lang.String,
    `type`: FieldType,
    url: java.lang.String
  ): FieldModel = {
    val __obj = js.Dynamic.literal(description = description, id = id, isIdentity = isIdentity, name = name, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FieldModel]
  }
}

