package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

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
    val __obj = js.Dynamic.literal(displayName = displayName, isExpanded = isExpanded, name = name, tags = tags, visibleRule = visibleRule)
  
    __obj.asInstanceOf[TaskGroupDefinition]
  }
}

