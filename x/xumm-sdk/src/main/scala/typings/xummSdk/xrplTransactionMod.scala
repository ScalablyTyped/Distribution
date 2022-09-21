package typings.xummSdk

import org.scalablytyped.runtime.StringDictionary
import typings.xummSdk.anon.Counterparty
import typings.xummSdk.anyJsonMod.AnyJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xrplTransactionMod {
  
  trait XrplTransaction extends StObject {
    
    var balanceChanges: StringDictionary[js.Array[Counterparty]]
    
    var node: String
    
    var transaction: AnyJson
    
    var txid: String
  }
  object XrplTransaction {
    
    inline def apply(
      balanceChanges: StringDictionary[js.Array[Counterparty]],
      node: String,
      transaction: AnyJson,
      txid: String
    ): XrplTransaction = {
      val __obj = js.Dynamic.literal(balanceChanges = balanceChanges.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any], txid = txid.asInstanceOf[js.Any])
      __obj.asInstanceOf[XrplTransaction]
    }
    
    extension [Self <: XrplTransaction](x: Self) {
      
      inline def setBalanceChanges(value: StringDictionary[js.Array[Counterparty]]): Self = StObject.set(x, "balanceChanges", value.asInstanceOf[js.Any])
      
      inline def setNode(value: String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setTransaction(value: AnyJson): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
      
      inline def setTxid(value: String): Self = StObject.set(x, "txid", value.asInstanceOf[js.Any])
    }
  }
}
