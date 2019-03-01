package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskAgentPoolReference extends js.Object {
  /**
    * The pool ID.
    */
  var id: scala.Double
  /**
    * A value indicating whether or not this pool is managed by the service.
    */
  var isHosted: scala.Boolean
  /**
    * The pool name.
    */
  var name: java.lang.String
}

object TaskAgentPoolReference {
  @scala.inline
  def apply(id: scala.Double, isHosted: scala.Boolean, name: java.lang.String): TaskAgentPoolReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isHosted")(isHosted)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[TaskAgentPoolReference]
  }
}

