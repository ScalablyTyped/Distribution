package typings.tabulatorTables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoneyParams
  extends StObject
     with _FormatterParams {
  
  // Money
  var decimal: js.UndefOr[String] = js.undefined
  
  var precision: js.UndefOr[Boolean | Double] = js.undefined
  
  var symbol: js.UndefOr[String] = js.undefined
  
  var symbolAfter: js.UndefOr[Boolean] = js.undefined
  
  var thousand: js.UndefOr[String] = js.undefined
}
object MoneyParams {
  
  inline def apply(): MoneyParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoneyParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MoneyParams] (val x: Self) extends AnyVal {
    
    inline def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
    
    inline def setDecimalUndefined: Self = StObject.set(x, "decimal", js.undefined)
    
    inline def setPrecision(value: Boolean | Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolAfter(value: Boolean): Self = StObject.set(x, "symbolAfter", value.asInstanceOf[js.Any])
    
    inline def setSymbolAfterUndefined: Self = StObject.set(x, "symbolAfter", js.undefined)
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    inline def setThousand(value: String): Self = StObject.set(x, "thousand", value.asInstanceOf[js.Any])
    
    inline def setThousandUndefined: Self = StObject.set(x, "thousand", js.undefined)
  }
}
