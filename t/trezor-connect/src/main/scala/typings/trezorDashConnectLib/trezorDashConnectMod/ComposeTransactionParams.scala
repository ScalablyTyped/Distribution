package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeTransactionParams extends CommonParams {
  var coin: java.lang.String
  var outputs: js.Array[Output]
  var push: js.UndefOr[scala.Boolean] = js.undefined
}

