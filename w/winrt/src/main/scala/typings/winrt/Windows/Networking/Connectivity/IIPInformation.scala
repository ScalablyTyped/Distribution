package typings.winrt.Windows.Networking.Connectivity

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
    val __obj = js.Dynamic.literal(networkAdapter = networkAdapter.asInstanceOf[js.Any], prefixLength = prefixLength.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IIPInformation]
  }
}

