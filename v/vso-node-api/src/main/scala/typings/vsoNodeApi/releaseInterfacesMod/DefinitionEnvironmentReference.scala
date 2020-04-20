package typings.vsoNodeApi.releaseInterfacesMod

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
    val __obj = js.Dynamic.literal(definitionEnvironmentId = definitionEnvironmentId.asInstanceOf[js.Any], definitionEnvironmentName = definitionEnvironmentName.asInstanceOf[js.Any], releaseDefinitionId = releaseDefinitionId.asInstanceOf[js.Any], releaseDefinitionName = releaseDefinitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionEnvironmentReference]
  }
}

