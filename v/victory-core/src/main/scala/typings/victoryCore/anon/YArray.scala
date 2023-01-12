package typings.victoryCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait YArray extends StObject {
  
  var x: js.Array[Any]
  
  var y: js.Array[Any]
}
object YArray {
  
  inline def apply(x: js.Array[Any], y: js.Array[Any]): YArray = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[YArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: YArray] (val x: Self) extends AnyVal {
    
    inline def setX(value: js.Array[Any]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXVarargs(value: Any*): Self = StObject.set(x, "x", js.Array(value*))
    
    inline def setY(value: js.Array[Any]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYVarargs(value: Any*): Self = StObject.set(x, "y", js.Array(value*))
  }
}
