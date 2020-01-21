package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseDefinitionEnvironmentTemplate extends js.Object {
  var canDelete: Boolean
  var category: String
  var description: String
  var environment: ReleaseDefinitionEnvironment
  var iconTaskId: String
  var iconUri: String
  var id: String
  var isDeleted: Boolean
  var name: String
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
}

