package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildWorkspace extends js.Object {
  var mappings: js.Array[MappingDetails]
}

object BuildWorkspace {
  @scala.inline
  def apply(mappings: js.Array[MappingDetails]): BuildWorkspace = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mappings")(mappings)
    __obj.asInstanceOf[BuildWorkspace]
  }
}

