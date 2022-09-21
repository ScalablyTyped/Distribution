package typings.trezorConnect.anon

import typings.trezorConnect.accountMod.AccountTransaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tokens extends StObject {
  
  // total transactions (unknown in ripple)
  var tokens: js.UndefOr[Double] = js.undefined
  
  var total: Double
  
  // unconfirmed transactions (unknown in ripple)
  var transactions: js.UndefOr[js.Array[AccountTransaction]] = js.undefined
  
  // list of transactions
  var txids: js.UndefOr[js.Array[String]] = js.undefined
  
  // tokens transactions (unknown in ripple)
  var unconfirmed: js.UndefOr[Double] = js.undefined
}
object Tokens {
  
  inline def apply(total: Double): Tokens = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tokens]
  }
  
  extension [Self <: Tokens](x: Self) {
    
    inline def setTokens(value: Double): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTransactions(value: js.Array[AccountTransaction]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
    
    inline def setTransactionsUndefined: Self = StObject.set(x, "transactions", js.undefined)
    
    inline def setTransactionsVarargs(value: AccountTransaction*): Self = StObject.set(x, "transactions", js.Array(value*))
    
    inline def setTxids(value: js.Array[String]): Self = StObject.set(x, "txids", value.asInstanceOf[js.Any])
    
    inline def setTxidsUndefined: Self = StObject.set(x, "txids", js.undefined)
    
    inline def setTxidsVarargs(value: String*): Self = StObject.set(x, "txids", js.Array(value*))
    
    inline def setUnconfirmed(value: Double): Self = StObject.set(x, "unconfirmed", value.asInstanceOf[js.Any])
    
    inline def setUnconfirmedUndefined: Self = StObject.set(x, "unconfirmed", js.undefined)
  }
}
