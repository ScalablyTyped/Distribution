package typings.vsoDashNodeDashApi.interfacesDistributedTaskCommonInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskSourceDefinitionBase extends js.Object {
  var authKey: String
  var endpoint: String
  var keySelector: String
  var selector: String
  var target: String
}

object TaskSourceDefinitionBase {
  @scala.inline
  def apply(authKey: String, endpoint: String, keySelector: String, selector: String, target: String): TaskSourceDefinitionBase = {
    val __obj = js.Dynamic.literal(authKey = authKey, endpoint = endpoint, keySelector = keySelector, selector = selector, target = target)
  
    __obj.asInstanceOf[TaskSourceDefinitionBase]
  }
}

