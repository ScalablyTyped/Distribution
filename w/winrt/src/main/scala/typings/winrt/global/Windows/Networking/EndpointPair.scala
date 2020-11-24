package typings.winrt.global.Windows.Networking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Networking.EndpointPair")
@js.native
class EndpointPair protected ()
  extends typings.winrt.Windows.Networking.EndpointPair {
  def this(
    localHostName: typings.winrt.Windows.Networking.HostName,
    localServiceName: String,
    remoteHostName: typings.winrt.Windows.Networking.HostName,
    remoteServiceName: String
  ) = this()
}
