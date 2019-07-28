package typings.winrt.WindowsNs.NetworkingNs

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
    val __obj = js.Dynamic.literal(localHostName = localHostName, localServiceName = localServiceName, remoteHostName = remoteHostName, remoteServiceName = remoteServiceName)
  
    __obj.asInstanceOf[IEndpointPair]
  }
}

