package typings
package winrtLib.WindowsNs.NetworkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEndpointPair extends js.Object {
  var localHostName: HostName
  var localServiceName: java.lang.String
  var remoteHostName: HostName
  var remoteServiceName: java.lang.String
}

object IEndpointPair {
  @scala.inline
  def apply(
    localHostName: HostName,
    localServiceName: java.lang.String,
    remoteHostName: HostName,
    remoteServiceName: java.lang.String
  ): IEndpointPair = {
    val __obj = js.Dynamic.literal(localHostName = localHostName, localServiceName = localServiceName, remoteHostName = remoteHostName, remoteServiceName = remoteServiceName)
  
    __obj.asInstanceOf[IEndpointPair]
  }
}

