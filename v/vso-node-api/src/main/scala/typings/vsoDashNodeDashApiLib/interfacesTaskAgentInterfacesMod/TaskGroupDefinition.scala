package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskGroupDefinition extends js.Object {
  var displayName: java.lang.String
  var isExpanded: scala.Boolean
  var name: java.lang.String
  var tags: js.Array[java.lang.String]
  var visibleRule: java.lang.String
}

object TaskGroupDefinition {
  @scala.inline
  def apply(
    displayName: java.lang.String,
    isExpanded: scala.Boolean,
    name: java.lang.String,
    tags: js.Array[java.lang.String],
    visibleRule: java.lang.String
  ): TaskGroupDefinition = {
    val __obj = js.Dynamic.literal(displayName = displayName, isExpanded = isExpanded, name = name, tags = tags, visibleRule = visibleRule)
  
    __obj.asInstanceOf[TaskGroupDefinition]
  }
}

