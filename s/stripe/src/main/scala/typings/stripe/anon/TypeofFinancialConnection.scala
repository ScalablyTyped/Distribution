package typings.stripe.anon

import org.scalablytyped.runtime.Instantiable0
import typings.stripe.mod.Stripe.FinancialConnections.AccountsResource
import typings.stripe.mod.Stripe.FinancialConnections.SessionsResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofFinancialConnection extends StObject {
  
  val Account: TypeofAccountAccountHolder
  
  val AccountListParams: Any
  
  val AccountRefreshParams: Any
  
  var AccountsResource: Instantiable0[typings.stripe.mod.Stripe.FinancialConnections.AccountsResource]
  
  val Session: TypeofSessionAccountHolder
  
  val SessionCreateParams: TypeofSessionCreateParamsAccountHolder
  
  var SessionsResource: Instantiable0[typings.stripe.mod.Stripe.FinancialConnections.SessionsResource]
}
object TypeofFinancialConnection {
  
  inline def apply(
    Account: TypeofAccountAccountHolder,
    AccountListParams: Any,
    AccountRefreshParams: Any,
    AccountsResource: Instantiable0[AccountsResource],
    Session: TypeofSessionAccountHolder,
    SessionCreateParams: TypeofSessionCreateParamsAccountHolder,
    SessionsResource: Instantiable0[SessionsResource]
  ): TypeofFinancialConnection = {
    val __obj = js.Dynamic.literal(Account = Account.asInstanceOf[js.Any], AccountListParams = AccountListParams.asInstanceOf[js.Any], AccountRefreshParams = AccountRefreshParams.asInstanceOf[js.Any], AccountsResource = AccountsResource.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], SessionCreateParams = SessionCreateParams.asInstanceOf[js.Any], SessionsResource = SessionsResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofFinancialConnection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofFinancialConnection] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: TypeofAccountAccountHolder): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    inline def setAccountListParams(value: Any): Self = StObject.set(x, "AccountListParams", value.asInstanceOf[js.Any])
    
    inline def setAccountRefreshParams(value: Any): Self = StObject.set(x, "AccountRefreshParams", value.asInstanceOf[js.Any])
    
    inline def setAccountsResource(value: Instantiable0[AccountsResource]): Self = StObject.set(x, "AccountsResource", value.asInstanceOf[js.Any])
    
    inline def setSession(value: TypeofSessionAccountHolder): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setSessionCreateParams(value: TypeofSessionCreateParamsAccountHolder): Self = StObject.set(x, "SessionCreateParams", value.asInstanceOf[js.Any])
    
    inline def setSessionsResource(value: Instantiable0[SessionsResource]): Self = StObject.set(x, "SessionsResource", value.asInstanceOf[js.Any])
  }
}
