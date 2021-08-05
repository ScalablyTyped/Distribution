package typings.validator.mod.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsFloatOptions extends StObject {
  
  /**
    * greater than
    */
  var gt: js.UndefOr[Double] = js.undefined
  
  /**
    * FloatLocale
    */
  var locale: js.UndefOr[FloatLocale] = js.undefined
  
  /**
    * less than
    */
  var lt: js.UndefOr[Double] = js.undefined
  
  /**
    * greater or equal
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * less or equal
    */
  var min: js.UndefOr[Double] = js.undefined
}
object IsFloatOptions {
  
  inline def apply(): IsFloatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsFloatOptions]
  }
  
  extension [Self <: IsFloatOptions](x: Self) {
    
    inline def setGt(value: Double): Self = StObject.set(x, "gt", value.asInstanceOf[js.Any])
    
    inline def setGtUndefined: Self = StObject.set(x, "gt", js.undefined)
    
    inline def setLocale(value: FloatLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setLt(value: Double): Self = StObject.set(x, "lt", value.asInstanceOf[js.Any])
    
    inline def setLtUndefined: Self = StObject.set(x, "lt", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
