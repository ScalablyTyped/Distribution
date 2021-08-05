package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Avsfailure extends StObject {
  
  /**
    * Whether Stripe automatically declines charges with an incorrect ZIP or
    * postal code. This setting only applies when a ZIP or postal code is
    * provided and they fail bank verification.
    */
  var avs_failure: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether Stripe automatically declines charges with an incorrect CVC.
    * This setting only applies when a CVC is provided and it fails bank
    * verification.
    */
  var cvc_failure: js.UndefOr[Boolean] = js.undefined
}
object Avsfailure {
  
  inline def apply(): Avsfailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Avsfailure]
  }
  
  extension [Self <: Avsfailure](x: Self) {
    
    inline def setAvs_failure(value: Boolean): Self = StObject.set(x, "avs_failure", value.asInstanceOf[js.Any])
    
    inline def setAvs_failureUndefined: Self = StObject.set(x, "avs_failure", js.undefined)
    
    inline def setCvc_failure(value: Boolean): Self = StObject.set(x, "cvc_failure", value.asInstanceOf[js.Any])
    
    inline def setCvc_failureUndefined: Self = StObject.set(x, "cvc_failure", js.undefined)
  }
}
