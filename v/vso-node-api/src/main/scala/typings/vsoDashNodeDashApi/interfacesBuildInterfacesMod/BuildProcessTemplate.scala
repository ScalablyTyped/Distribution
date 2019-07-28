package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

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
    val __obj = js.Dynamic.literal(description = description, fileExists = fileExists, id = id, parameters = parameters, serverPath = serverPath, supportedReasons = supportedReasons, teamProject = teamProject, templateType = templateType, url = url, version = version)
  
    __obj.asInstanceOf[BuildProcessTemplate]
  }
}

