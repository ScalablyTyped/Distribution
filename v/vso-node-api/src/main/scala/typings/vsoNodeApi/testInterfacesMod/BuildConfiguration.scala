package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildConfiguration extends js.Object {
  var branchName: String = js.native
  var buildDefinitionId: Double = js.native
  var flavor: String = js.native
  var id: Double = js.native
  var number: String = js.native
  var platform: String = js.native
  var project: ShallowReference = js.native
  var repositoryId: Double = js.native
  var sourceVersion: String = js.native
  var uri: String = js.native
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
  @scala.inline
  implicit class BuildConfigurationOps[Self <: BuildConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBranchName(value: String): Self = this.set("branchName", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuildDefinitionId(value: Double): Self = this.set("buildDefinitionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlavor(value: String): Self = this.set("flavor", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumber(value: String): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def setProject(value: ShallowReference): Self = this.set("project", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepositoryId(value: Double): Self = this.set("repositoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceVersion(value: String): Self = this.set("sourceVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
  }
  
}

