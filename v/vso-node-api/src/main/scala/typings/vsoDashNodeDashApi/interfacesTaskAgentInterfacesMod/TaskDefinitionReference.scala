package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskDefinitionReference extends js.Object {
  var definitionType: String
  var id: String
  var versionSpec: String
}

object TaskDefinitionReference {
  @scala.inline
  def apply(definitionType: String, id: String, versionSpec: String): TaskDefinitionReference = {
    val __obj = js.Dynamic.literal(definitionType = definitionType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], versionSpec = versionSpec.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TaskDefinitionReference]
  }
}

