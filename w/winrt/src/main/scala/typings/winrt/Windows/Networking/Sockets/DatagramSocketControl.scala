package typings.winrt.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatagramSocketControl extends IDatagramSocketControl

object DatagramSocketControl {
  @scala.inline
  def apply(outboundUnicastHopLimit: Double, qualityOfService: SocketQualityOfService): DatagramSocketControl = {
    val __obj = js.Dynamic.literal(outboundUnicastHopLimit = outboundUnicastHopLimit.asInstanceOf[js.Any], qualityOfService = qualityOfService.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatagramSocketControl]
  }
}

