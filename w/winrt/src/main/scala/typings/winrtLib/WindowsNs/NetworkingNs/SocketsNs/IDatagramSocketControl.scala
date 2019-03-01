package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatagramSocketControl extends js.Object {
  var outboundUnicastHopLimit: scala.Double
  var qualityOfService: SocketQualityOfService
}

object IDatagramSocketControl {
  @scala.inline
  def apply(outboundUnicastHopLimit: scala.Double, qualityOfService: SocketQualityOfService): IDatagramSocketControl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("outboundUnicastHopLimit")(outboundUnicastHopLimit)
    __obj.updateDynamic("qualityOfService")(qualityOfService)
    __obj.asInstanceOf[IDatagramSocketControl]
  }
}

