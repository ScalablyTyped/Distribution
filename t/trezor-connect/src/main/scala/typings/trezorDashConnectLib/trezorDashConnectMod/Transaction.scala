package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
    // signer signatures
  var serializedTx: java.lang.String
  var signatures: js.Array[java.lang.String]
    // serialized transaction
  var txid: js.UndefOr[java.lang.String] = js.undefined
}

