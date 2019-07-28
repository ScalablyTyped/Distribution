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
    val __obj = js.Dynamic.literal(branchName = branchName, buildDefinitionId = buildDefinitionId, flavor = flavor, id = id, number = number, platform = platform, project = project, repositoryId = repositoryId, sourceVersion = sourceVersion, uri = uri)
  
    __obj.asInstanceOf[BuildConfiguration]
  }
}

