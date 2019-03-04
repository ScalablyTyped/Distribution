package typings
package vsoDashNodeDashApiLib.interfacesCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Process extends ProcessReference {
  var _links: js.Any
  var description: java.lang.String
  var id: java.lang.String
  var isDefault: scala.Boolean
  var `type`: ProcessType
}

object Process {
  @scala.inline
  def apply(
    _links: js.Any,
    description: java.lang.String,
    id: java.lang.String,
    isDefault: scala.Boolean,
    name: java.lang.String,
    `type`: ProcessType,
    url: java.lang.String
  ): Process = {
    val __obj = js.Dynamic.literal(_links = _links, description = description, id = id, isDefault = isDefault, name = name, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Process]
  }
}

