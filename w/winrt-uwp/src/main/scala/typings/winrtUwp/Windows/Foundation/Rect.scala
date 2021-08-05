package typings.winrtUwp.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains number values that represent the location and size of a rectangle. */
trait Rect extends StObject {
  
  /** The height of the rectangle, in pixels. */
  var height: Double
  
  /** The width of the rectangle, in pixels. */
  var width: Double
  
  /** The x-coordinate of the upper-left corner of the rectangle. */
  var x: Double
  
  /** The y-coordinate of the upper-left corner of the rectangle. */
  var y: Double
}
object Rect {
  
  inline def apply(height: Double, width: Double, x: Double, y: Double): Rect = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rect]
  }
  
  extension [Self <: Rect](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
