package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

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
    val __obj = js.Dynamic.literal(canDelete = canDelete, category = category, description = description, environment = environment, iconTaskId = iconTaskId, iconUri = iconUri, id = id, isDeleted = isDeleted, name = name)
  
    __obj.asInstanceOf[ReleaseDefinitionEnvironmentTemplate]
  }
}

