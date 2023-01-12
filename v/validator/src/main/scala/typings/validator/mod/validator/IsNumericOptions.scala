package typings.validator.mod.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsNumericOptions extends StObject {
  
  var locale: js.UndefOr[AlphaLocale] = js.undefined
  
  /**
    * If `no_symbols` is true, the validator will reject numeric strings that feature a symbol (e.g. `+`, `-`, or `.`).
    *
    * @default false
    */
  var no_symbols: js.UndefOr[Boolean] = js.undefined
}
object IsNumericOptions {
  
  inline def apply(): IsNumericOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsNumericOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsNumericOptions] (val x: Self) extends AnyVal {
    
    inline def setLocale(value: AlphaLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setNo_symbols(value: Boolean): Self = StObject.set(x, "no_symbols", value.asInstanceOf[js.Any])
    
    inline def setNo_symbolsUndefined: Self = StObject.set(x, "no_symbols", js.undefined)
  }
}
