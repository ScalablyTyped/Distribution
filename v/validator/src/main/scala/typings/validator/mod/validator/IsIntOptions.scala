package typings.validator.mod.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsIntOptions extends StObject {
  
  /**
    * if `false`, will disallow integer values with leading zeroes
    * @default true
    */
  var allow_leading_zeroes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * enforce integers being less than the value provided
    */
  var gt: js.UndefOr[Double] = js.undefined
  
  /**
    * enforce integers being greater than the value provided
    */
  var lt: js.UndefOr[Double] = js.undefined
  
  /**
    * to check the integer max boundary
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * to check the integer min boundary
    */
  var min: js.UndefOr[Double] = js.undefined
}
object IsIntOptions {
  
  inline def apply(): IsIntOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsIntOptions]
  }
  
  extension [Self <: IsIntOptions](x: Self) {
    
    inline def setAllow_leading_zeroes(value: Boolean): Self = StObject.set(x, "allow_leading_zeroes", value.asInstanceOf[js.Any])
    
    inline def setAllow_leading_zeroesUndefined: Self = StObject.set(x, "allow_leading_zeroes", js.undefined)
    
    inline def setGt(value: Double): Self = StObject.set(x, "gt", value.asInstanceOf[js.Any])
    
    inline def setGtUndefined: Self = StObject.set(x, "gt", js.undefined)
    
    inline def setLt(value: Double): Self = StObject.set(x, "lt", value.asInstanceOf[js.Any])
    
    inline def setLtUndefined: Self = StObject.set(x, "lt", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
