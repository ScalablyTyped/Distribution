package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseEnvironmentDefinitionReference extends js.Object {
  var definitionId: scala.Double
  var environmentDefinitionId: scala.Double
}

object ReleaseEnvironmentDefinitionReference {
  @scala.inline
  def apply(definitionId: scala.Double, environmentDefinitionId: scala.Double): ReleaseEnvironmentDefinitionReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("definitionId")(definitionId)
    __obj.updateDynamic("environmentDefinitionId")(environmentDefinitionId)
    __obj.asInstanceOf[ReleaseEnvironmentDefinitionReference]
  }
}

