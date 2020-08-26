package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskDefinitionReference extends js.Object {
  /**
    * The type of task (task or task group).
    */
  var definitionType: String = js.native
  /**
    * The ID of the task.
    */
  var id: String = js.native
  /**
    * The version of the task.
    */
  var versionSpec: String = js.native
}

object TaskDefinitionReference {
  @scala.inline
  def apply(definitionType: String, id: String, versionSpec: String): TaskDefinitionReference = {
    val __obj = js.Dynamic.literal(definitionType = definitionType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], versionSpec = versionSpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskDefinitionReference]
  }
  @scala.inline
  implicit class TaskDefinitionReferenceOps[Self <: TaskDefinitionReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDefinitionType(value: String): Self = this.set("definitionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersionSpec(value: String): Self = this.set("versionSpec", value.asInstanceOf[js.Any])
  }
  
}

