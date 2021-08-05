package typings.winrt.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDatagramSocketControl extends StObject {
  
  var outboundUnicastHopLimit: Double
  
  var qualityOfService: SocketQualityOfService
}
object IDatagramSocketControl {
  
  inline def apply(outboundUnicastHopLimit: Double, qualityOfService: SocketQualityOfService): IDatagramSocketControl = {
    val __obj = js.Dynamic.literal(outboundUnicastHopLimit = outboundUnicastHopLimit.asInstanceOf[js.Any], qualityOfService = qualityOfService.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatagramSocketControl]
  }
  
  extension [Self <: IDatagramSocketControl](x: Self) {
    
    inline def setOutboundUnicastHopLimit(value: Double): Self = StObject.set(x, "outboundUnicastHopLimit", value.asInstanceOf[js.Any])
    
    inline def setQualityOfService(value: SocketQualityOfService): Self = StObject.set(x, "qualityOfService", value.asInstanceOf[js.Any])
  }
}
