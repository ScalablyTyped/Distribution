package typings.swiper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentX extends StObject {
  
  var currentX: Double
  
  var currentY: Double
  
  var diff: Double
  
  var startX: Double
  
  var startY: Double
}
object CurrentX {
  
  inline def apply(currentX: Double, currentY: Double, diff: Double, startX: Double, startY: Double): CurrentX = {
    val __obj = js.Dynamic.literal(currentX = currentX.asInstanceOf[js.Any], currentY = currentY.asInstanceOf[js.Any], diff = diff.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentX]
  }
  
  extension [Self <: CurrentX](x: Self) {
    
    inline def setCurrentX(value: Double): Self = StObject.set(x, "currentX", value.asInstanceOf[js.Any])
    
    inline def setCurrentY(value: Double): Self = StObject.set(x, "currentY", value.asInstanceOf[js.Any])
    
    inline def setDiff(value: Double): Self = StObject.set(x, "diff", value.asInstanceOf[js.Any])
    
    inline def setStartX(value: Double): Self = StObject.set(x, "startX", value.asInstanceOf[js.Any])
    
    inline def setStartY(value: Double): Self = StObject.set(x, "startY", value.asInstanceOf[js.Any])
  }
}
