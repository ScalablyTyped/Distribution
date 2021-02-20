package typings.winrt.Windows.UI.Input

import typings.winrt.Windows.Devices.Input.PointerDeviceType
import typings.winrt.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICrossSlidingEventArgs extends StObject {
  
  var crossSlidingState: CrossSlidingState = js.native
  
  var pointerDeviceType: PointerDeviceType = js.native
  
  var position: Point = js.native
}
object ICrossSlidingEventArgs {
  
  @scala.inline
  def apply(crossSlidingState: CrossSlidingState, pointerDeviceType: PointerDeviceType, position: Point): ICrossSlidingEventArgs = {
    val __obj = js.Dynamic.literal(crossSlidingState = crossSlidingState.asInstanceOf[js.Any], pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICrossSlidingEventArgs]
  }
  
  @scala.inline
  implicit class ICrossSlidingEventArgsMutableBuilder[Self <: ICrossSlidingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrossSlidingState(value: CrossSlidingState): Self = StObject.set(x, "crossSlidingState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerDeviceType(value: PointerDeviceType): Self = StObject.set(x, "pointerDeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
