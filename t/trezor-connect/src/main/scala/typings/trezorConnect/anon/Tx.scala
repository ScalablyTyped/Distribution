package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptBackendTransactionsMod.BlockbookTransaction
import typings.trezorConnect.libTypescriptBackendTransactionsMod.TypedRawTransaction
import typings.trezorConnect.trezorConnectStrings.blockbook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tx
  extends StObject
     with TypedRawTransaction {
  
  var tx: BlockbookTransaction
  
  var `type`: blockbook
}
object Tx {
  
  inline def apply(tx: BlockbookTransaction): Tx = {
    val __obj = js.Dynamic.literal(tx = tx.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("blockbook")
    __obj.asInstanceOf[Tx]
  }
  
  extension [Self <: Tx](x: Self) {
    
    inline def setTx(value: BlockbookTransaction): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
    
    inline def setType(value: blockbook): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
