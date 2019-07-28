package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefinitionEnvironmentReference extends js.Object {
  var definitionEnvironmentId: Double
  var definitionEnvironmentName: String
  var releaseDefinitionId: Double
  var releaseDefinitionName: String
}

object DefinitionEnvironmentReference {
  @scala.inline
  def apply(
    definitionEnvironmentId: Double,
    definitionEnvironmentName: String,
    releaseDefinitionId: Double,
    releaseDefinitionName: String
  ): DefinitionEnvironmentReference = {
    val __obj = js.Dynamic.literal(definitionEnvironmentId = definitionEnvironmentId, definitionEnvironmentName = definitionEnvironmentName, releaseDefinitionId = releaseDefinitionId, releaseDefinitionName = releaseDefinitionName)
  
    __obj.asInstanceOf[DefinitionEnvironmentReference]
  }
}

