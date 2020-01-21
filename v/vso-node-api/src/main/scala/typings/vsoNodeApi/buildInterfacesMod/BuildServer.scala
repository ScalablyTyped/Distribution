package typings.vsoNodeApi.buildInterfacesMod

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
    val __obj = js.Dynamic.literal(agents = agents.asInstanceOf[js.Any], controller = controller.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isVirtual = isVirtual.asInstanceOf[js.Any], messageQueueUrl = messageQueueUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], requireClientCertificates = requireClientCertificates.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusChangedDate = statusChangedDate.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BuildServer]
  }
}

