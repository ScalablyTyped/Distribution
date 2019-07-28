package typings.winrt.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIPInformation extends js.Object {
  var networkAdapter: NetworkAdapter
  var prefixLength: Double
}

object IIPInformation {
  @scala.inline
  def apply(networkAdapter: NetworkAdapter, prefixLength: Double): IIPInformation = {
    val __obj = js.Dynamic.literal(networkAdapter = networkAdapter, prefixLength = prefixLength)
  
    __obj.asInstanceOf[IIPInformation]
  }
}

