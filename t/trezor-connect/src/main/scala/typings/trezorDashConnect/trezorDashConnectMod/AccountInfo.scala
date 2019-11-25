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
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], addressIndex = addressIndex.asInstanceOf[js.Any], addressPath = addressPath.asInstanceOf[js.Any], addressSerializedPath = addressSerializedPath.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any], confirmed = confirmed.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], serializedPath = serializedPath.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any], unusedAddresses = unusedAddresses.asInstanceOf[js.Any], usedAddresses = usedAddresses.asInstanceOf[js.Any], utxo = utxo.asInstanceOf[js.Any], xpub = xpub.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AccountInfo]
  }
}

