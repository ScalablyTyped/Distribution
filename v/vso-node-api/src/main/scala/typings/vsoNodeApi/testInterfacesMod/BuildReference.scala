package typings.vsoNodeApi.testInterfacesMod

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
    val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], buildSystem = buildSystem.asInstanceOf[js.Any], definitionId = definitionId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], repositoryId = repositoryId.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BuildReference]
  }
}

