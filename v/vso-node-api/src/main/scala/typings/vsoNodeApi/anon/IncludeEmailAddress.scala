package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncludeEmailAddress extends StObject {
  
  var includeEmailAddress: scala.Double = js.native
  
  var includeExtensions: scala.Double = js.native
  
  var none: scala.Double = js.native
}
object IncludeEmailAddress {
  
  @scala.inline
  def apply(includeEmailAddress: scala.Double, includeExtensions: scala.Double, none: scala.Double): IncludeEmailAddress = {
    val __obj = js.Dynamic.literal(includeEmailAddress = includeEmailAddress.asInstanceOf[js.Any], includeExtensions = includeExtensions.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeEmailAddress]
  }
  
  @scala.inline
  implicit class IncludeEmailAddressMutableBuilder[Self <: IncludeEmailAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeEmailAddress(value: scala.Double): Self = StObject.set(x, "includeEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeExtensions(value: scala.Double): Self = StObject.set(x, "includeExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
