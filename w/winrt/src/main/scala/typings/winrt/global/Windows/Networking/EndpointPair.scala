package typings.winrt.global.Windows.Networking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Networking.EndpointPair")
@js.native
class EndpointPair protected ()
  extends StObject
     with typings.winrt.Windows.Networking.EndpointPair {
  def this(
    localHostName: typings.winrt.Windows.Networking.HostName,
    localServiceName: String,
    remoteHostName: typings.winrt.Windows.Networking.HostName,
    remoteServiceName: String
  ) = this()
  
  /* CompleteClass */
  var localHostName: typings.winrt.Windows.Networking.HostName = js.native
  
  /* CompleteClass */
  var localServiceName: String = js.native
  
  /* CompleteClass */
  var remoteHostName: typings.winrt.Windows.Networking.HostName = js.native
  
  /* CompleteClass */
  var remoteServiceName: String = js.native
}
