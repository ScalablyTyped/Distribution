package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseDefinitionEnvironmentTemplate extends js.Object {
  var canDelete: Boolean = js.native
  var category: String = js.native
  var description: String = js.native
  var environment: ReleaseDefinitionEnvironment = js.native
  var iconTaskId: String = js.native
  var iconUri: String = js.native
  var id: String = js.native
  var isDeleted: Boolean = js.native
  var name: String = js.native
}

object ReleaseDefinitionEnvironmentTemplate {
  @scala.inline
  def apply(
    canDelete: Boolean,
    category: String,
    description: String,
    environment: ReleaseDefinitionEnvironment,
    iconTaskId: String,
    iconUri: String,
    id: String,
    isDeleted: Boolean,
    name: String
  ): ReleaseDefinitionEnvironmentTemplate = {
    val __obj = js.Dynamic.literal(canDelete = canDelete.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], iconTaskId = iconTaskId.asInstanceOf[js.Any], iconUri = iconUri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDeleted = isDeleted.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionEnvironmentTemplate]
  }
  @scala.inline
  implicit class ReleaseDefinitionEnvironmentTemplateOps[Self <: ReleaseDefinitionEnvironmentTemplate] (val x: Self) extends AnyVal {
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
    def setCanDelete(value: Boolean): Self = this.set("canDelete", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironment(value: ReleaseDefinitionEnvironment): Self = this.set("environment", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconTaskId(value: String): Self = this.set("iconTaskId", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconUri(value: String): Self = this.set("iconUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDeleted(value: Boolean): Self = this.set("isDeleted", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

