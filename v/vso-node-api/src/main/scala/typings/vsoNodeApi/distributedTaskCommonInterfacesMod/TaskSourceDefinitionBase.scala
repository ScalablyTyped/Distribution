package typings.vsoNodeApi.distributedTaskCommonInterfacesMod

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
    val __obj = js.Dynamic.literal(authKey = authKey.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], keySelector = keySelector.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskSourceDefinitionBase]
  }
}

