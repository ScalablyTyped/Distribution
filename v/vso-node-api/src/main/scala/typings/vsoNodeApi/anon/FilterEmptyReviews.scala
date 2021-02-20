package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterEmptyReviews extends StObject {
  
  var filterEmptyReviews: scala.Double = js.native
  
  var filterEmptyUserNames: scala.Double = js.native
  
  var none: scala.Double = js.native
}
object FilterEmptyReviews {
  
  @scala.inline
  def apply(filterEmptyReviews: scala.Double, filterEmptyUserNames: scala.Double, none: scala.Double): FilterEmptyReviews = {
    val __obj = js.Dynamic.literal(filterEmptyReviews = filterEmptyReviews.asInstanceOf[js.Any], filterEmptyUserNames = filterEmptyUserNames.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterEmptyReviews]
  }
  
  @scala.inline
  implicit class FilterEmptyReviewsMutableBuilder[Self <: FilterEmptyReviews] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterEmptyReviews(value: scala.Double): Self = StObject.set(x, "filterEmptyReviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterEmptyUserNames(value: scala.Double): Self = StObject.set(x, "filterEmptyUserNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
