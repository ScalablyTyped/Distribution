package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildAgent extends js.Object {
  var buildDirectory: String
  var controller: XamlBuildControllerReference
  var createdDate: Date
  var description: String
  var enabled: Boolean
  var id: Double
  var messageQueueUrl: String
  var name: String
  var reservedForBuild: String
  var server: XamlBuildServerReference
  var status: AgentStatus
  var statusMessage: String
  var updatedDate: Date
  var uri: String
  var url: String
}

object BuildAgent {
  @scala.inline
  def apply(
    buildDirectory: String,
    controller: XamlBuildControllerReference,
    createdDate: Date,
    description: String,
    enabled: Boolean,
    id: Double,
    messageQueueUrl: String,
    name: String,
    reservedForBuild: String,
    server: XamlBuildServerReference,
    status: AgentStatus,
    statusMessage: String,
    updatedDate: Date,
    uri: String,
    url: String
  ): BuildAgent = {
    val __obj = js.Dynamic.literal(buildDirectory = buildDirectory, controller = controller, createdDate = createdDate, description = description, enabled = enabled, id = id, messageQueueUrl = messageQueueUrl, name = name, reservedForBuild = reservedForBuild, server = server, status = status, statusMessage = statusMessage, updatedDate = updatedDate, uri = uri, url = url)
  
    __obj.asInstanceOf[BuildAgent]
  }
}

