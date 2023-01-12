package typings.tabulatorTables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StarRatingParams
  extends StObject
     with _FormatterParams {
  
  // Star Rating
  var stars: js.UndefOr[Double] = js.undefined
}
object StarRatingParams {
  
  inline def apply(): StarRatingParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StarRatingParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StarRatingParams] (val x: Self) extends AnyVal {
    
    inline def setStars(value: Double): Self = StObject.set(x, "stars", value.asInstanceOf[js.Any])
    
    inline def setStarsUndefined: Self = StObject.set(x, "stars", js.undefined)
  }
}
