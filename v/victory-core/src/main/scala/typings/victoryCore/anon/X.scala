package typings.victoryCore.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X extends StObject {
  
  var x: Requireable[js.UndefOr[Double]]
  
  var y: Requireable[js.UndefOr[Double]]
}
object X {
  
  inline def apply(x: Requireable[js.UndefOr[Double]], y: Requireable[js.UndefOr[Double]]): X = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[X]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: X] (val x: Self) extends AnyVal {
    
    inline def setX(value: Requireable[js.UndefOr[Double]]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Requireable[js.UndefOr[Double]]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
