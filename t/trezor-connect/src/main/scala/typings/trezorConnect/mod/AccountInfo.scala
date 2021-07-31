package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountInfo extends StObject {
  
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
  
  var usedAddresses: js.Array[typings.trezorConnect.anon.Address]
  
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
    usedAddresses: js.Array[typings.trezorConnect.anon.Address],
    utxo: js.Array[Utxo],
    xpub: String
  ): AccountInfo = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], addressIndex = addressIndex.asInstanceOf[js.Any], addressPath = addressPath.asInstanceOf[js.Any], addressSerializedPath = addressSerializedPath.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any], confirmed = confirmed.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], serializedPath = serializedPath.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any], unusedAddresses = unusedAddresses.asInstanceOf[js.Any], usedAddresses = usedAddresses.asInstanceOf[js.Any], utxo = utxo.asInstanceOf[js.Any], xpub = xpub.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountInfo]
  }
  
  @scala.inline
  implicit class AccountInfoMutableBuilder[Self <: AccountInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressIndex(value: Double): Self = StObject.set(x, "addressIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressPath(value: js.Array[Double]): Self = StObject.set(x, "addressPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressPathVarargs(value: Double*): Self = StObject.set(x, "addressPath", js.Array(value :_*))
    
    @scala.inline
    def setAddressSerializedPath(value: String): Self = StObject.set(x, "addressSerializedPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBalance(value: Double): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmed(value: Double): Self = StObject.set(x, "confirmed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    @scala.inline
    def setSerializedPath(value: String): Self = StObject.set(x, "serializedPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactions(value: Double): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnusedAddresses(value: js.Array[String]): Self = StObject.set(x, "unusedAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnusedAddressesVarargs(value: String*): Self = StObject.set(x, "unusedAddresses", js.Array(value :_*))
    
    @scala.inline
    def setUsedAddresses(value: js.Array[typings.trezorConnect.anon.Address]): Self = StObject.set(x, "usedAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedAddressesVarargs(value: typings.trezorConnect.anon.Address*): Self = StObject.set(x, "usedAddresses", js.Array(value :_*))
    
    @scala.inline
    def setUtxo(value: js.Array[Utxo]): Self = StObject.set(x, "utxo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtxoVarargs(value: Utxo*): Self = StObject.set(x, "utxo", js.Array(value :_*))
    
    @scala.inline
    def setXpub(value: String): Self = StObject.set(x, "xpub", value.asInstanceOf[js.Any])
  }
}
