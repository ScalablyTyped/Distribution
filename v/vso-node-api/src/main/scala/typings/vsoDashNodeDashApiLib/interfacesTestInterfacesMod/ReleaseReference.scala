package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseReference extends js.Object {
  var definitionId: scala.Double
  var environmentDefinitionId: scala.Double
  var environmentDefinitionName: java.lang.String
  var environmentId: scala.Double
  var environmentName: java.lang.String
  var id: scala.Double
  var name: java.lang.String
}

object ReleaseReference {
  @scala.inline
  def apply(
    definitionId: scala.Double,
    environmentDefinitionId: scala.Double,
    environmentDefinitionName: java.lang.String,
    environmentId: scala.Double,
    environmentName: java.lang.String,
    id: scala.Double,
    name: java.lang.String
  ): ReleaseReference = {
    val __obj = js.Dynamic.literal(definitionId = definitionId, environmentDefinitionId = environmentDefinitionId, environmentDefinitionName = environmentDefinitionName, environmentId = environmentId, environmentName = environmentName, id = id, name = name)
  
    __obj.asInstanceOf[ReleaseReference]
  }
}

