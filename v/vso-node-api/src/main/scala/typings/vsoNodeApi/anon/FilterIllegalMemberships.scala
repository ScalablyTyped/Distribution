package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterIllegalMemberships extends StObject {
  
  var filterIllegalMemberships: scala.Double = js.native
  
  var none: scala.Double = js.native
}
object FilterIllegalMemberships {
  
  @scala.inline
  def apply(filterIllegalMemberships: scala.Double, none: scala.Double): FilterIllegalMemberships = {
    val __obj = js.Dynamic.literal(filterIllegalMemberships = filterIllegalMemberships.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterIllegalMemberships]
  }
  
  @scala.inline
  implicit class FilterIllegalMembershipsMutableBuilder[Self <: FilterIllegalMemberships] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterIllegalMemberships(value: scala.Double): Self = StObject.set(x, "filterIllegalMemberships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
