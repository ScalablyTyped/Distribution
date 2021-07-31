package typings.winrtUwp.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SocketQualityOfService extends StObject
/** Specifies the quality of service for a DatagramSocket or StreamSocket object. */
@JSGlobal("Windows.Networking.Sockets.SocketQualityOfService")
@js.native
object SocketQualityOfService extends StObject {
  
  /** Low latency quality of service commonly used for audio. */
  @js.native
  sealed trait lowLatency
    extends StObject
       with SocketQualityOfService
  
  /** Normal quality of service. */
  @js.native
  sealed trait normal
    extends StObject
       with SocketQualityOfService
}
