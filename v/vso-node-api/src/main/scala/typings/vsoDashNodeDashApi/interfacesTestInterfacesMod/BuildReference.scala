package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildReference extends js.Object {
  var branchName: String
  var buildSystem: String
  var definitionId: Double
  var id: Double
  var number: String
  var repositoryId: String
  var uri: String
}

object BuildReference {
  @scala.inline
  def apply(
    branchName: String,
    buildSystem: String,
    definitionId: Double,
    id: Double,
    number: String,
    repositoryId: String,
    uri: String
  ): BuildReference = {
    val __obj = js.Dynamic.literal(branchName = branchName, buildSystem = buildSystem, definitionId = definitionId, id = id, number = number, repositoryId = repositoryId, uri = uri)
  
    __obj.asInstanceOf[BuildReference]
  }
}

