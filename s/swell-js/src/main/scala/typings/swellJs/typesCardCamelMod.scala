package typings.swellJs

import typings.swellJs.swellJsStrings.checked
import typings.swellJs.swellJsStrings.fail
import typings.swellJs.swellJsStrings.failed
import typings.swellJs.swellJsStrings.pass
import typings.swellJs.swellJsStrings.unchecked
import typings.swellJs.typesBillingMod.Billing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCardCamelMod {
  
  /* Inlined {[ K in keyof swell-js.CardSnake as swell-js.swell-js.SnakeToCamelCase<K> ]: swell-js.CardSnake[K]} */
  trait CardCamel extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var address_check: js.UndefOr[unchecked | pass | fail] = js.undefined
    
    var billing: js.UndefOr[Billing] = js.undefined
    
    var brand: js.UndefOr[String] = js.undefined
    
    var cvc_check: js.UndefOr[unchecked | pass | fail] = js.undefined
    
    var date_created: js.UndefOr[String] = js.undefined
    
    var date_updated: js.UndefOr[String] = js.undefined
    
    var exp_month: js.UndefOr[Double] = js.undefined
    
    var exp_year: js.UndefOr[Double] = js.undefined
    
    var fingerprint: js.UndefOr[String] = js.undefined
    
    var gateway: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var last4: js.UndefOr[String] = js.undefined
    
    var parent: js.UndefOr[Account] = js.undefined
    
    var parent_id: js.UndefOr[String] = js.undefined
    
    var test: js.UndefOr[Boolean] = js.undefined
    
    var token: String
    
    var zip_check: js.UndefOr[unchecked | pass | fail] = js.undefined
  }
  object CardCamel {
    
    inline def apply(token: String): CardCamel = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardCamel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardCamel] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAddress_check(value: unchecked | pass | fail): Self = StObject.set(x, "address_check", value.asInstanceOf[js.Any])
      
      inline def setAddress_checkUndefined: Self = StObject.set(x, "address_check", js.undefined)
      
      inline def setBilling(value: Billing): Self = StObject.set(x, "billing", value.asInstanceOf[js.Any])
      
      inline def setBillingUndefined: Self = StObject.set(x, "billing", js.undefined)
      
      inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
      
      inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
      
      inline def setCvc_check(value: unchecked | pass | fail): Self = StObject.set(x, "cvc_check", value.asInstanceOf[js.Any])
      
      inline def setCvc_checkUndefined: Self = StObject.set(x, "cvc_check", js.undefined)
      
      inline def setDate_created(value: String): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_createdUndefined: Self = StObject.set(x, "date_created", js.undefined)
      
      inline def setDate_updated(value: String): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDate_updatedUndefined: Self = StObject.set(x, "date_updated", js.undefined)
      
      inline def setExp_month(value: Double): Self = StObject.set(x, "exp_month", value.asInstanceOf[js.Any])
      
      inline def setExp_monthUndefined: Self = StObject.set(x, "exp_month", js.undefined)
      
      inline def setExp_year(value: Double): Self = StObject.set(x, "exp_year", value.asInstanceOf[js.Any])
      
      inline def setExp_yearUndefined: Self = StObject.set(x, "exp_year", js.undefined)
      
      inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
      
      inline def setGateway(value: String): Self = StObject.set(x, "gateway", value.asInstanceOf[js.Any])
      
      inline def setGatewayUndefined: Self = StObject.set(x, "gateway", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLast4(value: String): Self = StObject.set(x, "last4", value.asInstanceOf[js.Any])
      
      inline def setLast4Undefined: Self = StObject.set(x, "last4", js.undefined)
      
      inline def setParent(value: Account): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setParent_id(value: String): Self = StObject.set(x, "parent_id", value.asInstanceOf[js.Any])
      
      inline def setParent_idUndefined: Self = StObject.set(x, "parent_id", js.undefined)
      
      inline def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setZip_check(value: unchecked | pass | fail): Self = StObject.set(x, "zip_check", value.asInstanceOf[js.Any])
      
      inline def setZip_checkUndefined: Self = StObject.set(x, "zip_check", js.undefined)
    }
  }
  
  /* Inlined {[ K in keyof swell-js.InputCreateTokenSnake as swell-js.swell-js.SnakeToCamelCase<K> ]: swell-js.InputCreateTokenSnake[K]} */
  trait InputCreateTokenCamel extends StObject {
    
    var account_id: js.UndefOr[String] = js.undefined
    
    var billing: js.UndefOr[Billing] = js.undefined
    
    var cvc: js.UndefOr[Double] = js.undefined
    
    var exp_month: js.UndefOr[Double] = js.undefined
    
    var exp_year: js.UndefOr[Double] = js.undefined
    
    var number: js.UndefOr[String] = js.undefined
  }
  object InputCreateTokenCamel {
    
    inline def apply(): InputCreateTokenCamel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputCreateTokenCamel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputCreateTokenCamel] (val x: Self) extends AnyVal {
      
      inline def setAccount_id(value: String): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
      
      inline def setAccount_idUndefined: Self = StObject.set(x, "account_id", js.undefined)
      
      inline def setBilling(value: Billing): Self = StObject.set(x, "billing", value.asInstanceOf[js.Any])
      
      inline def setBillingUndefined: Self = StObject.set(x, "billing", js.undefined)
      
      inline def setCvc(value: Double): Self = StObject.set(x, "cvc", value.asInstanceOf[js.Any])
      
      inline def setCvcUndefined: Self = StObject.set(x, "cvc", js.undefined)
      
      inline def setExp_month(value: Double): Self = StObject.set(x, "exp_month", value.asInstanceOf[js.Any])
      
      inline def setExp_monthUndefined: Self = StObject.set(x, "exp_month", js.undefined)
      
      inline def setExp_year(value: Double): Self = StObject.set(x, "exp_year", value.asInstanceOf[js.Any])
      
      inline def setExp_yearUndefined: Self = StObject.set(x, "exp_year", js.undefined)
      
      inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    }
  }
  
  /* Inlined {[ K in keyof swell-js.TokenResponseSnake as swell-js.swell-js.SnakeToCamelCase<K> ]: swell-js.TokenResponseSnake[K]} */
  trait TokenResponseCamel extends StObject {
    
    var address_check: js.UndefOr[pass | failed | checked | unchecked] = js.undefined
    
    var brand: js.UndefOr[String] = js.undefined
    
    var cvc_check: js.UndefOr[pass | failed | checked | unchecked] = js.undefined
    
    var exp_month: js.UndefOr[Double] = js.undefined
    
    var exp_year: js.UndefOr[Double] = js.undefined
    
    var last4: js.UndefOr[String] = js.undefined
    
    var token: js.UndefOr[String] = js.undefined
    
    var zip_check: js.UndefOr[pass | failed | checked | unchecked] = js.undefined
  }
  object TokenResponseCamel {
    
    inline def apply(): TokenResponseCamel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokenResponseCamel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenResponseCamel] (val x: Self) extends AnyVal {
      
      inline def setAddress_check(value: pass | failed | checked | unchecked): Self = StObject.set(x, "address_check", value.asInstanceOf[js.Any])
      
      inline def setAddress_checkUndefined: Self = StObject.set(x, "address_check", js.undefined)
      
      inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
      
      inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
      
      inline def setCvc_check(value: pass | failed | checked | unchecked): Self = StObject.set(x, "cvc_check", value.asInstanceOf[js.Any])
      
      inline def setCvc_checkUndefined: Self = StObject.set(x, "cvc_check", js.undefined)
      
      inline def setExp_month(value: Double): Self = StObject.set(x, "exp_month", value.asInstanceOf[js.Any])
      
      inline def setExp_monthUndefined: Self = StObject.set(x, "exp_month", js.undefined)
      
      inline def setExp_year(value: Double): Self = StObject.set(x, "exp_year", value.asInstanceOf[js.Any])
      
      inline def setExp_yearUndefined: Self = StObject.set(x, "exp_year", js.undefined)
      
      inline def setLast4(value: String): Self = StObject.set(x, "last4", value.asInstanceOf[js.Any])
      
      inline def setLast4Undefined: Self = StObject.set(x, "last4", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      inline def setZip_check(value: pass | failed | checked | unchecked): Self = StObject.set(x, "zip_check", value.asInstanceOf[js.Any])
      
      inline def setZip_checkUndefined: Self = StObject.set(x, "zip_check", js.undefined)
    }
  }
}
