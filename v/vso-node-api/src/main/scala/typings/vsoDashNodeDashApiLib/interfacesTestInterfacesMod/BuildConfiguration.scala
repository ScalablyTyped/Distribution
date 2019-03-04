package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildConfiguration extends js.Object {
  var branchName: java.lang.String
  var buildDefinitionId: scala.Double
  var flavor: java.lang.String
  var id: scala.Double
  var number: java.lang.String
  var platform: java.lang.String
  var project: ShallowReference
  var repositoryId: scala.Double
  var sourceVersion: java.lang.String
  var uri: java.lang.String
}

object BuildConfiguration {
  @scala.inline
  def apply(
    branchName: java.lang.String,
    buildDefinitionId: scala.Double,
    flavor: java.lang.String,
    id: scala.Double,
    number: java.lang.String,
    platform: java.lang.String,
    project: ShallowReference,
    repositoryId: scala.Double,
    sourceVersion: java.lang.String,
    uri: java.lang.String
  ): BuildConfiguration = {
    val __obj = js.Dynamic.literal(branchName = branchName, buildDefinitionId = buildDefinitionId, flavor = flavor, id = id, number = number, platform = platform, project = project, repositoryId = repositoryId, sourceVersion = sourceVersion, uri = uri)
  
    __obj.asInstanceOf[BuildConfiguration]
  }
}

