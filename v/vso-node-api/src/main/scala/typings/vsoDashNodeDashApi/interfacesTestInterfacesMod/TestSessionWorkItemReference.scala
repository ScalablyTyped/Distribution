package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestSessionWorkItemReference extends js.Object {
  /**
    * Id of the workitem
    */
  var id: Double
  /**
    * Type of the workitem
    */
  var `type`: String
}

object TestSessionWorkItemReference {
  @scala.inline
  def apply(id: Double, `type`: String): TestSessionWorkItemReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestSessionWorkItemReference]
  }
}

