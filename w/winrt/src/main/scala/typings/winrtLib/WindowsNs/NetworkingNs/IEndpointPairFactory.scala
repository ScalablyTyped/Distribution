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

