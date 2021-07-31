package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsOverlapping extends StObject {
  
  var isOverlapping: scala.Double
  
  var oK: scala.Double
}
object IsOverlapping {
  
  @scala.inline
  def apply(isOverlapping: scala.Double, oK: scala.Double): IsOverlapping = {
    val __obj = js.Dynamic.literal(isOverlapping = isOverlapping.asInstanceOf[js.Any], oK = oK.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsOverlapping]
  }
  
  @scala.inline
  implicit class IsOverlappingMutableBuilder[Self <: IsOverlapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsOverlapping(value: scala.Double): Self = StObject.set(x, "isOverlapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOK(value: scala.Double): Self = StObject.set(x, "oK", value.asInstanceOf[js.Any])
  }
}
