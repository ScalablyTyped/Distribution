package typings.winrt.Windows.Networking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEndpointPairFactory extends js.Object {
  def createEndpointPair(
    localHostName: HostName,
    localServiceName: String,
    remoteHostName: HostName,
    remoteServiceName: String
  ): EndpointPair
}

object IEndpointPairFactory {
  @scala.inline
  def apply(createEndpointPair: (HostName, String, HostName, String) => EndpointPair): IEndpointPairFactory = {
    val __obj = js.Dynamic.literal(createEndpointPair = js.Any.fromFunction4(createEndpointPair))
    __obj.asInstanceOf[IEndpointPairFactory]
  }
}

