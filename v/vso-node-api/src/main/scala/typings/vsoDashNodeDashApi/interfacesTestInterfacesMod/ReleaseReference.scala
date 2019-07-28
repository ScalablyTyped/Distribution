package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseReference extends js.Object {
  var definitionId: Double
  var environmentDefinitionId: Double
  var environmentDefinitionName: String
  var environmentId: Double
  var environmentName: String
  var id: Double
  var name: String
}

object ReleaseReference {
  @scala.inline
  def apply(
    definitionId: Double,
    environmentDefinitionId: Double,
    environmentDefinitionName: String,
    environmentId: Double,
    environmentName: String,
    id: Double,
    name: String
  ): ReleaseReference = {
    val __obj = js.Dynamic.literal(definitionId = definitionId, environmentDefinitionId = environmentDefinitionId, environmentDefinitionName = environmentDefinitionName, environmentId = environmentId, environmentName = environmentName, id = id, name = name)
  
    __obj.asInstanceOf[ReleaseReference]
  }
}

