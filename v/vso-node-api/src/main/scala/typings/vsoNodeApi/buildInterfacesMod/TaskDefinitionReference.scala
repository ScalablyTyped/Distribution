package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskDefinitionReference extends js.Object {
  /**
    * The type of task (task or task group).
    */
  var definitionType: String
  /**
    * The ID of the task.
    */
  var id: String
  /**
    * The version of the task.
    */
  var versionSpec: String
}

object TaskDefinitionReference {
  @scala.inline
  def apply(definitionType: String, id: String, versionSpec: String): TaskDefinitionReference = {
    val __obj = js.Dynamic.literal(definitionType = definitionType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], versionSpec = versionSpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskDefinitionReference]
  }
}

