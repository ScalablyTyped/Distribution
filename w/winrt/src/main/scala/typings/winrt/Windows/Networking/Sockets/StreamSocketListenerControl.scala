package typings.winrt.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamSocketListenerControl
  extends StObject
     with IStreamSocketListenerControl
object StreamSocketListenerControl {
  
  inline def apply(qualityOfService: SocketQualityOfService): StreamSocketListenerControl = {
    val __obj = js.Dynamic.literal(qualityOfService = qualityOfService.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamSocketListenerControl]
  }
}
