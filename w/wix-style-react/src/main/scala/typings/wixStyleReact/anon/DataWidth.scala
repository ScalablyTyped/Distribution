package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataWidth extends StObject {
  
  var data: js.Array[scala.Nothing]
  
  var width: Any
  
  var x: Any
  
  var y: Any
}
object DataWidth {
  
  inline def apply(data: js.Array[scala.Nothing], width: Any, x: Any, y: Any): DataWidth = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataWidth]
  }
  
  extension [Self <: DataWidth](x: Self) {
    
    inline def setData(value: js.Array[scala.Nothing]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: scala.Nothing*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setWidth(value: Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Any): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
