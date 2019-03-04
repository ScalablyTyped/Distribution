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
    val __obj = js.Dynamic.literal(definitionEnvironmentId = definitionEnvironmentId, definitionEnvironmentName = definitionEnvironmentName, releaseDefinitionId = releaseDefinitionId, releaseDefinitionName = releaseDefinitionName)
  
    __obj.asInstanceOf[DefinitionEnvironmentReference]
  }
}

