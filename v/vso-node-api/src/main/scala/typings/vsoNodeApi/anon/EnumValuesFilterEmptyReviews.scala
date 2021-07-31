package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesFilterEmptyReviews extends StObject {
  
  var enumValues: FilterEmptyReviews
}
object EnumValuesFilterEmptyReviews {
  
  @scala.inline
  def apply(enumValues: FilterEmptyReviews): EnumValuesFilterEmptyReviews = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesFilterEmptyReviews]
  }
  
  @scala.inline
  implicit class EnumValuesFilterEmptyReviewsMutableBuilder[Self <: EnumValuesFilterEmptyReviews] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: FilterEmptyReviews): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
