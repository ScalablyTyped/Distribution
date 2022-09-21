package typings.tpdirect

import typings.tpdirect.anon.Ccv
import typings.tpdirect.tpdirectStrings.amex_
import typings.tpdirect.tpdirectStrings.jcb_
import typings.tpdirect.tpdirectStrings.mastercard_
import typings.tpdirect.tpdirectStrings.unionpay
import typings.tpdirect.tpdirectStrings.unknown
import typings.tpdirect.tpdirectStrings.visa_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResult extends StObject {
  
  /**
    * ```markdown
    * `true` means all fields are correct.
    * You may now call getPrime.
    * ```
    */
  var canGetPrime: Boolean
  
  var cardType: mastercard_ | visa_ | jcb_ | amex_ | unionpay | unknown
  
  /**
    * true means there is a error in one or more of fileds.
    */
  var hasError: Boolean
  
  var status: Ccv
}
object UpdateResult {
  
  inline def apply(
    canGetPrime: Boolean,
    cardType: mastercard_ | visa_ | jcb_ | amex_ | unionpay | unknown,
    hasError: Boolean,
    status: Ccv
  ): UpdateResult = {
    val __obj = js.Dynamic.literal(canGetPrime = canGetPrime.asInstanceOf[js.Any], cardType = cardType.asInstanceOf[js.Any], hasError = hasError.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResult]
  }
  
  extension [Self <: UpdateResult](x: Self) {
    
    inline def setCanGetPrime(value: Boolean): Self = StObject.set(x, "canGetPrime", value.asInstanceOf[js.Any])
    
    inline def setCardType(value: mastercard_ | visa_ | jcb_ | amex_ | unionpay | unknown): Self = StObject.set(x, "cardType", value.asInstanceOf[js.Any])
    
    inline def setHasError(value: Boolean): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Ccv): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
