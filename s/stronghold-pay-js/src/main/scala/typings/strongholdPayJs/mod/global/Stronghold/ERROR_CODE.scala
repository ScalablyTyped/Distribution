package typings.strongholdPayJs.mod.global.Stronghold

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ERROR_CODE extends StObject
@JSGlobal("Stronghold.ERROR_CODE")
@js.native
object ERROR_CODE extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ERROR_CODE with String] = js.native
  
  @js.native
  sealed trait CONNECTION_ERROR extends ERROR_CODE
  /* "connection_error" */ val CONNECTION_ERROR: typings.strongholdPayJs.mod.global.Stronghold.ERROR_CODE.CONNECTION_ERROR with String = js.native
  
  @js.native
  sealed trait CUSTOMER_BLOCKED extends ERROR_CODE
  /* "customer_blocked" */ val CUSTOMER_BLOCKED: typings.strongholdPayJs.mod.global.Stronghold.ERROR_CODE.CUSTOMER_BLOCKED with String = js.native
  
  @js.native
  sealed trait DISPENSARY_NOT_FOUND extends ERROR_CODE
  /* "dispensary_not_found" */ val DISPENSARY_NOT_FOUND: typings.strongholdPayJs.mod.global.Stronghold.ERROR_CODE.DISPENSARY_NOT_FOUND with String = js.native
  
  @js.native
  sealed trait FORBIDDEN_RESOURCE extends ERROR_CODE
  /* "forbidden_resource" */ val FORBIDDEN_RESOURCE: typings.strongholdPayJs.mod.global.Stronghold.ERROR_CODE.FORBIDDEN_RESOURCE with String = js.native
  
  @js.native
  sealed trait INSUFFICIENT_BALANCE extends ERROR_CODE
  /* "insufficient_balance" */ val INSUFFICIENT_BALANCE: typings.strongholdPayJs.mod.global.Stronghold.ERROR_CODE.INSUFFICIENT_BALANCE with String = js.native
  
  @js.native
  sealed trait INVALID_ACCESS_TOKEN extends ERROR_CODE
  /* "invalid_access_token" */ val INVALID_ACCESS_TOKEN: typings.strongholdPayJs.mod.global.Stronghold.ERROR_CODE.INVALID_ACCESS_TOKEN with String = js.native
  
  @js.native
  sealed trait INVALID_API_KEY extends ERROR_CODE
  /* "invalid_api_key" */ val INVALID_API_KEY: typings.strongholdPayJs.mod.global.Stronghold.ERROR_CODE.INVALID_API_KEY with String = js.native
  
  @js.native
  sealed trait INVALID_CHARGE_AMOUNT extends ERROR_CODE
  /* "invalid_charge_amount" */ val INVALID_CHARGE_AMOUNT: typings.strongholdPayJs.mod.global.Stronghold.ERROR_CODE.INVALID_CHARGE_AMOUNT with String = js.native
  
  @js.native
  sealed trait INVALID_FIELD extends ERROR_CODE
  /* "invalid_field" */ val INVALID_FIELD: typings.strongholdPayJs.mod.global.Stronghold.ERROR_CODE.INVALID_FIELD with String = js.native
  
  @js.native
  sealed trait INVALID_ID extends ERROR_CODE
  /* "invalid_id" */ val INVALID_ID: typings.strongholdPayJs.mod.global.Stronghold.ERROR_CODE.INVALID_ID with String = js.native
  
  @js.native
  sealed trait INVALID_OPERATION extends ERROR_CODE
  /* "invalid_operation" */ val INVALID_OPERATION: typings.strongholdPayJs.mod.global.Stronghold.ERROR_CODE.INVALID_OPERATION with String = js.native
  
  @js.native
  sealed trait LIVE_NOT_APPROVED extends ERROR_CODE
  /* "live_not_approved" */ val LIVE_NOT_APPROVED: typings.strongholdPayJs.mod.global.Stronghold.ERROR_CODE.LIVE_NOT_APPROVED with String = js.native
  
  @js.native
  sealed trait MERCHANT_SOFTWARE_ERROR extends ERROR_CODE
  /* "merchant_software_error" */ val MERCHANT_SOFTWARE_ERROR: typings.strongholdPayJs.mod.global.Stronghold.ERROR_CODE.MERCHANT_SOFTWARE_ERROR with String = js.native
  
  @js.native
  sealed trait MISSING_FIELD extends ERROR_CODE
  /* "missing_field" */ val MISSING_FIELD: typings.strongholdPayJs.mod.global.Stronghold.ERROR_CODE.MISSING_FIELD with String = js.native
  
  @js.native
  sealed trait NOT_FOUND extends ERROR_CODE
  /* "not_found" */ val NOT_FOUND: typings.strongholdPayJs.mod.global.Stronghold.ERROR_CODE.NOT_FOUND with String = js.native
  
  @js.native
  sealed trait PAYMENT_SOURCE_ACTION_REQUIRED extends ERROR_CODE
  /* "payment_source_action_required" */ val PAYMENT_SOURCE_ACTION_REQUIRED: typings.strongholdPayJs.mod.global.Stronghold.ERROR_CODE.PAYMENT_SOURCE_ACTION_REQUIRED with String = js.native
  
  @js.native
  sealed trait PAYMENT_SOURCE_ALREADY_EXISTS extends ERROR_CODE
  /* "payment_source_already_exists" */ val PAYMENT_SOURCE_ALREADY_EXISTS: typings.strongholdPayJs.mod.global.Stronghold.ERROR_CODE.PAYMENT_SOURCE_ALREADY_EXISTS with String = js.native
  
  @js.native
  sealed trait PAYMENT_SOURCE_INACTIVE extends ERROR_CODE
  /* "payment_source_inactive" */ val PAYMENT_SOURCE_INACTIVE: typings.strongholdPayJs.mod.global.Stronghold.ERROR_CODE.PAYMENT_SOURCE_INACTIVE with String = js.native
  
  @js.native
  sealed trait PAYMENT_SOURCE_LOGIN_REQUIRED extends ERROR_CODE
  /* "payment_source_login_required" */ val PAYMENT_SOURCE_LOGIN_REQUIRED: typings.strongholdPayJs.mod.global.Stronghold.ERROR_CODE.PAYMENT_SOURCE_LOGIN_REQUIRED with String = js.native
  
  @js.native
  sealed trait PAYMENT_SOURCE_LOGIN_UNAVAILABLE extends ERROR_CODE
  /* "payment_source_login_unavailable" */ val PAYMENT_SOURCE_LOGIN_UNAVAILABLE: typings.strongholdPayJs.mod.global.Stronghold.ERROR_CODE.PAYMENT_SOURCE_LOGIN_UNAVAILABLE with String = js.native
  
  @js.native
  sealed trait PAYMENT_SOURCE_UNAVAILABLE extends ERROR_CODE
  /* "payment_source_unavailable" */ val PAYMENT_SOURCE_UNAVAILABLE: typings.strongholdPayJs.mod.global.Stronghold.ERROR_CODE.PAYMENT_SOURCE_UNAVAILABLE with String = js.native
  
  @js.native
  sealed trait PAY_LINK_ALREADY_USED extends ERROR_CODE
  /* "pay_link_already_used" */ val PAY_LINK_ALREADY_USED: typings.strongholdPayJs.mod.global.Stronghold.ERROR_CODE.PAY_LINK_ALREADY_USED with String = js.native
  
  @js.native
  sealed trait PAY_LINK_CANCELED extends ERROR_CODE
  /* "pay_link_canceled" */ val PAY_LINK_CANCELED: typings.strongholdPayJs.mod.global.Stronghold.ERROR_CODE.PAY_LINK_CANCELED with String = js.native
  
  @js.native
  sealed trait PAY_LINK_EXPIRED extends ERROR_CODE
  /* "pay_link_expired" */ val PAY_LINK_EXPIRED: typings.strongholdPayJs.mod.global.Stronghold.ERROR_CODE.PAY_LINK_EXPIRED with String = js.native
  
  @js.native
  sealed trait SANDBOX_ONLY extends ERROR_CODE
  /* "sandbox_only" */ val SANDBOX_ONLY: typings.strongholdPayJs.mod.global.Stronghold.ERROR_CODE.SANDBOX_ONLY with String = js.native
  
  @js.native
  sealed trait SERVER_ERROR extends ERROR_CODE
  /* "server_error" */ val SERVER_ERROR: typings.strongholdPayJs.mod.global.Stronghold.ERROR_CODE.SERVER_ERROR with String = js.native
  
  @js.native
  sealed trait TICKET_NOT_FOUND extends ERROR_CODE
  /* "ticket_not_found" */ val TICKET_NOT_FOUND: typings.strongholdPayJs.mod.global.Stronghold.ERROR_CODE.TICKET_NOT_FOUND with String = js.native
  
  @js.native
  sealed trait VALUE_TAKEN extends ERROR_CODE
  /* "value_taken" */ val VALUE_TAKEN: typings.strongholdPayJs.mod.global.Stronghold.ERROR_CODE.VALUE_TAKEN with String = js.native
}
