package typings.victoryAxis.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Y extends StObject {
  
  var x: Requireable[js.Array[js.UndefOr[String | Null]]]
  
  var y: Requireable[js.Array[js.UndefOr[String | Null]]]
}
object Y {
  
  inline def apply(
    x: Requireable[js.Array[js.UndefOr[String | Null]]],
    y: Requireable[js.Array[js.UndefOr[String | Null]]]
  ): Y = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Y]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Y] (val x: Self) extends AnyVal {
    
    inline def setX(value: Requireable[js.Array[js.UndefOr[String | Null]]]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Requireable[js.Array[js.UndefOr[String | Null]]]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
