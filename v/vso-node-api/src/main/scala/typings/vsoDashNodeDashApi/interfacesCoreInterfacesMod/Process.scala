package typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Process extends ProcessReference {
  var _links: js.Any
  var description: String
  var id: String
  var isDefault: Boolean
  var `type`: ProcessType
}

object Process {
  @scala.inline
  def apply(
    _links: js.Any,
    description: String,
    id: String,
    isDefault: Boolean,
    name: String,
    `type`: ProcessType,
    url: String
  ): Process = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDefault = isDefault.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Process]
  }
}

