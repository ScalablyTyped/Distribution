package typings.winrt.Windows.UI.Input

import typings.winrt.Windows.Devices.Input.PointerDeviceType
import typings.winrt.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICrossSlidingEventArgs extends StObject {
  
  var crossSlidingState: CrossSlidingState
  
  var pointerDeviceType: PointerDeviceType
  
  var position: Point
}
object ICrossSlidingEventArgs {
  
  inline def apply(crossSlidingState: CrossSlidingState, pointerDeviceType: PointerDeviceType, position: Point): ICrossSlidingEventArgs = {
    val __obj = js.Dynamic.literal(crossSlidingState = crossSlidingState.asInstanceOf[js.Any], pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICrossSlidingEventArgs]
  }
  
  extension [Self <: ICrossSlidingEventArgs](x: Self) {
    
    inline def setCrossSlidingState(value: CrossSlidingState): Self = StObject.set(x, "crossSlidingState", value.asInstanceOf[js.Any])
    
    inline def setPointerDeviceType(value: PointerDeviceType): Self = StObject.set(x, "pointerDeviceType", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
