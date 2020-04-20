package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskGroupDefinition extends js.Object {
  var displayName: String
  var isExpanded: Boolean
  var name: String
  var tags: js.Array[String]
  var visibleRule: String
}

object TaskGroupDefinition {
  @scala.inline
  def apply(
    displayName: String,
    isExpanded: Boolean,
    name: String,
    tags: js.Array[String],
    visibleRule: String
  ): TaskGroupDefinition = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], isExpanded = isExpanded.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], visibleRule = visibleRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskGroupDefinition]
  }
}

