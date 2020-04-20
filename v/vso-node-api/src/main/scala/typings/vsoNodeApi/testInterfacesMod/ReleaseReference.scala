package typings.vsoNodeApi.testInterfacesMod

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
    val __obj = js.Dynamic.literal(definitionId = definitionId.asInstanceOf[js.Any], environmentDefinitionId = environmentDefinitionId.asInstanceOf[js.Any], environmentDefinitionName = environmentDefinitionName.asInstanceOf[js.Any], environmentId = environmentId.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseReference]
  }
}

