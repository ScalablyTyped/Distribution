package typings.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountInfo extends js.Object {
  // These fields are returned, presumably, to save further calls when the use case requires
  // a usable address:
  var address: String = js.native
  var addressIndex: Double = js.native
  var addressPath: js.Array[Double] = js.native
  var addressSerializedPath: String = js.native
   // serialized HD public key. Despite the name, this may be `ypub` for segWit.
  var balance: Double = js.native
  var confirmed: Double = js.native
  var id: Double = js.native
  var path: js.Array[Double] = js.native
  var serializedPath: String = js.native
  var transactions: Double = js.native
  var unusedAddresses: js.Array[String] = js.native
  var usedAddresses: js.Array[typings.trezorConnect.anon.Address] = js.native
  var utxo: js.Array[Utxo] = js.native
  var xpub: String = js.native
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
    usedAddresses: js.Array[typings.trezorConnect.anon.Address],
    utxo: js.Array[Utxo],
    xpub: String
  ): AccountInfo = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], addressIndex = addressIndex.asInstanceOf[js.Any], addressPath = addressPath.asInstanceOf[js.Any], addressSerializedPath = addressSerializedPath.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any], confirmed = confirmed.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], serializedPath = serializedPath.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any], unusedAddresses = unusedAddresses.asInstanceOf[js.Any], usedAddresses = usedAddresses.asInstanceOf[js.Any], utxo = utxo.asInstanceOf[js.Any], xpub = xpub.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountInfo]
  }
  @scala.inline
  implicit class AccountInfoOps[Self <: AccountInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddressIndex(value: Double): Self = this.set("addressIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddressPathVarargs(value: Double*): Self = this.set("addressPath", js.Array(value :_*))
    @scala.inline
    def setAddressPath(value: js.Array[Double]): Self = this.set("addressPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddressSerializedPath(value: String): Self = this.set("addressSerializedPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setBalance(value: Double): Self = this.set("balance", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfirmed(value: Double): Self = this.set("confirmed", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathVarargs(value: Double*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[Double]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setSerializedPath(value: String): Self = this.set("serializedPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransactions(value: Double): Self = this.set("transactions", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnusedAddressesVarargs(value: String*): Self = this.set("unusedAddresses", js.Array(value :_*))
    @scala.inline
    def setUnusedAddresses(value: js.Array[String]): Self = this.set("unusedAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsedAddressesVarargs(value: typings.trezorConnect.anon.Address*): Self = this.set("usedAddresses", js.Array(value :_*))
    @scala.inline
    def setUsedAddresses(value: js.Array[typings.trezorConnect.anon.Address]): Self = this.set("usedAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def setUtxoVarargs(value: Utxo*): Self = this.set("utxo", js.Array(value :_*))
    @scala.inline
    def setUtxo(value: js.Array[Utxo]): Self = this.set("utxo", value.asInstanceOf[js.Any])
    @scala.inline
    def setXpub(value: String): Self = this.set("xpub", value.asInstanceOf[js.Any])
  }
  
}

