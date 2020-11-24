package typings.strongholdPayJs.mod.global.Stronghold

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ERROR_CODE extends js.Object
@JSGlobal("Stronghold.ERROR_CODE")
@js.native
object ERROR_CODE extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ERROR_CODE with String] = js.native
  
  @js.native
  sealed trait CONNECTION_ERROR extends ERROR_CODE
  /* "connection_error" */ @js.native
  object CONNECTION_ERROR extends TopLevel[CONNECTION_ERROR with String]
  
  @js.native
  sealed trait CUSTOMER_BLOCKED extends ERROR_CODE
  /* "customer_blocked" */ @js.native
  object CUSTOMER_BLOCKED extends TopLevel[CUSTOMER_BLOCKED with String]
  
  @js.native
  sealed trait DISPENSARY_NOT_FOUND extends ERROR_CODE
  /* "dispensary_not_found" */ @js.native
  object DISPENSARY_NOT_FOUND extends TopLevel[DISPENSARY_NOT_FOUND with String]
  
  @js.native
  sealed trait FORBIDDEN_RESOURCE extends ERROR_CODE
  /* "forbidden_resource" */ @js.native
  object FORBIDDEN_RESOURCE extends TopLevel[FORBIDDEN_RESOURCE with String]
  
  @js.native
  sealed trait INSUFFICIENT_BALANCE extends ERROR_CODE
  /* "insufficient_balance" */ @js.native
  object INSUFFICIENT_BALANCE extends TopLevel[INSUFFICIENT_BALANCE with String]
  
  @js.native
  sealed trait INVALID_ACCESS_TOKEN extends ERROR_CODE
  /* "invalid_access_token" */ @js.native
  object INVALID_ACCESS_TOKEN extends TopLevel[INVALID_ACCESS_TOKEN with String]
  
  @js.native
  sealed trait INVALID_API_KEY extends ERROR_CODE
  /* "invalid_api_key" */ @js.native
  object INVALID_API_KEY extends TopLevel[INVALID_API_KEY with String]
  
  @js.native
  sealed trait INVALID_CHARGE_AMOUNT extends ERROR_CODE
  /* "invalid_charge_amount" */ @js.native
  object INVALID_CHARGE_AMOUNT extends TopLevel[INVALID_CHARGE_AMOUNT with String]
  
  @js.native
  sealed trait INVALID_FIELD extends ERROR_CODE
  /* "invalid_field" */ @js.native
  object INVALID_FIELD extends TopLevel[INVALID_FIELD with String]
  
  @js.native
  sealed trait INVALID_ID extends ERROR_CODE
  /* "invalid_id" */ @js.native
  object INVALID_ID extends TopLevel[INVALID_ID with String]
  
  @js.native
  sealed trait INVALID_OPERATION extends ERROR_CODE
  /* "invalid_operation" */ @js.native
  object INVALID_OPERATION extends TopLevel[INVALID_OPERATION with String]
  
  @js.native
  sealed trait LIVE_NOT_APPROVED extends ERROR_CODE
  /* "live_not_approved" */ @js.native
  object LIVE_NOT_APPROVED extends TopLevel[LIVE_NOT_APPROVED with String]
  
  @js.native
  sealed trait MERCHANT_SOFTWARE_ERROR extends ERROR_CODE
  /* "merchant_software_error" */ @js.native
  object MERCHANT_SOFTWARE_ERROR extends TopLevel[MERCHANT_SOFTWARE_ERROR with String]
  
  @js.native
  sealed trait MISSING_FIELD extends ERROR_CODE
  /* "missing_field" */ @js.native
  object MISSING_FIELD extends TopLevel[MISSING_FIELD with String]
  
  @js.native
  sealed trait NOT_FOUND extends ERROR_CODE
  /* "not_found" */ @js.native
  object NOT_FOUND extends TopLevel[NOT_FOUND with String]
  
  @js.native
  sealed trait PAYMENT_SOURCE_ACTION_REQUIRED extends ERROR_CODE
  /* "payment_source_action_required" */ @js.native
  object PAYMENT_SOURCE_ACTION_REQUIRED extends TopLevel[PAYMENT_SOURCE_ACTION_REQUIRED with String]
  
  @js.native
  sealed trait PAYMENT_SOURCE_ALREADY_EXISTS extends ERROR_CODE
  /* "payment_source_already_exists" */ @js.native
  object PAYMENT_SOURCE_ALREADY_EXISTS extends TopLevel[PAYMENT_SOURCE_ALREADY_EXISTS with String]
  
  @js.native
  sealed trait PAYMENT_SOURCE_INACTIVE extends ERROR_CODE
  /* "payment_source_inactive" */ @js.native
  object PAYMENT_SOURCE_INACTIVE extends TopLevel[PAYMENT_SOURCE_INACTIVE with String]
  
  @js.native
  sealed trait PAYMENT_SOURCE_LOGIN_REQUIRED extends ERROR_CODE
  /* "payment_source_login_required" */ @js.native
  object PAYMENT_SOURCE_LOGIN_REQUIRED extends TopLevel[PAYMENT_SOURCE_LOGIN_REQUIRED with String]
  
  @js.native
  sealed trait PAYMENT_SOURCE_LOGIN_UNAVAILABLE extends ERROR_CODE
  /* "payment_source_login_unavailable" */ @js.native
  object PAYMENT_SOURCE_LOGIN_UNAVAILABLE extends TopLevel[PAYMENT_SOURCE_LOGIN_UNAVAILABLE with String]
  
  @js.native
  sealed trait PAYMENT_SOURCE_UNAVAILABLE extends ERROR_CODE
  /* "payment_source_unavailable" */ @js.native
  object PAYMENT_SOURCE_UNAVAILABLE extends TopLevel[PAYMENT_SOURCE_UNAVAILABLE with String]
  
  @js.native
  sealed trait PAY_LINK_ALREADY_USED extends ERROR_CODE
  /* "pay_link_already_used" */ @js.native
  object PAY_LINK_ALREADY_USED extends TopLevel[PAY_LINK_ALREADY_USED with String]
  
  @js.native
  sealed trait PAY_LINK_CANCELED extends ERROR_CODE
  /* "pay_link_canceled" */ @js.native
  object PAY_LINK_CANCELED extends TopLevel[PAY_LINK_CANCELED with String]
  
  @js.native
  sealed trait PAY_LINK_EXPIRED extends ERROR_CODE
  /* "pay_link_expired" */ @js.native
  object PAY_LINK_EXPIRED extends TopLevel[PAY_LINK_EXPIRED with String]
  
  @js.native
  sealed trait SANDBOX_ONLY extends ERROR_CODE
  /* "sandbox_only" */ @js.native
  object SANDBOX_ONLY extends TopLevel[SANDBOX_ONLY with String]
  
  @js.native
  sealed trait SERVER_ERROR extends ERROR_CODE
  /* "server_error" */ @js.native
  object SERVER_ERROR extends TopLevel[SERVER_ERROR with String]
  
  @js.native
  sealed trait TICKET_NOT_FOUND extends ERROR_CODE
  /* "ticket_not_found" */ @js.native
  object TICKET_NOT_FOUND extends TopLevel[TICKET_NOT_FOUND with String]
  
  @js.native
  sealed trait VALUE_TAKEN extends ERROR_CODE
  /* "value_taken" */ @js.native
  object VALUE_TAKEN extends TopLevel[VALUE_TAKEN with String]
}
