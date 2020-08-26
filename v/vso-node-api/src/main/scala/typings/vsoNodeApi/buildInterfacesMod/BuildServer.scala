package typings.vsoNodeApi.buildInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildServer extends js.Object {
  var agents: js.Array[BuildAgentReference] = js.native
  var controller: XamlBuildControllerReference = js.native
  var id: Double = js.native
  var isVirtual: Boolean = js.native
  var messageQueueUrl: String = js.native
  var name: String = js.native
  var requireClientCertificates: Boolean = js.native
  var status: ServiceHostStatus = js.native
  var statusChangedDate: Date = js.native
  var uri: String = js.native
  var url: String = js.native
  var version: Double = js.native
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
  @scala.inline
  implicit class BuildServerOps[Self <: BuildServer] (val x: Self) extends AnyVal {
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
    def setAgentsVarargs(value: BuildAgentReference*): Self = this.set("agents", js.Array(value :_*))
    @scala.inline
    def setAgents(value: js.Array[BuildAgentReference]): Self = this.set("agents", value.asInstanceOf[js.Any])
    @scala.inline
    def setController(value: XamlBuildControllerReference): Self = this.set("controller", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsVirtual(value: Boolean): Self = this.set("isVirtual", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageQueueUrl(value: String): Self = this.set("messageQueueUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequireClientCertificates(value: Boolean): Self = this.set("requireClientCertificates", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: ServiceHostStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusChangedDate(value: Date): Self = this.set("statusChangedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

