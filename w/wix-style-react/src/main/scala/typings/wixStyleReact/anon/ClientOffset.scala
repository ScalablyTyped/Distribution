package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientOffset extends StObject {
  
  var clientOffset: Any
  
  var hoverClientX: Double
  
  var hoverClientY: Double
  
  var hoverMiddleX: Double
  
  var hoverMiddleY: Double
}
object ClientOffset {
  
  inline def apply(
    clientOffset: Any,
    hoverClientX: Double,
    hoverClientY: Double,
    hoverMiddleX: Double,
    hoverMiddleY: Double
  ): ClientOffset = {
    val __obj = js.Dynamic.literal(clientOffset = clientOffset.asInstanceOf[js.Any], hoverClientX = hoverClientX.asInstanceOf[js.Any], hoverClientY = hoverClientY.asInstanceOf[js.Any], hoverMiddleX = hoverMiddleX.asInstanceOf[js.Any], hoverMiddleY = hoverMiddleY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOffset]
  }
  
  extension [Self <: ClientOffset](x: Self) {
    
    inline def setClientOffset(value: Any): Self = StObject.set(x, "clientOffset", value.asInstanceOf[js.Any])
    
    inline def setHoverClientX(value: Double): Self = StObject.set(x, "hoverClientX", value.asInstanceOf[js.Any])
    
    inline def setHoverClientY(value: Double): Self = StObject.set(x, "hoverClientY", value.asInstanceOf[js.Any])
    
    inline def setHoverMiddleX(value: Double): Self = StObject.set(x, "hoverMiddleX", value.asInstanceOf[js.Any])
    
    inline def setHoverMiddleY(value: Double): Self = StObject.set(x, "hoverMiddleY", value.asInstanceOf[js.Any])
  }
}
