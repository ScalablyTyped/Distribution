package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignedTransaction extends js.Object {
  var serializedTx: java.lang.String
  var signatures: js.Array[java.lang.String]
  var txId: js.UndefOr[java.lang.String] = js.undefined
}

