package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeEmailAddress extends StObject {
  
  var includeEmailAddress: scala.Double
  
  var includeExtensions: scala.Double
  
  var none: scala.Double
}
object IncludeEmailAddress {
  
  inline def apply(includeEmailAddress: scala.Double, includeExtensions: scala.Double, none: scala.Double): IncludeEmailAddress = {
    val __obj = js.Dynamic.literal(includeEmailAddress = includeEmailAddress.asInstanceOf[js.Any], includeExtensions = includeExtensions.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeEmailAddress]
  }
  
  extension [Self <: IncludeEmailAddress](x: Self) {
    
    inline def setIncludeEmailAddress(value: scala.Double): Self = StObject.set(x, "includeEmailAddress", value.asInstanceOf[js.Any])
    
    inline def setIncludeExtensions(value: scala.Double): Self = StObject.set(x, "includeExtensions", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
