package typings
package vsoDashNodeDashApiLib.interfacesDistributedTaskCommonInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskSourceDefinitionBase extends js.Object {
  var authKey: java.lang.String
  var endpoint: java.lang.String
  var keySelector: java.lang.String
  var selector: java.lang.String
  var target: java.lang.String
}

object TaskSourceDefinitionBase {
  @scala.inline
  def apply(
    authKey: java.lang.String,
    endpoint: java.lang.String,
    keySelector: java.lang.String,
    selector: java.lang.String,
    target: java.lang.String
  ): TaskSourceDefinitionBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authKey")(authKey)
    __obj.updateDynamic("endpoint")(endpoint)
    __obj.updateDynamic("keySelector")(keySelector)
    __obj.updateDynamic("selector")(selector)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[TaskSourceDefinitionBase]
  }
}

