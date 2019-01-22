package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAddressParams extends CommonParams {
  var coin: js.UndefOr[java.lang.String] = js.undefined
  var crossChain: js.UndefOr[scala.Boolean] = js.undefined
  var path: java.lang.String | js.Array[scala.Double]
  var showOnTrezor: js.UndefOr[scala.Boolean] = js.undefined
}

