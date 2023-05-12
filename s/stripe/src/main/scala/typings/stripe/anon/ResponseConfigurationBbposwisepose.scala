package typings.stripe.anon

import typings.stripe.mod.Stripe.Terminal.Configuration.BbposWiseposE
import typings.stripe.mod.Stripe.Terminal.Configuration.Tipping
import typings.stripe.mod.Stripe.Terminal.Configuration.VerifoneP400
import typings.stripe.stripeStrings.terminalDotconfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Terminal.Configuration> */
trait ResponseConfigurationBbposwisepose extends StObject {
  
  var bbpos_wisepos_e: js.UndefOr[BbposWiseposE] = js.undefined
  
  var deleted: js.UndefOr[Unit] = js.undefined
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  /**
    * Whether this Configuration is the default for your account
    */
  var is_account_default: Boolean | Null
  
  var lastResponse: ApiVersion
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: terminalDotconfiguration
  
  var tipping: js.UndefOr[Tipping] = js.undefined
  
  var verifone_p400: js.UndefOr[VerifoneP400] = js.undefined
}
object ResponseConfigurationBbposwisepose {
  
  inline def apply(id: String, lastResponse: ApiVersion, livemode: Boolean): ResponseConfigurationBbposwisepose = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], is_account_default = null)
    __obj.updateDynamic("object")("terminal.configuration")
    __obj.asInstanceOf[ResponseConfigurationBbposwisepose]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseConfigurationBbposwisepose] (val x: Self) extends AnyVal {
    
    inline def setBbpos_wisepos_e(value: BbposWiseposE): Self = StObject.set(x, "bbpos_wisepos_e", value.asInstanceOf[js.Any])
    
    inline def setBbpos_wisepos_eUndefined: Self = StObject.set(x, "bbpos_wisepos_e", js.undefined)
    
    inline def setDeleted(value: Unit): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIs_account_default(value: Boolean): Self = StObject.set(x, "is_account_default", value.asInstanceOf[js.Any])
    
    inline def setIs_account_defaultNull: Self = StObject.set(x, "is_account_default", null)
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setObject(value: terminalDotconfiguration): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setTipping(value: Tipping): Self = StObject.set(x, "tipping", value.asInstanceOf[js.Any])
    
    inline def setTippingUndefined: Self = StObject.set(x, "tipping", js.undefined)
    
    inline def setVerifone_p400(value: VerifoneP400): Self = StObject.set(x, "verifone_p400", value.asInstanceOf[js.Any])
    
    inline def setVerifone_p400Undefined: Self = StObject.set(x, "verifone_p400", js.undefined)
  }
}
