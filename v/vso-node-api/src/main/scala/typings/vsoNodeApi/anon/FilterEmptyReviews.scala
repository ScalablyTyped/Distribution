package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterEmptyReviews extends StObject {
  
  var filterEmptyReviews: scala.Double
  
  var filterEmptyUserNames: scala.Double
  
  var none: scala.Double
}
object FilterEmptyReviews {
  
  inline def apply(filterEmptyReviews: scala.Double, filterEmptyUserNames: scala.Double, none: scala.Double): FilterEmptyReviews = {
    val __obj = js.Dynamic.literal(filterEmptyReviews = filterEmptyReviews.asInstanceOf[js.Any], filterEmptyUserNames = filterEmptyUserNames.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterEmptyReviews]
  }
  
  extension [Self <: FilterEmptyReviews](x: Self) {
    
    inline def setFilterEmptyReviews(value: scala.Double): Self = StObject.set(x, "filterEmptyReviews", value.asInstanceOf[js.Any])
    
    inline def setFilterEmptyUserNames(value: scala.Double): Self = StObject.set(x, "filterEmptyUserNames", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
