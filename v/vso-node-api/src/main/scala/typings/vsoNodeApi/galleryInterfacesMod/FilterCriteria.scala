package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterCriteria extends StObject {
  
  var filterType: Double
  
  /**
    * The value used in the match based on the filter type.
    */
  var value: String
}
object FilterCriteria {
  
  inline def apply(filterType: Double, value: String): FilterCriteria = {
    val __obj = js.Dynamic.literal(filterType = filterType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterCriteria]
  }
  
  extension [Self <: FilterCriteria](x: Self) {
    
    inline def setFilterType(value: Double): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
