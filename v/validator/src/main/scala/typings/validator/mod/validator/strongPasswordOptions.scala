package typings.validator.mod.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Check if string is considered a strong password. Allows options to be added
  */
trait strongPasswordOptions extends StObject {
  
  var minLength: js.UndefOr[Double] = js.undefined
  
  var minLowercase: js.UndefOr[Double] = js.undefined
  
  var minNumbers: js.UndefOr[Double] = js.undefined
  
  var minSymbols: js.UndefOr[Double] = js.undefined
  
  var minUppercase: js.UndefOr[Double] = js.undefined
  
  var pointsForContainingLower: js.UndefOr[Double] = js.undefined
  
  var pointsForContainingNumber: js.UndefOr[Double] = js.undefined
  
  var pointsForContainingSymbol: js.UndefOr[Double] = js.undefined
  
  var pointsForContainingUpper: js.UndefOr[Double] = js.undefined
  
  var pointsPerRepeat: js.UndefOr[Double] = js.undefined
  
  var pointsPerUnique: js.UndefOr[Double] = js.undefined
  
  var returnScore: js.UndefOr[Boolean] = js.undefined
}
object strongPasswordOptions {
  
  inline def apply(): strongPasswordOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[strongPasswordOptions]
  }
  
  extension [Self <: strongPasswordOptions](x: Self) {
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    inline def setMinLowercase(value: Double): Self = StObject.set(x, "minLowercase", value.asInstanceOf[js.Any])
    
    inline def setMinLowercaseUndefined: Self = StObject.set(x, "minLowercase", js.undefined)
    
    inline def setMinNumbers(value: Double): Self = StObject.set(x, "minNumbers", value.asInstanceOf[js.Any])
    
    inline def setMinNumbersUndefined: Self = StObject.set(x, "minNumbers", js.undefined)
    
    inline def setMinSymbols(value: Double): Self = StObject.set(x, "minSymbols", value.asInstanceOf[js.Any])
    
    inline def setMinSymbolsUndefined: Self = StObject.set(x, "minSymbols", js.undefined)
    
    inline def setMinUppercase(value: Double): Self = StObject.set(x, "minUppercase", value.asInstanceOf[js.Any])
    
    inline def setMinUppercaseUndefined: Self = StObject.set(x, "minUppercase", js.undefined)
    
    inline def setPointsForContainingLower(value: Double): Self = StObject.set(x, "pointsForContainingLower", value.asInstanceOf[js.Any])
    
    inline def setPointsForContainingLowerUndefined: Self = StObject.set(x, "pointsForContainingLower", js.undefined)
    
    inline def setPointsForContainingNumber(value: Double): Self = StObject.set(x, "pointsForContainingNumber", value.asInstanceOf[js.Any])
    
    inline def setPointsForContainingNumberUndefined: Self = StObject.set(x, "pointsForContainingNumber", js.undefined)
    
    inline def setPointsForContainingSymbol(value: Double): Self = StObject.set(x, "pointsForContainingSymbol", value.asInstanceOf[js.Any])
    
    inline def setPointsForContainingSymbolUndefined: Self = StObject.set(x, "pointsForContainingSymbol", js.undefined)
    
    inline def setPointsForContainingUpper(value: Double): Self = StObject.set(x, "pointsForContainingUpper", value.asInstanceOf[js.Any])
    
    inline def setPointsForContainingUpperUndefined: Self = StObject.set(x, "pointsForContainingUpper", js.undefined)
    
    inline def setPointsPerRepeat(value: Double): Self = StObject.set(x, "pointsPerRepeat", value.asInstanceOf[js.Any])
    
    inline def setPointsPerRepeatUndefined: Self = StObject.set(x, "pointsPerRepeat", js.undefined)
    
    inline def setPointsPerUnique(value: Double): Self = StObject.set(x, "pointsPerUnique", value.asInstanceOf[js.Any])
    
    inline def setPointsPerUniqueUndefined: Self = StObject.set(x, "pointsPerUnique", js.undefined)
    
    inline def setReturnScore(value: Boolean): Self = StObject.set(x, "returnScore", value.asInstanceOf[js.Any])
    
    inline def setReturnScoreUndefined: Self = StObject.set(x, "returnScore", js.undefined)
  }
}
