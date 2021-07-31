package typings.web3Core.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignedTransaction extends StObject {
  
  var messageHash: js.UndefOr[String] = js.undefined
  
  var r: String
  
  var rawTransaction: js.UndefOr[String] = js.undefined
  
  var s: String
  
  var transactionHash: js.UndefOr[String] = js.undefined
  
  var v: String
}
object SignedTransaction {
  
  @scala.inline
  def apply(r: String, s: String, v: String): SignedTransaction = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedTransaction]
  }
  
  @scala.inline
  implicit class SignedTransactionMutableBuilder[Self <: SignedTransaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageHash(value: String): Self = StObject.set(x, "messageHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageHashUndefined: Self = StObject.set(x, "messageHash", js.undefined)
    
    @scala.inline
    def setR(value: String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawTransaction(value: String): Self = StObject.set(x, "rawTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawTransactionUndefined: Self = StObject.set(x, "rawTransaction", js.undefined)
    
    @scala.inline
    def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionHash(value: String): Self = StObject.set(x, "transactionHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionHashUndefined: Self = StObject.set(x, "transactionHash", js.undefined)
    
    @scala.inline
    def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
  }
}
