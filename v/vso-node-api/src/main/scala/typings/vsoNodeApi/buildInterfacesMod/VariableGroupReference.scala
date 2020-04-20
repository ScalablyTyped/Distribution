package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableGroupReference extends js.Object {
  /**
    * The ID of the variable group.
    */
  var id: Double
}

object VariableGroupReference {
  @scala.inline
  def apply(id: Double): VariableGroupReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableGroupReference]
  }
}

