package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Large extends StObject {
  
  var large: scala.Double = js.native
  
  var medium: scala.Double = js.native
  
  var small: scala.Double = js.native
}
object Large {
  
  @scala.inline
  def apply(large: scala.Double, medium: scala.Double, small: scala.Double): Large = {
    val __obj = js.Dynamic.literal(large = large.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any])
    __obj.asInstanceOf[Large]
  }
  
  @scala.inline
  implicit class LargeMutableBuilder[Self <: Large] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLarge(value: scala.Double): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedium(value: scala.Double): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmall(value: scala.Double): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
  }
}
