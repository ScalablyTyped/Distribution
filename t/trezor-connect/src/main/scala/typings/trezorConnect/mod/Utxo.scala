package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Utxo extends StObject {
  
  // how much money sent
  var addressPath: js.Tuple2[Double, Double] = js.native
  
  // null == unconfirmed
  var coinbase: Boolean = js.native
  
  // path
  var height: Double | Null = js.native
  
  var index: Double = js.native
  
  // virtual size - segwit concept - same as size in non-segwit
  var own: Boolean = js.native
  
  // index of output IN THE TRANSACTION
  var transactionHash: String = js.native
  
  var tsize: Double = js.native
  
  // hash of the transaction
  var value: Double = js.native
  
  // total size - in case of segwit, total, with segwit data
  var vsize: Double = js.native
}
object Utxo {
  
  @scala.inline
  def apply(
    addressPath: js.Tuple2[Double, Double],
    coinbase: Boolean,
    index: Double,
    own: Boolean,
    transactionHash: String,
    tsize: Double,
    value: Double,
    vsize: Double
  ): Utxo = {
    val __obj = js.Dynamic.literal(addressPath = addressPath.asInstanceOf[js.Any], coinbase = coinbase.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], own = own.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any], tsize = tsize.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], vsize = vsize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Utxo]
  }
  
  @scala.inline
  implicit class UtxoMutableBuilder[Self <: Utxo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressPath(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "addressPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoinbase(value: Boolean): Self = StObject.set(x, "coinbase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightNull: Self = StObject.set(x, "height", null)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwn(value: Boolean): Self = StObject.set(x, "own", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionHash(value: String): Self = StObject.set(x, "transactionHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsize(value: Double): Self = StObject.set(x, "tsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVsize(value: Double): Self = StObject.set(x, "vsize", value.asInstanceOf[js.Any])
  }
}
