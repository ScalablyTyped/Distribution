package typings.wixStyleReact.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X extends StObject {
  
  var x: Requireable[Double]
  
  var y: Requireable[Double]
}
object X {
  
  inline def apply(x: Requireable[Double], y: Requireable[Double]): X = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[X]
  }
  
  extension [Self <: X](x: Self) {
    
    inline def setX(value: Requireable[Double]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Requireable[Double]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
