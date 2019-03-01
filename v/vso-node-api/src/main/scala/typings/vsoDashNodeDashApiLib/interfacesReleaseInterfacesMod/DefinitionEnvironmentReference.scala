package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefinitionEnvironmentReference extends js.Object {
  var definitionEnvironmentId: scala.Double
  var definitionEnvironmentName: java.lang.String
  var releaseDefinitionId: scala.Double
  var releaseDefinitionName: java.lang.String
}

object DefinitionEnvironmentReference {
  @scala.inline
  def apply(
    definitionEnvironmentId: scala.Double,
    definitionEnvironmentName: java.lang.String,
    releaseDefinitionId: scala.Double,
    releaseDefinitionName: java.lang.String
  ): DefinitionEnvironmentReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("definitionEnvironmentId")(definitionEnvironmentId)
    __obj.updateDynamic("definitionEnvironmentName")(definitionEnvironmentName)
    __obj.updateDynamic("releaseDefinitionId")(releaseDefinitionId)
    __obj.updateDynamic("releaseDefinitionName")(releaseDefinitionName)
    __obj.asInstanceOf[DefinitionEnvironmentReference]
  }
}

