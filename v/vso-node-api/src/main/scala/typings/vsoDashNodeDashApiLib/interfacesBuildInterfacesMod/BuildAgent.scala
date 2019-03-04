package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildAgent extends js.Object {
  var buildDirectory: java.lang.String
  var controller: XamlBuildControllerReference
  var createdDate: stdLib.Date
  var description: java.lang.String
  var enabled: scala.Boolean
  var id: scala.Double
  var messageQueueUrl: java.lang.String
  var name: java.lang.String
  var reservedForBuild: java.lang.String
  var server: XamlBuildServerReference
  var status: AgentStatus
  var statusMessage: java.lang.String
  var updatedDate: stdLib.Date
  var uri: java.lang.String
  var url: java.lang.String
}

object BuildAgent {
  @scala.inline
  def apply(
    buildDirectory: java.lang.String,
    controller: XamlBuildControllerReference,
    createdDate: stdLib.Date,
    description: java.lang.String,
    enabled: scala.Boolean,
    id: scala.Double,
    messageQueueUrl: java.lang.String,
    name: java.lang.String,
    reservedForBuild: java.lang.String,
    server: XamlBuildServerReference,
    status: AgentStatus,
    statusMessage: java.lang.String,
    updatedDate: stdLib.Date,
    uri: java.lang.String,
    url: java.lang.String
  ): BuildAgent = {
    val __obj = js.Dynamic.literal(buildDirectory = buildDirectory, controller = controller, createdDate = createdDate, description = description, enabled = enabled, id = id, messageQueueUrl = messageQueueUrl, name = name, reservedForBuild = reservedForBuild, server = server, status = status, statusMessage = statusMessage, updatedDate = updatedDate, uri = uri, url = url)
  
    __obj.asInstanceOf[BuildAgent]
  }
}

