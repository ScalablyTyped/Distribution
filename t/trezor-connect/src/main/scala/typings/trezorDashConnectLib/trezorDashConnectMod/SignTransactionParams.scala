package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignTransactionParams extends CommonParams {
  var coin: java.lang.String
  var inputs: js.Array[Input]
  var outputs: js.Array[Output]
  var push: js.UndefOr[scala.Boolean] = js.undefined
}

