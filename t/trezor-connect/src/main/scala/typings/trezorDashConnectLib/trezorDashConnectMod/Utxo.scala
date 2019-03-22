package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Utxo extends js.Object {
   // how much money sent
  var addressPath: js.Tuple2[scala.Double, scala.Double]
   // null == unconfirmed
  var coinbase: scala.Boolean
   // path
  var height: scala.Double | scala.Null
  var index: scala.Double
   // virtual size - segwit concept - same as size in non-segwit
  var own: scala.Boolean
   // index of output IN THE TRANSACTION
  var transactionHash: java.lang.String
  var tsize: scala.Double
   // hash of the transaction
  var value: scala.Double
   // total size - in case of segwit, total, with segwit data
  var vsize: scala.Double
}

object Utxo {
  @scala.inline
  def apply(
    addressPath: js.Tuple2[scala.Double, scala.Double],
    coinbase: scala.Boolean,
    index: scala.Double,
    own: scala.Boolean,
    transactionHash: java.lang.String,
    tsize: scala.Double,
    value: scala.Double,
    vsize: scala.Double,
    height: scala.Int | scala.Double = null
  ): Utxo = {
    val __obj = js.Dynamic.literal(addressPath = addressPath, coinbase = coinbase, index = index, own = own, transactionHash = transactionHash, tsize = tsize, value = value, vsize = vsize)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[Utxo]
  }
}

