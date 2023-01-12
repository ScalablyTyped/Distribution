package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeRemoteServices extends StObject {
  
  var includeRemoteServices: scala.Double
  
  var none: scala.Double
}
object IncludeRemoteServices {
  
  inline def apply(includeRemoteServices: scala.Double, none: scala.Double): IncludeRemoteServices = {
    val __obj = js.Dynamic.literal(includeRemoteServices = includeRemoteServices.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeRemoteServices]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IncludeRemoteServices] (val x: Self) extends AnyVal {
    
    inline def setIncludeRemoteServices(value: scala.Double): Self = StObject.set(x, "includeRemoteServices", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
