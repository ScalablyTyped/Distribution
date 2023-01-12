package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragToElementOptions
  extends StObject
     with MouseActionOptions {
  
  /**
    * Mouse pointer X coordinate that defines a point where the dragToElement action is finished.
    * If an offset is a positive integer, coordinates are calculated relative to the top-left corner of the destination element.
    * If an offset is a negative integer, they are calculated relative to the bottom-right corner.
    * By default, the dragToElement action is finished in the center of the destination element.
    */
  var destinationOffsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * Mouse pointer Y coordinate that defines a point where the dragToElement action is finished.
    * If an offset is a positive integer, coordinates are calculated relative to the top-left corner of the destination element.
    * If an offset is a negative integer, they are calculated relative to the bottom-right corner.
    * By default, the dragToElement action is finished in the center of the destination element.
    */
  var destinationOffsetY: js.UndefOr[Double] = js.undefined
}
object DragToElementOptions {
  
  inline def apply(): DragToElementOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragToElementOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DragToElementOptions] (val x: Self) extends AnyVal {
    
    inline def setDestinationOffsetX(value: Double): Self = StObject.set(x, "destinationOffsetX", value.asInstanceOf[js.Any])
    
    inline def setDestinationOffsetXUndefined: Self = StObject.set(x, "destinationOffsetX", js.undefined)
    
    inline def setDestinationOffsetY(value: Double): Self = StObject.set(x, "destinationOffsetY", value.asInstanceOf[js.Any])
    
    inline def setDestinationOffsetYUndefined: Self = StObject.set(x, "destinationOffsetY", js.undefined)
  }
}
