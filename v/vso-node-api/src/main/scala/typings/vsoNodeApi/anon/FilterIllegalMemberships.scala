package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterIllegalMemberships extends StObject {
  
  var filterIllegalMemberships: scala.Double
  
  var none: scala.Double
}
object FilterIllegalMemberships {
  
  inline def apply(filterIllegalMemberships: scala.Double, none: scala.Double): FilterIllegalMemberships = {
    val __obj = js.Dynamic.literal(filterIllegalMemberships = filterIllegalMemberships.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterIllegalMemberships]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterIllegalMemberships] (val x: Self) extends AnyVal {
    
    inline def setFilterIllegalMemberships(value: scala.Double): Self = StObject.set(x, "filterIllegalMemberships", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
