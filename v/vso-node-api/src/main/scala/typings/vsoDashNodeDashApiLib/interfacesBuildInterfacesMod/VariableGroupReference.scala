package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableGroupReference extends js.Object {
  /**
    * The ID of the variable group.
    */
  var id: scala.Double
}

object VariableGroupReference {
  @scala.inline
  def apply(id: scala.Double): VariableGroupReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[VariableGroupReference]
  }
}

