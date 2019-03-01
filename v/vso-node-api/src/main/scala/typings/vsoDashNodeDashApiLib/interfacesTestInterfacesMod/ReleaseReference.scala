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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("definitionId")(definitionId)
    __obj.updateDynamic("environmentDefinitionId")(environmentDefinitionId)
    __obj.updateDynamic("environmentDefinitionName")(environmentDefinitionName)
    __obj.updateDynamic("environmentId")(environmentId)
    __obj.updateDynamic("environmentName")(environmentName)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ReleaseReference]
  }
}

