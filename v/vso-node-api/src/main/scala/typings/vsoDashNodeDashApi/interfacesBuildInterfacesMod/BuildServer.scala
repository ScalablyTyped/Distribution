package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildServer extends js.Object {
  var agents: js.Array[BuildAgentReference]
  var controller: XamlBuildControllerReference
  var id: Double
  var isVirtual: Boolean
  var messageQueueUrl: String
  var name: String
  var requireClientCertificates: Boolean
  var status: ServiceHostStatus
  var statusChangedDate: Date
  var uri: String
  var url: String
  var version: Double
}

object BuildServer {
  @scala.inline
  def apply(
    agents: js.Array[BuildAgentReference],
    controller: XamlBuildControllerReference,
    id: Double,
    isVirtual: Boolean,
    messageQueueUrl: String,
    name: String,
    requireClientCertificates: Boolean,
    status: ServiceHostStatus,
    statusChangedDate: Date,
    uri: String,
    url: String,
    version: Double
  ): BuildServer = {
    val __obj = js.Dynamic.literal(agents = agents, controller = controller, id = id, isVirtual = isVirtual, messageQueueUrl = messageQueueUrl, name = name, requireClientCertificates = requireClientCertificates, status = status, statusChangedDate = statusChangedDate, uri = uri, url = url, version = version)
  
    __obj.asInstanceOf[BuildServer]
  }
}

