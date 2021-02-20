package typings.winrt.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStreamSocketListenerControl extends StObject {
  
  var qualityOfService: SocketQualityOfService = js.native
}
object IStreamSocketListenerControl {
  
  @scala.inline
  def apply(qualityOfService: SocketQualityOfService): IStreamSocketListenerControl = {
    val __obj = js.Dynamic.literal(qualityOfService = qualityOfService.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStreamSocketListenerControl]
  }
  
  @scala.inline
  implicit class IStreamSocketListenerControlMutableBuilder[Self <: IStreamSocketListenerControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQualityOfService(value: SocketQualityOfService): Self = StObject.set(x, "qualityOfService", value.asInstanceOf[js.Any])
  }
}
