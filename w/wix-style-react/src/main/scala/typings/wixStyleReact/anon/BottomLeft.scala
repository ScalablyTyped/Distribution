package typings.wixStyleReact.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BottomLeft extends StObject {
  
  var bottom: Requireable[Double]
  
  var left: Requireable[Double]
  
  var right: Requireable[Double]
  
  var top: Requireable[Double]
}
object BottomLeft {
  
  inline def apply(
    bottom: Requireable[Double],
    left: Requireable[Double],
    right: Requireable[Double],
    top: Requireable[Double]
  ): BottomLeft = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomLeft]
  }
  
  extension [Self <: BottomLeft](x: Self) {
    
    inline def setBottom(value: Requireable[Double]): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Requireable[Double]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Requireable[Double]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Requireable[Double]): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
