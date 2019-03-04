package typings
package winrtLib.WindowsNs.NetworkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEndpointPairFactory extends js.Object {
  def createEndpointPair(
    localHostName: HostName,
    localServiceName: java.lang.String,
    remoteHostName: HostName,
    remoteServiceName: java.lang.String
  ): EndpointPair
}

object IEndpointPairFactory {
  @scala.inline
  def apply(
    createEndpointPair: js.Function4[HostName, java.lang.String, HostName, java.lang.String, EndpointPair]
  ): IEndpointPairFactory = {
    val __obj = js.Dynamic.literal(createEndpointPair = createEndpointPair)
  
    __obj.asInstanceOf[IEndpointPairFactory]
  }
}

