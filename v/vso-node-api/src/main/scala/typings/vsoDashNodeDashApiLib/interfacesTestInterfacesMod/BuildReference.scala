package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildReference extends js.Object {
  var branchName: java.lang.String
  var buildSystem: java.lang.String
  var definitionId: scala.Double
  var id: scala.Double
  var number: java.lang.String
  var repositoryId: java.lang.String
  var uri: java.lang.String
}

object BuildReference {
  @scala.inline
  def apply(
    branchName: java.lang.String,
    buildSystem: java.lang.String,
    definitionId: scala.Double,
    id: scala.Double,
    number: java.lang.String,
    repositoryId: java.lang.String,
    uri: java.lang.String
  ): BuildReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("branchName")(branchName)
    __obj.updateDynamic("buildSystem")(buildSystem)
    __obj.updateDynamic("definitionId")(definitionId)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("number")(number)
    __obj.updateDynamic("repositoryId")(repositoryId)
    __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[BuildReference]
  }
}

