package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Large extends StObject {
  
  var large: scala.Double
  
  var medium: scala.Double
  
  var small: scala.Double
}
object Large {
  
  inline def apply(large: scala.Double, medium: scala.Double, small: scala.Double): Large = {
    val __obj = js.Dynamic.literal(large = large.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any])
    __obj.asInstanceOf[Large]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Large] (val x: Self) extends AnyVal {
    
    inline def setLarge(value: scala.Double): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    
    inline def setMedium(value: scala.Double): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setSmall(value: scala.Double): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
  }
}
