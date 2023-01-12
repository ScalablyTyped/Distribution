package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextRectangle extends StObject {
  
  /**
    * Y-coordinate, relative to the viewport origin, of the bottom of the rectangle box.
    */
  var bottom: Double
  
  /**
    * Height of the rectangle box (This is identical to `bottom` minus `top`).
    */
  var height: Double
  
  /**
    * X-coordinate, relative to the viewport origin, of the left of the rectangle box.
    */
  var left: Double
  
  /**
    *    X-coordinate, relative to the viewport origin, of the right of the rectangle box.
    */
  var right: Double
  
  /**
    * Y-coordinate, relative to the viewport origin, of the top of the rectangle box.
    */
  var top: Double
  
  /**
    * Width of the rectangle box (This is identical to `right` minus `left`).
    */
  var width: Double
}
object TextRectangle {
  
  inline def apply(bottom: Double, height: Double, left: Double, right: Double, top: Double, width: Double): TextRectangle = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextRectangle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextRectangle] (val x: Self) extends AnyVal {
    
    inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
