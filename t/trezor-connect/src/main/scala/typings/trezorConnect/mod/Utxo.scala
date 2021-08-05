package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Utxo extends StObject {
  
  // how much money sent
  var addressPath: js.Tuple2[Double, Double]
  
  // null == unconfirmed
  var coinbase: Boolean
  
  // path
  var height: Double | Null
  
  var index: Double
  
  // virtual size - segwit concept - same as size in non-segwit
  var own: Boolean
  
  // index of output IN THE TRANSACTION
  var transactionHash: String
  
  var tsize: Double
  
  // hash of the transaction
  var value: Double
  
  // total size - in case of segwit, total, with segwit data
  var vsize: Double
}
object Utxo {
  
  inline def apply(
    addressPath: js.Tuple2[Double, Double],
    coinbase: Boolean,
    index: Double,
    own: Boolean,
    transactionHash: String,
    tsize: Double,
    value: Double,
    vsize: Double
  ): Utxo = {
    val __obj = js.Dynamic.literal(addressPath = addressPath.asInstanceOf[js.Any], coinbase = coinbase.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], own = own.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any], tsize = tsize.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], vsize = vsize.asInstanceOf[js.Any], height = null)
    __obj.asInstanceOf[Utxo]
  }
  
  extension [Self <: Utxo](x: Self) {
    
    inline def setAddressPath(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "addressPath", value.asInstanceOf[js.Any])
    
    inline def setCoinbase(value: Boolean): Self = StObject.set(x, "coinbase", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightNull: Self = StObject.set(x, "height", null)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setOwn(value: Boolean): Self = StObject.set(x, "own", value.asInstanceOf[js.Any])
    
    inline def setTransactionHash(value: String): Self = StObject.set(x, "transactionHash", value.asInstanceOf[js.Any])
    
    inline def setTsize(value: Double): Self = StObject.set(x, "tsize", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setVsize(value: Double): Self = StObject.set(x, "vsize", value.asInstanceOf[js.Any])
  }
}
