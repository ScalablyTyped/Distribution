package typings.trezorDashConnect.trezorDashConnectMod

import typings.trezorDashConnect.Anon_Address
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountInfo extends js.Object {
  // These fields are returned, presumably, to save further calls when the use case requires
  // a usable address:
  var address: String
  var addressIndex: Double
  var addressPath: js.Array[Double]
  var addressSerializedPath: String
   // serialized HD public key. Despite the name, this may be `ypub` for segWit.
  var balance: Double
  var confirmed: Double
  var id: Double
  var path: js.Array[Double]
  var serializedPath: String
  var transactions: Double
  var unusedAddresses: js.Array[String]
  var usedAddresses: js.Array[Anon_Address]
  var utxo: js.Array[Utxo]
  var xpub: String
}

object AccountInfo {
  @scala.inline
  def apply(
    address: String,
    addressIndex: Double,
    addressPath: js.Array[Double],
    addressSerializedPath: String,
    balance: Double,
    confirmed: Double,
    id: Double,
    path: js.Array[Double],
    serializedPath: String,
    transactions: Double,
    unusedAddresses: js.Array[String],
    usedAddresses: js.Array[Anon_Address],
    utxo: js.Array[Utxo],
    xpub: String
  ): AccountInfo = {
    val __obj = js.Dynamic.literal(address = address, addressIndex = addressIndex, addressPath = addressPath, addressSerializedPath = addressSerializedPath, balance = balance, confirmed = confirmed, id = id, path = path, serializedPath = serializedPath, transactions = transactions, unusedAddresses = unusedAddresses, usedAddresses = usedAddresses, utxo = utxo, xpub = xpub)
  
    __obj.asInstanceOf[AccountInfo]
  }
}

