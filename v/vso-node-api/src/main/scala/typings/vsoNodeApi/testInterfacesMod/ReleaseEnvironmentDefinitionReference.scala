package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseEnvironmentDefinitionReference extends js.Object {
  var definitionId: Double
  var environmentDefinitionId: Double
}

object ReleaseEnvironmentDefinitionReference {
  @scala.inline
  def apply(definitionId: Double, environmentDefinitionId: Double): ReleaseEnvironmentDefinitionReference = {
    val __obj = js.Dynamic.literal(definitionId = definitionId.asInstanceOf[js.Any], environmentDefinitionId = environmentDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseEnvironmentDefinitionReference]
  }
}

