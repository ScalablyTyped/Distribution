package typings
package winrtLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIPInformation extends js.Object {
  var networkAdapter: NetworkAdapter
  var prefixLength: scala.Double
}

object IIPInformation {
  @scala.inline
  def apply(networkAdapter: NetworkAdapter, prefixLength: scala.Double): IIPInformation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("networkAdapter")(networkAdapter)
    __obj.updateDynamic("prefixLength")(prefixLength)
    __obj.asInstanceOf[IIPInformation]
  }
}

