package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildConfiguration extends js.Object {
  var branchName: String
  var buildDefinitionId: Double
  var flavor: String
  var id: Double
  var number: String
  var platform: String
  var project: ShallowReference
  var repositoryId: Double
  var sourceVersion: String
  var uri: String
}

object BuildConfiguration {
  @scala.inline
  def apply(
    branchName: String,
    buildDefinitionId: Double,
    flavor: String,
    id: Double,
    number: String,
    platform: String,
    project: ShallowReference,
    repositoryId: Double,
    sourceVersion: String,
    uri: String
  ): BuildConfiguration = {
    val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], buildDefinitionId = buildDefinitionId.asInstanceOf[js.Any], flavor = flavor.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], repositoryId = repositoryId.asInstanceOf[js.Any], sourceVersion = sourceVersion.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BuildConfiguration]
  }
}

