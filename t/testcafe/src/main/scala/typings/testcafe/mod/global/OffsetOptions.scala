package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OffsetOptions
  extends StObject
     with ActionOptions {
  
  /**
    * Mouse pointer X coordinate that define a point where the action is performed or started.
    * If an offset is a positive integer, coordinates are calculated relative to the top-left corner of the target element.
    * If an offset is a negative integer, they are calculated relative to the bottom-right corner.
    * The default is the center of the target element.
    */
  var offsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * Mouse pointer Y coordinate that define a point where the action is performed or started.
    * If an offset is a positive integer, coordinates are calculated relative to the top-left corner of the target element.
    * If an offset is a negative integer, they are calculated relative to the bottom-right corner.
    * The default is the center of the target element.
    */
  var offsetY: js.UndefOr[Double] = js.undefined
}
object OffsetOptions {
  
  inline def apply(): OffsetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OffsetOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OffsetOptions] (val x: Self) extends AnyVal {
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
  }
}
