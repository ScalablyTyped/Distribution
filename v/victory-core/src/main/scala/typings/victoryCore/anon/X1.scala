package typings.victoryCore.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X1 extends StObject {
  
  var x1: Requireable[Double]
  
  var x2: Requireable[Double]
  
  var y1: Requireable[Double]
  
  var y2: Requireable[Double]
}
object X1 {
  
  inline def apply(x1: Requireable[Double], x2: Requireable[Double], y1: Requireable[Double], y2: Requireable[Double]): X1 = {
    val __obj = js.Dynamic.literal(x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[X1]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: X1] (val x: Self) extends AnyVal {
    
    inline def setX1(value: Requireable[Double]): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    inline def setX2(value: Requireable[Double]): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    inline def setY1(value: Requireable[Double]): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    inline def setY2(value: Requireable[Double]): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
  }
}
