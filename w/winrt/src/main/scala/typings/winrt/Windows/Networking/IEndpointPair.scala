package typings.winrt.Windows.Networking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEndpointPair extends js.Object {
  var localHostName: HostName = js.native
  var localServiceName: String = js.native
  var remoteHostName: HostName = js.native
  var remoteServiceName: String = js.native
}

object IEndpointPair {
  @scala.inline
  def apply(
    localHostName: HostName,
    localServiceName: String,
    remoteHostName: HostName,
    remoteServiceName: String
  ): IEndpointPair = {
    val __obj = js.Dynamic.literal(localHostName = localHostName.asInstanceOf[js.Any], localServiceName = localServiceName.asInstanceOf[js.Any], remoteHostName = remoteHostName.asInstanceOf[js.Any], remoteServiceName = remoteServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEndpointPair]
  }
  @scala.inline
  implicit class IEndpointPairOps[Self <: IEndpointPair] (val x: Self) extends AnyVal {
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
    def setLocalHostName(value: HostName): Self = this.set("localHostName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalServiceName(value: String): Self = this.set("localServiceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoteHostName(value: HostName): Self = this.set("remoteHostName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoteServiceName(value: String): Self = this.set("remoteServiceName", value.asInstanceOf[js.Any])
  }
  
}

