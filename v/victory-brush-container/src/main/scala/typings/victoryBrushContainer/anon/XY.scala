package typings.victoryBrushContainer.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XY extends StObject {
  
  var x: Requireable[js.Array[Any]]
  
  var y: Requireable[js.Array[Any]]
}
object XY {
  
  inline def apply(x: Requireable[js.Array[Any]], y: Requireable[js.Array[Any]]): XY = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[XY]
  }
  
  extension [Self <: XY](x: Self) {
    
    inline def setX(value: Requireable[js.Array[Any]]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Requireable[js.Array[Any]]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
