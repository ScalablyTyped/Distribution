package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildServer extends js.Object {
  var agents: js.Array[BuildAgentReference]
  var controller: XamlBuildControllerReference
  var id: scala.Double
  var isVirtual: scala.Boolean
  var messageQueueUrl: java.lang.String
  var name: java.lang.String
  var requireClientCertificates: scala.Boolean
  var status: ServiceHostStatus
  var statusChangedDate: stdLib.Date
  var uri: java.lang.String
  var url: java.lang.String
  var version: scala.Double
}

object BuildServer {
  @scala.inline
  def apply(
    agents: js.Array[BuildAgentReference],
    controller: XamlBuildControllerReference,
    id: scala.Double,
    isVirtual: scala.Boolean,
    messageQueueUrl: java.lang.String,
    name: java.lang.String,
    requireClientCertificates: scala.Boolean,
    status: ServiceHostStatus,
    statusChangedDate: stdLib.Date,
    uri: java.lang.String,
    url: java.lang.String,
    version: scala.Double
  ): BuildServer = {
    val __obj = js.Dynamic.literal(agents = agents, controller = controller, id = id, isVirtual = isVirtual, messageQueueUrl = messageQueueUrl, name = name, requireClientCertificates = requireClientCertificates, status = status, statusChangedDate = statusChangedDate, uri = uri, url = url, version = version)
  
    __obj.asInstanceOf[BuildServer]
  }
}

