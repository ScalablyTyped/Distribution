package typings.validator.mod.validator

import typings.validator.validatorStrings._empty
import typings.validator.validatorStrings.amex
import typings.validator.validatorStrings.dinersclub
import typings.validator.validatorStrings.discover
import typings.validator.validatorStrings.jcb
import typings.validator.validatorStrings.mastercard
import typings.validator.validatorStrings.unionpay
import typings.validator.validatorStrings.visa
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsCreditCardOptions extends StObject {
  
  /**
    * @default undefined
    */
  var provider: js.UndefOr[amex | dinersclub | discover | jcb | mastercard | unionpay | visa | _empty] = js.undefined
}
object IsCreditCardOptions {
  
  inline def apply(): IsCreditCardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsCreditCardOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsCreditCardOptions] (val x: Self) extends AnyVal {
    
    inline def setProvider(value: amex | dinersclub | discover | jcb | mastercard | unionpay | visa | _empty): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
  }
}
