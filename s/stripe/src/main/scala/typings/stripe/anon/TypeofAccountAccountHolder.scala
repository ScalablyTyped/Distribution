package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofAccountAccountHolder extends StObject {
  
  val AccountHolder: Any
  
  val Balance: Any
  
  val BalanceRefresh: Any
  
  val OwnershipRefresh: Any
}
object TypeofAccountAccountHolder {
  
  inline def apply(AccountHolder: Any, Balance: Any, BalanceRefresh: Any, OwnershipRefresh: Any): TypeofAccountAccountHolder = {
    val __obj = js.Dynamic.literal(AccountHolder = AccountHolder.asInstanceOf[js.Any], Balance = Balance.asInstanceOf[js.Any], BalanceRefresh = BalanceRefresh.asInstanceOf[js.Any], OwnershipRefresh = OwnershipRefresh.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofAccountAccountHolder]
  }
  
  extension [Self <: TypeofAccountAccountHolder](x: Self) {
    
    inline def setAccountHolder(value: Any): Self = StObject.set(x, "AccountHolder", value.asInstanceOf[js.Any])
    
    inline def setBalance(value: Any): Self = StObject.set(x, "Balance", value.asInstanceOf[js.Any])
    
    inline def setBalanceRefresh(value: Any): Self = StObject.set(x, "BalanceRefresh", value.asInstanceOf[js.Any])
    
    inline def setOwnershipRefresh(value: Any): Self = StObject.set(x, "OwnershipRefresh", value.asInstanceOf[js.Any])
  }
}
