package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestSessionWorkItemReference extends js.Object {
  /**
    * Id of the workitem
    */
  var id: scala.Double
  /**
    * Type of the workitem
    */
  var `type`: java.lang.String
}

object TestSessionWorkItemReference {
  @scala.inline
  def apply(id: scala.Double, `type`: java.lang.String): TestSessionWorkItemReference = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[TestSessionWorkItemReference]
  }
}

