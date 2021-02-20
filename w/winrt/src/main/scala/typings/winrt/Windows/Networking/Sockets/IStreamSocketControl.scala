package typings.winrt.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStreamSocketControl extends StObject {
  
  var keepAlive: Boolean = js.native
  
  var noDelay: Boolean = js.native
  
  var outboundBufferSizeInBytes: Double = js.native
  
  var outboundUnicastHopLimit: Double = js.native
  
  var qualityOfService: SocketQualityOfService = js.native
}
object IStreamSocketControl {
  
  @scala.inline
  def apply(
    keepAlive: Boolean,
    noDelay: Boolean,
    outboundBufferSizeInBytes: Double,
    outboundUnicastHopLimit: Double,
    qualityOfService: SocketQualityOfService
  ): IStreamSocketControl = {
    val __obj = js.Dynamic.literal(keepAlive = keepAlive.asInstanceOf[js.Any], noDelay = noDelay.asInstanceOf[js.Any], outboundBufferSizeInBytes = outboundBufferSizeInBytes.asInstanceOf[js.Any], outboundUnicastHopLimit = outboundUnicastHopLimit.asInstanceOf[js.Any], qualityOfService = qualityOfService.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStreamSocketControl]
  }
  
  @scala.inline
  implicit class IStreamSocketControlMutableBuilder[Self <: IStreamSocketControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDelay(value: Boolean): Self = StObject.set(x, "noDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutboundBufferSizeInBytes(value: Double): Self = StObject.set(x, "outboundBufferSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutboundUnicastHopLimit(value: Double): Self = StObject.set(x, "outboundUnicastHopLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityOfService(value: SocketQualityOfService): Self = StObject.set(x, "qualityOfService", value.asInstanceOf[js.Any])
  }
}
