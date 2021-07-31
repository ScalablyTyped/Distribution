package typings.winrt.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatagramSocketControl
  extends StObject
     with IDatagramSocketControl
object DatagramSocketControl {
  
  @scala.inline
  def apply(outboundUnicastHopLimit: Double, qualityOfService: SocketQualityOfService): DatagramSocketControl = {
    val __obj = js.Dynamic.literal(outboundUnicastHopLimit = outboundUnicastHopLimit.asInstanceOf[js.Any], qualityOfService = qualityOfService.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatagramSocketControl]
  }
}
