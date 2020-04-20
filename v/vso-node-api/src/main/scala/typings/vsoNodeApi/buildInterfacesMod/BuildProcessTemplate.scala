package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildProcessTemplate extends js.Object {
  var description: String
  var fileExists: Boolean
  var id: Double
  var parameters: String
  var serverPath: String
  var supportedReasons: BuildReason
  var teamProject: String
  var templateType: ProcessTemplateType
  var url: String
  var version: String
}

object BuildProcessTemplate {
  @scala.inline
  def apply(
    description: String,
    fileExists: Boolean,
    id: Double,
    parameters: String,
    serverPath: String,
    supportedReasons: BuildReason,
    teamProject: String,
    templateType: ProcessTemplateType,
    url: String,
    version: String
  ): BuildProcessTemplate = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], fileExists = fileExists.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], serverPath = serverPath.asInstanceOf[js.Any], supportedReasons = supportedReasons.asInstanceOf[js.Any], teamProject = teamProject.asInstanceOf[js.Any], templateType = templateType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildProcessTemplate]
  }
}

