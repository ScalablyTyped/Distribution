package typings.validator.mod.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsNumericOptions extends StObject {
  
  /**
    * If `no_symbols` is true, the validator will reject numeric strings that feature a symbol (e.g. `+`, `-`, or `.`).
    *
    * @default false
    */
  var no_symbols: js.UndefOr[Boolean] = js.undefined
}
object IsNumericOptions {
  
  @scala.inline
  def apply(): IsNumericOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsNumericOptions]
  }
  
  @scala.inline
  implicit class IsNumericOptionsMutableBuilder[Self <: IsNumericOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNo_symbols(value: Boolean): Self = StObject.set(x, "no_symbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNo_symbolsUndefined: Self = StObject.set(x, "no_symbols", js.undefined)
  }
}
