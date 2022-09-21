package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object balanceMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/balance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/balance", "BalanceInstance")
  @js.native
  open class BalanceInstance protected () extends SerializableClass {
    /**
      * Initialize the BalanceContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - Account Sid.
      */
    def this(version: typings.twilio.v2010Mod.^, payload: BalancePayload, accountSid: String) = this()
    
    var accountSid: String = js.native
    
    var balance: String = js.native
    
    var currency: String = js.native
  }
  
  /**
    * Initialize the BalanceList
    *
    * @param version - Version of the resource
    * @param accountSid - Account Sid.
    */
  inline def BalanceList(version: typings.twilio.v2010Mod.^, accountSid: String): BalanceListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("BalanceList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any])).asInstanceOf[BalanceListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/balance", "BalancePage")
  @js.native
  open class BalancePage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.v2010Mod.^, BalancePayload, BalanceResource, BalanceInstance] {
    /**
      * Initialize the BalancePage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: BalanceSolution
    ) = this()
    
    /**
      * Build an instance of BalanceInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: BalancePayload): BalanceInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait BalanceListInstance extends StObject {
    
    /**
      * fetch a BalanceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[BalanceInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[BalanceInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait BalancePayload
    extends StObject
       with BalanceResource
       with TwilioResponsePayload
  object BalancePayload {
    
    inline def apply(
      account_sid: String,
      balance: String,
      currency: String,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String
    ): BalancePayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[BalancePayload]
    }
  }
  
  trait BalanceResource extends StObject {
    
    var account_sid: String
    
    var balance: String
    
    var currency: String
  }
  object BalanceResource {
    
    inline def apply(account_sid: String, balance: String, currency: String): BalanceResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
      __obj.asInstanceOf[BalanceResource]
    }
    
    extension [Self <: BalanceResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setBalance(value: String): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    }
  }
  
  trait BalanceSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
  }
  object BalanceSolution {
    
    inline def apply(): BalanceSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BalanceSolution]
    }
    
    extension [Self <: BalanceSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
    }
  }
}
