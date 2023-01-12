package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CropOptions extends StObject {
  
  /**
    * The right edge of the cropping rectangle. The coordinate is calculated from the element's left edge.
    * If a negative number is passed, the coordinate is calculated from the element's right edge.
    */
  var bottom: js.UndefOr[Double] = js.undefined
  
  /**
    * The top edge of the cropping rectangle. The coordinate is calculated from the element's top edge.
    * If a negative number is passed, the coordinate is calculated from the element's bottom edge.
    */
  var left: js.UndefOr[Double] = js.undefined
  
  /**
    * The left edge of the cropping rectangle. The coordinate is calculated from the element's left edge.
    * If a negative number is passed, the coordinate is calculated from the element's right edge.
    */
  var right: js.UndefOr[Double] = js.undefined
  
  /**
    * The bottom edge of the cropping rectangle. The coordinate is calculated from the element's top edge.
    * If a negative number is passed, the coordinate is calculated from the element's bottom edge.
    */
  var top: js.UndefOr[Double] = js.undefined
}
object CropOptions {
  
  inline def apply(): CropOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CropOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CropOptions] (val x: Self) extends AnyVal {
    
    inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
