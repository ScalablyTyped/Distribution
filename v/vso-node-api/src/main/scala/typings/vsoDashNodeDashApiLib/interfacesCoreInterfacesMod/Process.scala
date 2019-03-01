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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isDefault")(isDefault)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Process]
  }
}

