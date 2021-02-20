package typings.winrt.Windows.UI.Input

import typings.winrt.Windows.Devices.Input.PointerDeviceType
import typings.winrt.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHoldingEventArgs extends StObject {
  
  var holdingState: HoldingState = js.native
  
  var pointerDeviceType: PointerDeviceType = js.native
  
  var position: Point = js.native
}
object IHoldingEventArgs {
  
  @scala.inline
  def apply(holdingState: HoldingState, pointerDeviceType: PointerDeviceType, position: Point): IHoldingEventArgs = {
    val __obj = js.Dynamic.literal(holdingState = holdingState.asInstanceOf[js.Any], pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHoldingEventArgs]
  }
  
  @scala.inline
  implicit class IHoldingEventArgsMutableBuilder[Self <: IHoldingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHoldingState(value: HoldingState): Self = StObject.set(x, "holdingState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerDeviceType(value: PointerDeviceType): Self = StObject.set(x, "pointerDeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
