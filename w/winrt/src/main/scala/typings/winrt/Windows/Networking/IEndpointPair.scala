package typings.winrt.Windows.Networking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEndpointPair extends js.Object {
  var localHostName: HostName
  var localServiceName: String
  var remoteHostName: HostName
  var remoteServiceName: String
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
}

